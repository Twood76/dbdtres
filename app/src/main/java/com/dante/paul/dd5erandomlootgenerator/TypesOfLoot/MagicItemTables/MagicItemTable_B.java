package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_B implements MagicItemTable{

    public String getItem(int number) {
        String magicItem;

        if (number < 16) {
            magicItem = "Potion of greater healing";
        } else if (number < 23) {
            magicItem = "Potion of fire breath";
        } else if (number < 30) {
            //TODO check if potion needs a type of resistance rolled
            magicItem = "Potion of resistance";
        } else if (number < 35) {
            //TODO determine what type of ammo and how much and how much
            magicItem = "Ammunition, +1";
        } else if (number < 40) {
            magicItem = "Potion of animal friendship";
        } else if (number < 45) {
            magicItem = "Potion of hill giant strength";
        } else if (number < 50) {
            magicItem = "Potion of growth";
        } else if (number < 55) {
            magicItem = "Potion of water breathing";
        } else if (number < 60) {
            //TODO spell
            magicItem = "Spell scroll (2nd level)";
        } else if (number < 65) {
            //TODO spell
            magicItem = "Spell scroll (3rd level)";
        } else if (number < 68) {
            magicItem = "Bag of holding";
        } else if (number < 71) {
            magicItem = "Keoghtom's ointment";
        } else if (number < 74) {
            magicItem = "Oil of slipperiness";
        } else if (number < 76) {
            magicItem = "Dust of disappearance";
        } else if (number < 78) {
            magicItem = "Dust of dryness";
        } else if (number < 80) {
            magicItem = "Dust of sneezing and choking";
        } else if (number < 82) {
            //TODO gem type
            magicItem = "Elemental gem";
        } else if (number < 84) {
            magicItem = "Philter of love";
        } else if (number == 84) {
            magicItem = "Alchemy jug";
        } else if (number == 85) {
            magicItem = "Cap of water breathing";
        } else if (number == 86) {
            magicItem = "Cloak of manta ray";
        } else if (number == 87) {
            magicItem = "Driftglobe";
        } else if (number == 88) {
            magicItem = "Goggles of night";
        } else if (number == 89) {
            magicItem = "Helm of comprehending languages";
        } else if (number == 90) {
            magicItem = "Immovable rod";
        } else if (number == 91) {
            magicItem = "Lantern of revealing";
        } else if (number == 92) {
            magicItem = "Mariner's armor";
        } else if (number == 93) {
            magicItem = "Mithral armor";
        } else if (number == 94) {
            magicItem = "Potion of poison";
        } else if (number == 95) {
            magicItem = "Ring of swimming";
        } else if (number == 96) {
            magicItem = "Robe of useful items";
        } else if (number == 97) {
            magicItem = "Rope of climbing";
        } else if (number == 98) {
            magicItem = "Saddle of the cavalier";
        } else if (number == 99) {
            magicItem = "Wand of magic detection";
        } else {
            magicItem = "Wand of secrets";
        }
        return magicItem;
    }
}