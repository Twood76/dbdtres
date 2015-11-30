package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_D extends GenerateSpell implements MagicItemTable {

    public String getItem(int number) {
        String magicItem;
        Dice d = new Dice();

        if (number < 21) {
            magicItem = "Potion of supreme healing";
        } else if (number < 31) {
            magicItem = "Potion of invisibility";
        } else if (number < 41) {
            magicItem = "Potion of speed";
        } else if (number < 51) {
            magicItem = generateSpell(6);
        } else if (number < 58) {
            magicItem = generateSpell(7);
        } else if (number < 63) {
            int secondary = d.roll(4);
            magicItem = secondary + " Ammunition, +3";
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
            magicItem = generateSpell(8);
        } else if (number < 96) {
            magicItem = "Horseshoes of a zephyr";
        } else if (number < 99) {
            magicItem = "Nolzur's marvelous pigments";
        } else if (number == 99) {
            magicItem = "Bag of devouring";
        } else {
            magicItem = "Portable hole";
        }

        magicItem += " (Table D)";
        return magicItem;
    }
}