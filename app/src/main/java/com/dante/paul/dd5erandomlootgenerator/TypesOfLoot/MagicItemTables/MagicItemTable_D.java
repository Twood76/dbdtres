package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_D extends GenerateSpell implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {

        if (number < 21) {
            mITO.itemName = "Potion of supreme healing";
        } else if (number < 31) {
            mITO.itemName = "Potion of invisibility";
        } else if (number < 41) {
            mITO.itemName = "Potion of speed";
        } else if (number < 51) {
            mITO.itemName = generateSpell(6);
        } else if (number < 58) {
            mITO.itemName = generateSpell(7);
        } else if (number < 63) {
            mITO.itemName = " Ammunition, +3";
        } else if (number < 68) {
            mITO.itemName = "Oil of sharpness";
        } else if (number < 73) {
            mITO.itemName = "Potion of flying";
        } else if (number < 78) {
            mITO.itemName = "Potion of cloud giant strength";
        } else if (number < 83) {
            mITO.itemName = "Potion of longevity";
        } else if (number < 88) {
            mITO.itemName = "Potion of vitality";
        } else if (number < 93) {
            mITO.itemName = generateSpell(8);
        } else if (number < 96) {
            mITO.itemName = "Horseshoes of a zephyr";
        } else if (number < 99) {
            mITO.itemName = "Nolzur's marvelous pigments";
        } else if (number == 99) {
            mITO.itemName = "Bag of devouring";
        } else {
            mITO.itemName = "Portable hole";
        }
        mITO.itemName += " (Table D)";
        return mITO;
    }
}