package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_E extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {


        if (number < 31) {
            spells = new GenerateSpell(8);
            magicItemTableObject.itemName = spells.generateSpell();
        } else if (number < 56) {
            magicItemTableObject.itemName = "Potion of storm giant strength";
        } else if (number < 71) {
            magicItemTableObject.itemName = "Potion of supreme healing";
        } else if (number < 86) {
            spells = new GenerateSpell(9);
            magicItemTableObject.itemName = spells.generateSpell();
        } else if (number < 94) {
            magicItemTableObject.itemName = "Universal solvent";
        } else if (number < 99) {
            magicItemTableObject.itemName = "Arrow of slaying";
        } else {
            magicItemTableObject.itemName = "Sovereign glue";
        }

        generateItemString(magicItemTableObject, "(Table E)");
        return magicItemTableObject;
    }
}