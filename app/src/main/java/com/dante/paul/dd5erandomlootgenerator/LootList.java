package com.dante.paul.dd5erandomlootgenerator;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by PaulD on 2015-11-20.
 */
public class LootList {

    private Map<String, Integer> coins;
    private Map<String, Integer> loot;
    private int numberOfItems = 0;

    //Singleton pattern
    private static volatile  LootList list = new LootList();
    private LootList() {
        loot = new Hashtable<>();
        coins = new Hashtable<>();
    }
    public static LootList getInstance() {
        return list;
    }


    private void printTreasure(Map loot) {
        Set<String> keys = loot.keySet();
        for (String key : keys) {
            String currentLine = loot.get(key) + "x " + key + "\r\n";
            //TODO need to actually print out the treasure correctly
            System.out.println(currentLine);
        }
    }



    public void getTreasure() {
        printTreasure(getCoins());
        printTreasure(getLoot());
    }


    //Takes a magic item and puts it in the loot list
    public void addToLoot(String item) {
        if (loot.containsKey(item)) {
            numberOfItems = loot.get(item);
            loot.put(item, numberOfItems + 1);
        } else
            loot.put(item, 1);
    }

    //Takes a pile of coins and adds it to the loot list
    public void addToCoins(String coin, int numberOfCoins) {
        numberOfCoins = numberOfCoins + coins.get(coin);
        coins.put(coin, numberOfCoins);
    }

    public Map getCoins() {
        return coins;
    }

    public Map getLoot() {
        return loot;
    }

    public void deleteAll(){
        coins.clear();
        loot.clear();
    }


}