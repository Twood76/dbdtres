package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.MonsterType;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_C extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {
        MonsterType monsterType = new MonsterType();
        String magicItem;

        if (number < 16) {
            magicItemTableObject.itemName = "Potion of superior healing";
        } else if (number < 23) {
            spells = new GenerateSpell(4);
            magicItemTableObject.itemName = spells.generateSpell();
        } else if (number < 28) {
            magicItemTableObject.numberOfItem = d.roll(4);
            magicItemTableObject.itemName =  "Ammunition, +2";
        } else if (number < 33) {
            magicItemTableObject.itemName = "Potion of clairvoyance";
        } else if (number < 38) {
            magicItemTableObject.itemName = "Potion of diminution";
        } else if (number < 43) {
            magicItemTableObject.itemName = "Potion of gaseous form";
        } else if (number < 48) {
            magicItemTableObject.itemName = "Potion of frost giant strength";
        } else if (number < 53) {
            magicItemTableObject.itemName = "Potion of stone giant strength";
        } else if (number < 58) {
            magicItemTableObject.itemName = "Potion of heroism";
        } else if (number < 63) {
            magicItemTableObject.itemName = "Potion of invulnerability";
        } else if (number < 68) {
            magicItemTableObject.itemName = "Potion of mind reading";
        } else if (number < 73) {
            spells = new GenerateSpell(5);
            magicItemTableObject.itemName = spells.generateSpell();
        } else if (number < 76) {
            magicItemTableObject.itemName = "Elixir of health";
        } else if (number < 79) {
            magicItemTableObject.itemName = "Oil of etherealness";
        } else if (number < 82) {
            magicItemTableObject.itemName = "Potion of fire giant strength";
        } else if (number < 85) {
            magicItemTableObject.itemName = "Quaal's feather token";
        } else if (number < 88) {
            magicItemTableObject.itemName = "Scroll of protection from " + monsterType.getMonsterType();
        } else if (number < 90) {
            magicItemTableObject.itemName = "Bag of beans";
        } else if (number < 92) {
            magicItemTableObject.itemName = "Bead of force";
        } else if (number == 92) {
            magicItemTableObject.itemName = "Chime of opening";
        } else if (number == 93) {
            magicItemTableObject.itemName = "Decanter of endless water";
        } else if (number == 94) {
            magicItemTableObject.itemName = "Eyes of minute seeing";
        } else if (number == 95) {
            magicItemTableObject.itemName = "Folding boat";
        } else if (number == 96) {
            magicItemTableObject.itemName = "Heward's handy haversack";
        } else if (number == 97) {
            magicItemTableObject.itemName = "Horseshoes of speed";
        } else if (number == 98) {
            magicItemTableObject.itemName = "Necklace of fireballs";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Periapt of health";
        } else {
            magicItemTableObject.itemName = "Sending stones";
        }

        generateItemString(magicItemTableObject, "(Table C)");
        return magicItemTableObject;
    }
}