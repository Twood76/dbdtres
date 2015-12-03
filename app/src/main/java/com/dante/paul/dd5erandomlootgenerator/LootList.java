package com.dante.paul.dd5erandomlootgenerator;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables.ArtTableObject;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables.GemTableObject;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables.TableObject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by PaulD on 2015-11-20.
 */
public class LootList {

    private Map<String, Integer> coins = new HashMap<>();
    private Map<String, Integer> loot = new HashMap<>();
    private Map<String, Integer> gems = new HashMap<>();
    private Map<String, Integer> art = new HashMap<>();
    private int numberOfItems = 0;

    //Singleton pattern
    private static volatile LootList list = new LootList();

    private LootList() {
        loot = new Hashtable<>();
        coins = new Hashtable<>();
    }

    public static LootList getInstance() {
        return list;
    }

    private void printCoins (){
        Set<String> keys = coins.keySet();
        for (String key : keys) {
            String currentLine = coins.get(key) + key + "\r\n";
            //TODO need to actually print out the treasure correctly
            System.out.print(currentLine);
        }
    }

    private int printTreasure(Map storage) {
        int count = 0;
        Set<String> keys = storage.keySet();
        for (String key : keys) {
            String currentLine = storage.get(key) + "x " + key + "\r\n";
            //TODO need to actually print out the treasure correctly
            System.out.print(currentLine);
            count += (Integer) storage.get(key);
        }
    return count;
    }


    public void getTreasure() {
        int count;
        System.out.println("Coins");
        printCoins();
        System.out.println();
        System.out.println("Gems");
        count = printTreasure(getGems());
        System.out.println("Gem Total = " + count);
        System.out.println();
        System.out.println("Art");
        count = printTreasure(getArt());
        System.out.println("Art Total = " + count);
        System.out.println("");
        System.out.println("Magic Items");
        count = printTreasure(getLoot());
        System.out.println("Magic Item Total Total = " + count);
    }


    //Takes a magic item and puts it in the loot list
    public void addToLoot(TableObject item) {
        Map<String,Integer> storage;
        if (item.getClass() == ArtTableObject.class)
            storage = art;
        else if (item.getClass() == GemTableObject.class)
            storage = gems;
        else
            storage = loot;
        if (storage.containsKey(item.itemName)) {
            numberOfItems = storage.get(item.itemName);
            storage.put(item.itemName, numberOfItems + item.numberOfItem);
        } else
            storage.put(item.itemName, item.numberOfItem);
    }


    //Takes a pile of coins and adds it to the loot list
    public void addToCoins(String coin, int numberOfCoins) {
        if (!coins.isEmpty())
            if (coins.containsKey(coin))
                numberOfCoins = numberOfCoins + coins.get(coin);
        coins.put(coin, numberOfCoins);
    }

    public Map getCoins() {
        return coins;
    }

    public Map getLoot() {
        return loot;
    }

    public Map getGems() { return gems; }

    public Map getArt() { return art;}

    public void deleteAll() {
        coins.clear();
        loot.clear();
    }


}