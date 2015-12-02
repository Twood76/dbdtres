package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.MonsterType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_C extends GenerateSpell implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {
        MonsterType monsterType = new MonsterType();
        String magicItem;

        if (number < 16) {
            mITO.itemName = "Potion of superior healing";
        } else if (number < 23) {
            mITO.itemName = generateSpell(4);
        } else if (number < 28) {
            mITO.numberOfItem = d.roll(4);
            mITO.itemName = secondary + " Ammunition, +2";
        } else if (number < 33) {
            mITO.itemName = "Potion of clairvoyance";
        } else if (number < 38) {
            mITO.itemName = "Potion of diminution";
        } else if (number < 43) {
            mITO.itemName = "Potion of gaseous form";
        } else if (number < 48) {
            mITO.itemName = "Potion of frost giant strength";
        } else if (number < 53) {
            mITO.itemName = "Potion of stone giant strength";
        } else if (number < 58) {
            mITO.itemName = "Potion of heroism";
        } else if (number < 63) {
            mITO.itemName = "Potion of invulnerability";
        } else if (number < 68) {
            mITO.itemName = "Potion of mind reading";
        } else if (number < 73) {
            mITO.itemName = generateSpell(5);
        } else if (number < 76) {
            mITO.itemName = "Elixir of health";
        } else if (number < 79) {
            mITO.itemName = "Oil of etherealness";
        } else if (number < 82) {
            mITO.itemName = "Potion of fire giant strength";
        } else if (number < 85) {
            mITO.itemName = "Quaal's feather token";
        } else if (number < 88) {
            mITO.itemName = "Scroll of protection from " + monsterType.getMonsterType();
        } else if (number < 90) {
            mITO.itemName = "Bag of beans";
        } else if (number < 92) {
            mITO.itemName = "Bead of force";
        } else if (number == 92) {
            mITO.itemName = "Chime of opening";
        } else if (number == 93) {
            mITO.itemName = "Decanter of endless water";
        } else if (number == 94) {
            mITO.itemName = "Eyes of minute seeing";
        } else if (number == 95) {
            mITO.itemName = "Folding boat";
        } else if (number == 96) {
            mITO.itemName = "Heward's handy haversack";
        } else if (number == 97) {
            mITO.itemName = "Horseshoes of speed";
        } else if (number == 98) {
            mITO.itemName = "Necklace of fireballs";
        } else if (number == 99) {
            mITO.itemName = "Periapt of health";
        } else {
            mITO.itemName = "Sending stones";
        }

        mITO.itemName += " (Table C)";
        return mITO;
    }
}