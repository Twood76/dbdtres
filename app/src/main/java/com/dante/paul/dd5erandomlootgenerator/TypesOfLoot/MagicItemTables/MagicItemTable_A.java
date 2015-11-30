package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_A implements MagicItemTable{

    public String getItem(int number){
        String magicItem;

        if (number < 51) {
            magicItem = "Potion of healing";
        } else if (number < 61) {
            //TODO spell
            magicItem = "Spell Scroll (cantrip)";
        } else if (number < 71) {
            magicItem = "Potion of climbing";
        } else if (number < 91) {
            //TODO spell
            magicItem = "Spell Scroll (1st Level)";
        } else if (number < 95) {
            //TODO spell
            magicItem = "Spell Scroll (2nd Level)";
        } else if (number < 99) {
            magicItem = "Potion of greater healing";
        } else if (number == 99) {
            magicItem = "Bag of holding";
        } else {
            magicItem = "Driftglobe";
        }

        magicItem += " (Table A)";
        return magicItem;
    }
}
