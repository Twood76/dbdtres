package com.dante.paul.dd5erandomlootgenerator;

/**
 * Created by PaulD on 2015-12-01.
 */

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfEncounter;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.Treasure;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Coins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.GemsArtAndMagicItems;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.HoardCoins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.IndividualCoins;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JUnitTest {
    @Before public void initializeList(){
        LootList list = LootList.getInstance();
        list.getCoins().clear();
        list.getLoot().clear();
    }
    @Test
    public void generateRandomDiceRoll(){
        Dice d = new Dice();
        int test1 = d.roll(100);
        System.out.println(test1);
        int test2 = d.roll(10, 4);
        assertTrue(test1 > 0);
        assertTrue(test2 > 9 && test2 < 41);
    }
    @Test
    public void generateIndividualCoins() throws Exception {
        LootList list = LootList.getInstance();
        Dice d = new Dice();
        int number = d.roll(100);
        Coins coins = new IndividualCoins(ChallengeRating.FIVE, number);
        coins.createStuff();
        Set<String> keys = list.getCoins().keySet();
        for(String key: keys){
            System.out.println(list.getCoins().get(key) + key);
        }
        System.out.println("Finish Individual Coin");
        assertNotNull(list.getCoins());
    }
    @Test
    public void generateHoardCoins() throws Exception {
        LootList list = LootList.getInstance();
        list.getCoins().clear();
        list.getLoot().clear();
        Dice d = new Dice();
        int number = d.roll(100);
        Coins coins = new HoardCoins(ChallengeRating.FIVE, number);
        coins.createStuff();
        Set<String> keys = list.getCoins().keySet();
        for(String key: keys){
            System.out.println(list.getCoins().get(key)  + key);
        }
        System.out.println("Finish Hoard Coins");
        assertNotNull(list.getCoins());
    }
    @Test
    public void generateHoardItems() throws Exception {
        LootList list = LootList.getInstance();
        Dice d = new Dice();
        int number = d.roll(100);
        GemsArtAndMagicItems gemsArtAndMagicItems = new GemsArtAndMagicItems(ChallengeRating.ZERO,number);
        gemsArtAndMagicItems.createStuff();
        Set<String> keys = list.getLoot().keySet();
        for(String key: keys){
            System.out.println(list.getLoot().get(key) + "x "+ key);
        }
        System.out.println("Finished Hoard Items");
        assertNotNull(list);
    }
    @Test
    public void generateHoardTreasure() throws Exception{
        System.out.println("Single Hoard Treasure");
        LootList list = LootList.getInstance();
        list.getCoins().clear();
        list.getLoot().clear();
        Treasure treasure = new Treasure(ChallengeRating.ZERO, TypeOfEncounter.HORDE,1);
        treasure.generateTreasure();
        assertNotNull(list);
    }

    @Test
    public void generateMultipleHoardTreasures() throws Exception{
        System.out.println("Multi-Hoard Treasure");
        LootList list = LootList.getInstance();
        list.getCoins().clear();
        list.getLoot().clear();

        Treasure treasure = new Treasure(ChallengeRating.ZERO, TypeOfEncounter.HORDE,1000);
        treasure.generateTreasure();

        System.out.println("End of huge Hoard Treasure");
    }
}
