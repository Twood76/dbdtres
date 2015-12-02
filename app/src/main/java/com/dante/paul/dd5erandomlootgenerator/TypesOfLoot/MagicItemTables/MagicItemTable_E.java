package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_E extends GenerateSpell implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {


        if (number < 31) {
            magicItemTableObject.itemName = generateSpell(8);
        } else if (number < 56) {
            magicItemTableObject.itemName = "Potion of storm giant strength";
        } else if (number < 71) {
            magicItemTableObject.itemName = "Potion of supreme healing";
        } else if (number < 86) {
            magicItemTableObject.itemName = generateSpell(9);
        } else if (number < 94) {
            magicItemTableObject.itemName = "Universal solvent";
        } else if (number < 99) {
            magicItemTableObject.itemName = "Arrow of slaying";
        } else {
            magicItemTableObject.itemName = "Sovereign glue";
        }

        magicItemTableObject.itemName += " (Table E)";
        return magicItemTableObject;
    }
}