package com.dante.paul.dd5erandomlootgenerator;

/**
 * Created by PaulD on 2015-11-20.
 */
public class LootList {

    private int[] coins;
    private String[] loot;
    private int numberOfItems = 0;

    public void loot(){
        loot = new String[50];
        coins = new int[5];
    }

    public String[] getLoot() {
        return loot;
    }

    public void addToLoot(String item) {
        loot[numberOfItems]= item;
        numberOfItems++;
    }
    public void addToCoins(int coin, int numberOfCoins){
        coins[coin]=numberOfCoins;
    }
    public int[] getCoins(){
        return coins;
    }
}
