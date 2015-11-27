package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_D implements MagicItemTable {

    public String getItem(int number) {
        String magicItem;

        if (number < 21) {
            magicItem = "Potion of supreme healing";
        } else if (number < 31) {
            magicItem = "Potion of invisibility";
        } else if (number < 41) {
            magicItem = "Potion of speed";
        } else if (number < 51) {
            //TODO spell
            magicItem = "Spell scroll (6th level)";
        } else if (number < 58) {
            //TODO spell
            magicItem = "Spell scroll (7th level)";
        } else if (number < 63) {
            //TODO determine what type of ammo and how much and how much
            magicItem = "Ammunition, +3";
        } else if (number < 68) {
            magicItem = "Oil of sharpness";
        } else if (number < 73) {
            magicItem = "Potion of flying";
        } else if (number < 78) {
            magicItem = "Potion of cloud giant strength";
        } else if (number < 83) {
            magicItem = "Potion of longevity";
        } else if (number < 88) {
            magicItem = "Potion of vitality";
        } else if (number < 93) {
            //TODO spell
            magicItem = "Spell scroll (8th level)";
        } else if (number < 96) {
            magicItem = "Horseshoes of a zephyr";
        } else if (number < 99) {
            magicItem = "Nolzur's marvelous pigments";
        } else if (number == 99) {
            magicItem = "Bag of devouring";
        } else {
            magicItem = "Portable hole";
        }
        return magicItem;
    }
}