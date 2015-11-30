package com.dante.paul.dd5erandomlootgenerator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by PaulD on 2015-11-20.
 */
public class LootList {

    private Map<String,Integer> coins;
    private Map<String, Integer> loot;
    private int numberOfItems = 0;

    public LootList() {
        loot = new Hashtable<>();
        coins = new Hashtable<>();
    }

    public void getTreasure(){
        printTreasure(getCoins());
        printTreasure(getLoot());
    }

    private void printTreasure(Map loot) {
        Set<String> keys = loot.keySet();
        for (String key: keys){
            String currentLine = loot.get(key) + "x " + key + "\r\n";
            //TODO need to actually print out the treasure correctly
            System.out.println(currentLine);
        }
    }


    public void addToLoot(String item) {
        if (loot.containsKey(item)) {
            numberOfItems = loot.get(item);
            loot.put(item, numberOfItems + 1);
        } else
            loot.put(item,1);
    }
    public void addToCoins(String coin, int numberOfCoins){
        coins.put(coin,numberOfCoins);
    }
    private Map getCoins(){
        return coins;
    }
    private Map getLoot() {
        return loot;
    }
}
