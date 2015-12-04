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
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.Treasure;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.GenerateLootMessage;

import java.util.ArrayList;
import java.util.List;

public class LootGenerator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loot_generator);

        Spinner staticSpinner = (Spinner) findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.challenge_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner.setAdapter(staticAdapter);

        List iterations = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            iterations.add(Integer.toString(i));
        }
        ArrayAdapter<Integer> spinnerArrayAdapter = new ArrayAdapter<Integer>(
                this, android.R.layout.simple_spinner_item, iterations);
        spinnerArrayAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        Spinner spinner = (Spinner)findViewById(R.id.iteration_spinner);
        spinner.setAdapter(spinnerArrayAdapter);

    }

    public void generateTreasure(View view){
        String lootSummary;
        Spinner challengeSpinner=(Spinner) findViewById(R.id.spinner);
        String challengeRatingString = challengeSpinner.getSelectedItem().toString();
        ChallengeRating challengeRating = getChallengeRating(challengeRatingString);
        Spinner iterationSpinner=(Spinner) findViewById(R.id.iteration_spinner);

        int iterations = (Integer) iterationSpinner.getSelectedItem();

        RadioGroup encounterRadio = (RadioGroup) findViewById(R.id.radio_encounter);
        int encounterTypeId = encounterRadio.getCheckedRadioButtonId();
        if (encounterTypeId == findViewById(R.id.radio_individual).getId()){
            Treasure treasure = new Treasure(challengeRating, TypeOfEncounter.INDIVIDUAL,iterations);
            treasure.generateTreasure();
            lootSummary = "Individual Treasure Level " + challengeRatingString + " run ";
            if (iterations == 1)
                lootSummary += iterations + " time";
            else
                lootSummary += iterations + " times";
        } else{
            Treasure treasure = new Treasure(challengeRating, TypeOfEncounter.HORDE,iterations);
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

        args.putString("title", lootSummary);
        args.putString("fail_message", list.getTreasure());
        how.setArguments(args);
        how.show(getFragmentManager(), "tag");

    }

    public void generateItem(View view){
        String lootSummary;
        String loot;
        Spinner challengeSpinner=(Spinner) findViewById(R.id.spinner);
        String challengeRatingString = challengeSpinner.getSelectedItem().toString();
        ChallengeRating challengeRating = getChallengeRating(challengeRatingString);
        Spinner iterationSpinner=(Spinner) findViewById(R.id.iteration_spinner);

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

    public ChallengeRating getChallengeRating(String challengeRatingString){
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
