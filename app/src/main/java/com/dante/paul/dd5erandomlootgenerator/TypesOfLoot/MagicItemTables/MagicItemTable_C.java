package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.MonsterType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_C implements MagicItemTable {
    MonsterType mT;
    public String getItem(int number) {
        String magicItem;

        if (number < 16) {
            magicItem = "Potion of superior healing";
        } else if (number < 23) {
            //TODO spell
            magicItem = "Spell scroll (4th level)";
        } else if (number < 28) {
            //TODO determine what type of ammo and how much and how much
            magicItem = "Ammunition, +2";
        } else if (number < 33) {
            magicItem = "Potion of clairvoyance";
        } else if (number < 38) {
            magicItem = "Potion of diminution";
        } else if (number < 43) {
            magicItem = "Potion of gaseous form";
        } else if (number < 48) {
            magicItem = "Potion of frost giant strength";
        } else if (number < 53) {
            magicItem = "Potion of stone giant strength";
        } else if (number < 58) {
            magicItem = "Potion of heroism";
        } else if (number < 63) {
            magicItem = "Potion of invulnerability";
        } else if (number < 68) {
            magicItem = "Potion of mind reading";
        } else if (number < 73) {
            //TODO spell
            magicItem = "Spell scroll (5th level)";
        } else if (number < 76) {
            magicItem = "Elixir of health";
        } else if (number < 79) {
            magicItem = "Oil of etherealness";
        } else if (number < 82) {
            magicItem = "Potion of fire giant strength";
        } else if (number < 85) {
            magicItem = "Quaal's feather token";
        } else if (number < 88) {
            magicItem = "Scroll of protection from " + mT.getMonsterType();
        } else if (number < 90) {
            magicItem = "Bag of beans";
        } else if (number < 92) {
            magicItem = "Bead of force";
        } else if (number == 92) {
            magicItem = "Chime of opening";
        } else if (number == 93) {
            magicItem = "Decanter of endless water";
        } else if (number == 94) {
            magicItem = "Eyes of minute seeing";
        } else if (number == 95) {
            magicItem = "Folding boat";
        } else if (number == 96) {
            magicItem = "Heward's handy haversack";
        } else if (number == 97) {
            magicItem = "Horseshoes of speed";
        } else if (number == 98) {
            magicItem = "Necklace of fireballs";
        } else if (number == 99) {
            magicItem = "Periapt of health";
        } else {
            magicItem = "Sending stones";
        }

        magicItem += " (Table C)";
        return magicItem;
    }
}