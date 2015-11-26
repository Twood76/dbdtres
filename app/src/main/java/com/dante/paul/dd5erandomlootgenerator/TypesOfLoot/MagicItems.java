package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.LootList;

/**
 * Created by PaulD on 2015-11-20.
 */
public class MagicItems extends Loot {

    public MagicItems(ChallengeRating challengeRating, LootList lootList, int d100) {
        super(challengeRating, lootList, d100);
    }

    @Override
    public LootList createStuff() {
        return list;
    }
}
