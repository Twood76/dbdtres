package com.dante.paul.dd5erandomlootgenerator;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.Treasure;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.GenerateLootMessage;

import java.util.ArrayList;
import java.util.List;

public class LootGenerator extends AppCompatActivity {
    RadioGroup typeOfEncounter;
    Spinner challengeSpinner, levelSpinner, classSpinner, iterationSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loot_generator);


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
        Treasure treasure;
        String challengeRatingString = challengeSpinner.getSelectedItem().toString();
        ChallengeRating challengeRating = getChallengeRating(challengeRatingString);
        int iterations = (Integer) iterationSpinner.getSelectedItem();

        switch(typeOfEncounter.getCheckedRadioButtonId()){
            case R.id.radio_individual:
            treasure = new Treasure(challengeRating, TypeOfEncounter.INDIVIDUAL, iterations);
            treasure.generateTreasure();
            lootSummary = "Individual Treasure Level " + challengeRatingString + " run ";
            if (iterations == 1)
                lootSummary += iterations + " time";
            else
                lootSummary += iterations + " times";
             break;
        default:
            treasure = new Treasure(challengeRating, TypeOfEncounter.HORDE, iterations);
            treasure.generateTreasure();
            lootSummary = "Horde Treasure Level " + challengeRatingString + " run ";
            if (iterations == 1)
                lootSummary += iterations + " time";
            else
                lootSummary += iterations + " times";
        }
        LootList list = LootList.getInstance();
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

        int iterations = (Integer) iterationSpinner.getSelectedItem();
        GenerateItem treasure = new GenerateItem(iterations);
        loot = treasure.generateItem(challengeRating);
        lootSummary = "Individual Items Level " + challengeRatingString + " run ";
        if (iterations == 1)
            lootSummary += iterations + " time";
        else
            lootSummary += iterations + " times";

        DialogFragment how = new GenerateLootMessage();
        Bundle args = new Bundle();

        args.putString("loot_summary", lootSummary);
        args.putString("loot", loot);
        how.setArguments(args);
        how.show(getFragmentManager(), "tag");

    }
    public void generateSpell(View view){
        String spells;
        int iterations = (Integer) iterationSpinner.getSelectedItem();
        int level = (Integer) levelSpinner.getSelectedItem();
        GenerateSpell generateSpell = new GenerateSpell();
    }
    private ChallengeRating getChallengeRating(String challengeRatingString) {
        ChallengeRating challengeRating;
        if (challengeRatingString.equals("0-4"))
            challengeRating = ChallengeRating.ZERO;
        else if (challengeRatingString.equals("5-10"))
            challengeRating = ChallengeRating.FIVE;
        else if (challengeRatingString.equals("12-16"))
            challengeRating = ChallengeRating.ELEVEN;
        else
            challengeRating = ChallengeRating.SEVENTEEN;

        return challengeRating;
    }
}
