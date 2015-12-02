package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_E extends GenerateSpell implements MagicItemTable {

    public String getItem(int number) {

        String magicItem;
        if (number < 31) {
            magicItem = generateSpell(8);
        } else if (number < 56) {
            magicItem = "Potion of storm giant strength";
        } else if (number < 71) {
            magicItem = "Potion of supreme healing";
        } else if (number < 86) {
            magicItem = generateSpell(9);
        } else if (number < 94) {
            magicItem = "Universal solvent";
        } else if (number < 99) {
            magicItem = "Arrow of slaying";
        } else {
            magicItem = "Sovereign glue";
        }

        magicItem += " (Table E)";
        return magicItem;
    }
}