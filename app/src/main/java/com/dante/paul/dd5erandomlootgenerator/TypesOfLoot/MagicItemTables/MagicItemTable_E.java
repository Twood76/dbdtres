package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_E implements MagicItemTable {

    public String getItem(int number) {
        String magicItem;

        if (number < 31) {
            //TODO spell
            magicItem = "Spell scroll (8th level)";
        } else if (number < 56) {
            magicItem = "Potion of storm giant strength";
        } else if (number < 71) {
            magicItem = "Potion of supreme healing";
        } else if (number < 86) {
            //TODO spell
            magicItem = "Spell scroll (9th level)";
        } else if (number < 94) {
            magicItem = "Universal solvent";
        } else if (number < 99) {
            magicItem = "Arrow of slaying";
        } else {
            magicItem = "Sovereign glue";
        }
        return magicItem;
    }
}