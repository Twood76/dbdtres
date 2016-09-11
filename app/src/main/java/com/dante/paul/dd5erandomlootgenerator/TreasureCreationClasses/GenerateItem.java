package com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.LootList;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.JustMagicItems;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.Loot;


/**
 * Created by PaulD on 2015-12-03.
 */
public class GenerateItem implements TreasureTable{
    protected ChallengeRating challengeRating;
    protected int d100;
    protected Dice d = new Dice();
    public LootList list;
    int numberOfItems;

    public GenerateItem(ChallengeRating challengeRating,int numberOfItems) {
        this.numberOfItems = numberOfItems;
        this.challengeRating = challengeRating;
        list = LootList.getInstance();
    }


    @Override
    public void generateTreasure() {
        d100 = d.roll(100);
        generateItems();
        list.getItems();
    }
    private void generateItems(){
        for(int counter = 0; counter < numberOfItems; counter++) {
            Loot items = new JustMagicItems(challengeRating, d100);
            items.createStuff();
        }
    }
}
