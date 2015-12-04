package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;


/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_A extends AbstractMagicItemTable implements MagicItemTable{
    public MagicItemTableObject getItem(int number){

        if (number < 51) {
            magicItemTableObject.itemName = "Potion of healing";
        } else if (number < 61) {
            spells = new GenerateSpell(0);
            magicItemTableObject.itemName = spells.generateSpell();
        } else if (number < 71) {
            magicItemTableObject.itemName = "Potion of climbing";
        } else if (number < 91) {
            spells = new GenerateSpell(1);
            magicItemTableObject.itemName = spells.generateSpell();
        } else if (number < 95) {
            spells = new GenerateSpell(2);
            magicItemTableObject.itemName = spells.generateSpell();
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
