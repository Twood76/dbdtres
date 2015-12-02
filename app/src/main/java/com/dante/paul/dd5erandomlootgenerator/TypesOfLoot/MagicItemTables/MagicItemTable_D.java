package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_D extends GenerateSpell implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {

        if (number < 21) {
            magicItemTableObject.itemName = "Potion of supreme healing";
        } else if (number < 31) {
            magicItemTableObject.itemName = "Potion of invisibility";
        } else if (number < 41) {
            magicItemTableObject.itemName = "Potion of speed";
        } else if (number < 51) {
            magicItemTableObject.itemName = generateSpell(6);
        } else if (number < 58) {
            magicItemTableObject.itemName = generateSpell(7);
        } else if (number < 63) {
            magicItemTableObject.itemName = " Ammunition, +3";
        } else if (number < 68) {
            magicItemTableObject.itemName = "Oil of sharpness";
        } else if (number < 73) {
            magicItemTableObject.itemName = "Potion of flying";
        } else if (number < 78) {
            magicItemTableObject.itemName = "Potion of cloud giant strength";
        } else if (number < 83) {
            magicItemTableObject.itemName = "Potion of longevity";
        } else if (number < 88) {
            magicItemTableObject.itemName = "Potion of vitality";
        } else if (number < 93) {
            magicItemTableObject.itemName = generateSpell(8);
        } else if (number < 96) {
            magicItemTableObject.itemName = "Horseshoes of a zephyr";
        } else if (number < 99) {
            magicItemTableObject.itemName = "Nolzur's marvelous pigments";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Bag of devouring";
        } else {
            magicItemTableObject.itemName = "Portable hole";
        }
        magicItemTableObject.itemName += " (Table D)";
        return magicItemTableObject;
    }
}