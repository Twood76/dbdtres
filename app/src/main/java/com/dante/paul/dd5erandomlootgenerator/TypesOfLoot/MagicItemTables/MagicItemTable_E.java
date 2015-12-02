package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_E extends GenerateSpell implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {


        if (number < 31) {
            mITO.itemName = generateSpell(8);
        } else if (number < 56) {
            mITO.itemName = "Potion of storm giant strength";
        } else if (number < 71) {
            mITO.itemName = "Potion of supreme healing";
        } else if (number < 86) {
            mITO.itemName = generateSpell(9);
        } else if (number < 94) {
            mITO.itemName = "Universal solvent";
        } else if (number < 99) {
            mITO.itemName = "Arrow of slaying";
        } else {
            mITO.itemName = "Sovereign glue";
        }

        mITO.itemName += " (Table E)";
        return mITO;
    }
}