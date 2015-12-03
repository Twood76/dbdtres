package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_B extends AbstractMagicItemTable implements MagicItemTable {
    DamageType damageType = new DamageType();


    public MagicItemTableObject getItem(int number) {
        if (number < 16) {
            magicItemTableObject.itemName = "Potion of greater healing";
        } else if (number < 23) {
            magicItemTableObject.itemName = "Potion of fire breath";
        } else if (number < 30) {
            magicItemTableObject.itemName = "Potion of " + damageType.getDamageType() + " resistance";
        } else if (number < 35) {
            magicItemTableObject.numberOfItem = d.roll(6);
            magicItemTableObject.itemName = "Ammunition, +1";
        } else if (number < 40) {
            magicItemTableObject.itemName = "Potion of animal friendship";
        } else if (number < 45) {
            magicItemTableObject.itemName = "Potion of hill giant strength";
        } else if (number < 50) {
            magicItemTableObject.itemName = "Potion of growth";
        } else if (number < 55) {
            magicItemTableObject.itemName = "Potion of water breathing";
        } else if (number < 60) {
            magicItemTableObject.itemName = generateSpell(2);
        } else if (number < 65) {
            magicItemTableObject.itemName = generateSpell(3);
        } else if (number < 68) {
            magicItemTableObject.itemName = "Bag of holding";
        } else if (number < 71) {
            magicItemTableObject.itemName = "Keoghtom's ointment";
        } else if (number < 74) {
            magicItemTableObject.itemName = "Oil of slipperiness";
        } else if (number < 76) {
            magicItemTableObject.itemName = "Dust of disappearance";
        } else if (number < 78) {
            magicItemTableObject.itemName = "Dust of dryness";
        } else if (number < 80) {
            magicItemTableObject.itemName = "Dust of sneezing and choking";
        } else if (number < 82) {
            int secondary = d.roll(4);
            if (secondary == 1)
                magicItemTableObject.itemName = "Blue sapphire elemental gem (air elemental)";
            else if (secondary == 2)
                magicItemTableObject.itemName = "Yellow diamond elemental gem (earth elemental)";
            else if (secondary == 3)
                magicItemTableObject.itemName = "Red corundum elemental gem (fire elemental)";
            else
                magicItemTableObject.itemName = "Emerald elemental gem (water elemental)";
        } else if (number < 84) {
            magicItemTableObject.itemName = "Philter of love";
        } else if (number == 84) {
            magicItemTableObject.itemName = "Alchemy jug";
        } else if (number == 85) {
            magicItemTableObject.itemName = "Cap of water breathing";
        } else if (number == 86) {
            magicItemTableObject.itemName = "Cloak of manta ray";
        } else if (number == 87) {
            magicItemTableObject.itemName = "Driftglobe";
        } else if (number == 88) {
            magicItemTableObject.itemName = "Goggles of night";
        } else if (number == 89) {
            magicItemTableObject.itemName = "Helm of comprehending languages";
        } else if (number == 90) {
            magicItemTableObject.itemName = "Immovable rod";
        } else if (number == 91) {
            magicItemTableObject.itemName = "Lantern of revealing";
        } else if (number == 92) {
            magicItemTableObject.itemName = "Mariner's armor";
        } else if (number == 93) {
            magicItemTableObject.itemName = "Mithral armor";
        } else if (number == 94) {
            magicItemTableObject.itemName = "Potion of poison";
        } else if (number == 95) {
            magicItemTableObject.itemName = "Ring of swimming";
        } else if (number == 96) {
            magicItemTableObject.itemName = "Robe of useful items";
        } else if (number == 97) {
            magicItemTableObject.itemName = "Rope of climbing";
        } else if (number == 98) {
            magicItemTableObject.itemName = "Saddle of the cavalier";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Wand of magic detection";
        } else {
            magicItemTableObject.itemName = "Wand of secrets";
        }

        magicItemTableObject.itemName += " (Table B)";
        return magicItemTableObject;
    }
}