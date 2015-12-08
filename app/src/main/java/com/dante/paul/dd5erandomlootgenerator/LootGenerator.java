package com.dante.paul.dd5erandomlootgenerator;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toolbar;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.Treasure;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.GenerateLootMessage;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.AbstractSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.BardSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.ClericSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.DruidSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.PaladinSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.RangerSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.SorcererSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.WarlockSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.WizardSpells;

import java.util.ArrayList;
import java.util.List;

public class LootGenerator extends AppCompatActivity {
    RadioGroup typeOfEncounter;
    Spinner challengeSpinner, levelSpinner, classSpinner, iterationSpinner;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loot_generator);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        //setup the CHALLENGE LEVEL SPINNER--------------------------------------------------------
        challengeSpinner = (Spinner) findViewById(R.id.challenge_spinner);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> challengeAdapter = ArrayAdapter
                .createFromResource(this, R.array.challenge_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        challengeAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        challengeSpinner.setAdapter(challengeAdapter);


        //setup the ITERATION SPINNER--------------------------------------------------------------
        List iterations = new ArrayList<Integer>();
        for (int i = 1; i <= 500; i++) {
            iterations.add(Integer.toString(i));
        }
        ArrayAdapter<Integer> iterationAdapter = new ArrayAdapter<Integer>(
                this, android.R.layout.simple_spinner_item, iterations);
        iterationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        iterationSpinner = (Spinner) findViewById(R.id.iteration_spinner);
        iterationSpinner.setAdapter(iterationAdapter);

        //setup the SPELL LEVEL SPINNER------------------------------------------------------------
        levelSpinner = (Spinner) findViewById(R.id.level_spinner);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> levelAdapter = ArrayAdapter
                .createFromResource(this, R.array.level_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        levelAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        levelSpinner.setAdapter(levelAdapter);


        //setup the SPELL CLASS SPINNER------------------------------------------------------------
        classSpinner = (Spinner) findViewById(R.id.class_spinner);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter
                .createFromResource(this, R.array.class_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        classAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        classSpinner.setAdapter(classAdapter);

        typeOfEncounter = (RadioGroup) findViewById(R.id.radio_encounter);

    }

    public void generateTreasure(View view) {
        String lootSummary;
        LootList list = LootList.getInstance();
        list.deleteAll();
        Treasure treasure;
        String challengeRatingString = challengeSpinner.getSelectedItem().toString();
        ChallengeRating challengeRating = getChallengeRating(challengeRatingString);
        int iterations = Integer.parseInt(iterationSpinner.getSelectedItem().toString());
        switch (typeOfEncounter.getCheckedRadioButtonId()) {
            case R.id.radio_individual:
                treasure = new Treasure(challengeRating, TypeOfEncounter.INDIVIDUAL, iterations);
                treasure.generateTreasure();
                lootSummary = "Challenge Level " + challengeRatingString + "\nIndividual Treasure ";
                lootSummary += " x" + iterations;
                break;
            default:
                treasure = new Treasure(challengeRating, TypeOfEncounter.HORDE, iterations);
                treasure.generateTreasure();
                lootSummary = "Challenge Level " + challengeRatingString + "\nHorde Treasure ";
                lootSummary += " x" + iterations;
        }

        DialogFragment how = new GenerateLootMessage();
        Bundle args = new Bundle();

        args.putString("loot_summary", lootSummary);
        args.putString("loot", list.getTreasure());
        how.setArguments(args);
        how.show(getFragmentManager(), "tag");

    }

    public void generateItem(View view) {
        String lootSummary;
        String loot;
        String challengeRatingString = challengeSpinner.getSelectedItem().toString();
        ChallengeRating challengeRating = getChallengeRating(challengeRatingString);

        int iterations = Integer.parseInt(iterationSpinner.getSelectedItem().toString());
        GenerateItem treasure = new GenerateItem(iterations);
        loot = treasure.generateItem(challengeRating);
        lootSummary = "Challenge Level " + challengeRatingString + "\nIndividual Item ";
            lootSummary += " x" + iterations;

        DialogFragment how = new GenerateLootMessage();
        Bundle args = new Bundle();

        args.putString("loot_summary", lootSummary);
        args.putString("loot", loot);
        how.setArguments(args);
        how.show(getFragmentManager(), "tag");

    }

    public void generateSpell(View view) {
        String spells;
        int level = -1;
        AbstractSpells casterType;
        GenerateSpell generateSpell;
        String levelString = levelSpinner.getSelectedItem().toString();
        if (!levelString.equals("Random"))
            level = Integer.parseInt(levelString);
        String casterTypeString = classSpinner.getSelectedItem().toString();
        if (!casterTypeString.equals("Random")) {
            casterType = getCasterType(casterTypeString);
            if (level == -1)
                generateSpell = new GenerateSpell(casterType, casterTypeString);
            else
                generateSpell = new GenerateSpell(casterType, casterTypeString, level);
        }else {
            if (level == -1)
                generateSpell = new GenerateSpell();
            else
                generateSpell = new GenerateSpell(level);
        }
        String lootSummary ="Generated Spell";
        GenerateSpellStrings generatedSpellStrings = generateSpell.generateSpell();
        String loot = generatedSpellStrings.getSpellCLass() + " " + generatedSpellStrings.getLevel() + "\r\n  " + generatedSpellStrings.getName() + "\r\n" + generatedSpellStrings.getMagicItemtable() + "\r\n";
        DialogFragment how = new GenerateLootMessage();
        Bundle args = new Bundle();

        args.putString("loot_summary", lootSummary);
        args.putString("loot", loot);
        how.setArguments(args);
        how.show(getFragmentManager(), "tag");
    }

    private ChallengeRating getChallengeRating(String challengeRatingString) {
        ChallengeRating challengeRating;
        switch (challengeRatingString) {
            case "0-4":
                challengeRating = ChallengeRating.ZERO;
                break;
            case "5-10":
                challengeRating = ChallengeRating.FIVE;
                break;
            case "12-16":
                challengeRating = ChallengeRating.ELEVEN;
                break;
            default:
                challengeRating = ChallengeRating.SEVENTEEN;
                break;
        }
        return challengeRating;
    }

    private AbstractSpells getCasterType(String casterTypeString) {
        switch (casterTypeString) {
            case "Bard":
                return new BardSpells();
            case "Cleric":
                return new ClericSpells();
            case "Druid":
                return new DruidSpells();
            case "Paladin":
                return new PaladinSpells();
            case "Ranger":
                return new RangerSpells();
            case "Sorcerer":
                return new SorcererSpells();
            case "Warlock":
                return new WarlockSpells();
            default:
                return new WizardSpells();
        }
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }
}
