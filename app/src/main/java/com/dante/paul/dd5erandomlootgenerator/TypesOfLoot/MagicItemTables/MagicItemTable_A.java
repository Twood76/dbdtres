package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_A extends GenerateSpell implements MagicItemTable{

    public MagicItemTableObject getItem(int number){

        if (number < 51) {
            magicItemTableObject.itemName = "Potion of healing";
        } else if (number < 61) {
            magicItemTableObject.itemName = generateSpell(0);
        } else if (number < 71) {
            magicItemTableObject.itemName = "Potion of climbing";
        } else if (number < 91) {
            magicItemTableObject.itemName = generateSpell(1);
        } else if (number < 95) {
            magicItemTableObject.itemName = generateSpell(2);
        } else if (number < 99) {
            magicItemTableObject.itemName = "Potion of greater healing";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Bag of holding";
        } else {
            magicItemTableObject.itemName = "Driftglobe";
        }

        magicItemTableObject.itemName += " (Table A)";
        return magicItemTableObject;
    }


}
