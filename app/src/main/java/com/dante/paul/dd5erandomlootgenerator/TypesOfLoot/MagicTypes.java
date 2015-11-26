package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;

/**
 * Created by PaulD on 2015-11-23.
 */
public class MagicTypes extends ValueableItems {
    Dice d = new Dice();
    int number;
    String magicItem;
    //TODO randomly generate spells of given level
    public String getItem(String table){
        number = d.roll(100);
        switch(table){
            case "A":
                if (number<51){
                    magicItem = "Potion of healing";
                }else if (number<61){
                    magicItem = "Spell Scroll (cantrip)";
                }else if (number<71){
                    magicItem = "Potion of climbing";
                }else if(number<91){
                    magicItem = "Spell Scroll (1st Level)";
                }else if(number<95){
                    magicItem = "Spell Scroll (2nd Level)";
                }else if (number<99){
                    magicItem = "Potion of greater healing";
                }else if (number==99){
                    magicItem = "Bag of holding";
                }else{
                    magicItem = "Driftglobe";
                }
                return magicItem;
            //TODO create other magic item tables
            default:

                return magicItem;
        }
}
}
