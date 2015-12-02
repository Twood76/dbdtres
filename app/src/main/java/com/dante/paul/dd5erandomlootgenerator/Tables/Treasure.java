package com.dante.paul.dd5erandomlootgenerator.Tables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypesOfCoins;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.LootList;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Coins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.GemsArtAndMagicItems;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.HordeCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.IndividualCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Loot;


import java.util.Random;

/**
 * Created by PaulD on 2015-11-20.
 */
public class Treasure implements TreasureTable {
    protected ChallengeRating challengeRating;
    protected int d100;
    protected Dice d;
    protected TypeOfEncounter toE;
    public LootList list;

    public Treasure(ChallengeRating challengeRating, TypeOfEncounter toE) {
        this.challengeRating = challengeRating;
        d100 = d.roll(100);
        list = LootList.getInstance();
        this.toE = toE;
    }

    public LootList generateTreasure(LootList list){
        generateCoins(list);
        if (toE == TypeOfEncounter.HORDE)
        generateItems(list);

        return list;
    }

    private LootList generateCoins(LootList list) {
        if (toE == TypeOfEncounter.INDIVIDUAL) {
            Loot coins = new IndividualCoins(challengeRating, d100);
            coins.createStuff();
            return list;
        } else {
            Loot coins = new HordeCoins(challengeRating, d100);
            coins.createStuff();
            Loot items = new GemsArtAndMagicItems(challengeRating, d100);
            items.createStuff();
        }
        return list;
    }
    private LootList generateItems(LootList list){
        Loot items = new GemsArtAndMagicItems(challengeRating, d100);
        items.createStuff();
        return list;
    }
}
