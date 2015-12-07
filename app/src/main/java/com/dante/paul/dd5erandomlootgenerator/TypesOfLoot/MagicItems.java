package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.Loot;

/**
 * Created by PaulD on 2015-11-20.
 */
public class MagicItems extends Loot {

    public MagicItems(ChallengeRating challengeRating, int d100, TypeOfEncounter typeOfEncounter) {
        super(challengeRating, d100, typeOfEncounter);
    }

    @Override
    public void createStuff() {
    }
}
