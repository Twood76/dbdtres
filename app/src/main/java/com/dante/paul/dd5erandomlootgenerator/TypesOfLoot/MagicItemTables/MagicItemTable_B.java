package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_B extends GenerateSpell implements MagicItemTable {
    DamageType damageType = new DamageType();


    public MagicItemTableObject getItem(int number) {
        String magicItem;
        if (number < 16) {
            mITO.itemName = "Potion of greater healing";
        } else if (number < 23) {
            mITO.itemName = "Potion of fire breath";
        } else if (number < 30) {
            mITO.itemName = "Potion of " + damageType.getDamageType() + " resistance";
        } else if (number < 35) {
            mITO.numberOfItem =d.roll(6);
            mITO.itemName = "Ammunition, +1";
        } else if (number < 40) {
            mITO.itemName = "Potion of animal friendship";
        } else if (number < 45) {
            mITO.itemName = "Potion of hill giant strength";
        } else if (number < 50) {
            mITO.itemName = "Potion of growth";
        } else if (number < 55) {
            mITO.itemName = "Potion of water breathing";
        } else if (number < 60) {
            mITO.itemName = generateSpell(2);
        } else if (number < 65) {
            mITO.itemName = generateSpell(3);
        } else if (number < 68) {
            mITO.itemName = "Bag of holding";
        } else if (number < 71) {
            mITO.itemName = "Keoghtom's ointment";
        } else if (number < 74) {
            mITO.itemName = "Oil of slipperiness";
        } else if (number < 76) {
            mITO.itemName = "Dust of disappearance";
        } else if (number < 78) {
            mITO.itemName = "Dust of dryness";
        } else if (number < 80) {
            mITO.itemName = "Dust of sneezing and choking";
        } else if (number < 82) {
            int secondary = d.roll(4);
            if (secondary == 1)
                mITO.itemName = "Blue sapphire elemental gem (air elemental)";
            else if (secondary == 2)
                mITO.itemName = "Yellow diamond elemental gem (earth elemental)";
            else if (secondary == 3)
                mITO.itemName = "Red corundum elemental gem (fire elemental)";
            else
                mITO.itemName = "Emerald elemental gem (water elemental)";
        } else if (number < 84) {
            mITO.itemName = "Philter of love";
        } else if (number == 84) {
            mITO.itemName = "Alchemy jug";
        } else if (number == 85) {
            mITO.itemName = "Cap of water breathing";
        } else if (number == 86) {
            mITO.itemName = "Cloak of manta ray";
        } else if (number == 87) {
            mITO.itemName = "Driftglobe";
        } else if (number == 88) {
            mITO.itemName = "Goggles of night";
        } else if (number == 89) {
            mITO.itemName = "Helm of comprehending languages";
        } else if (number == 90) {
            mITO.itemName = "Immovable rod";
        } else if (number == 91) {
            mITO.itemName = "Lantern of revealing";
        } else if (number == 92) {
            mITO.itemName = "Mariner's armor";
        } else if (number == 93) {
            mITO.itemName = "Mithral armor";
        } else if (number == 94) {
            mITO.itemName = "Potion of poison";
        } else if (number == 95) {
            mITO.itemName = "Ring of swimming";
        } else if (number == 96) {
            mITO.itemName = "Robe of useful items";
        } else if (number == 97) {
            mITO.itemName = "Rope of climbing";
        } else if (number == 98) {
            mITO.itemName = "Saddle of the cavalier";
        } else if (number == 99) {
            mITO.itemName = "Wand of magic detection";
        } else {
            mITO.itemName = "Wand of secrets";
        }

        mITO.itemName += " (Table B)";
        return mITO;
    }
}