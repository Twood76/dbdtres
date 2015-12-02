package com.dante.paul.dd5erandomlootgenerator;

/**
 * Created by PaulD on 2015-12-01.
 */

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.Coins;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.IndividualCoins;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class JUnitTest {

    @Test
    public void generateRandomDiceRoll(){
        Dice d = new Dice();
        int test1 = d.roll(100);
        System.out.println(test1);
        int test2 = d.roll(10,4);
        assertTrue(test1 > 0);
        assertTrue(test2 > 9 && test2 <41);
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
        assertNotNull(list.getCoins());
    }

}
