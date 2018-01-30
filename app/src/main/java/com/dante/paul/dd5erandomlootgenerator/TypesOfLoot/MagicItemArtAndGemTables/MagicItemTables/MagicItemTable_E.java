package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

import java.util.LinkedList;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_E extends AbstractMagicItemTable implements MagicItemTable {
    public MagicItemTable_E() {
        tableLetter = "E";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable();
    }

    @Override
    public void getDefaultTable() {
        addScroll(30, true, 8);
        addItem("Potion of storm giant strength", 25, TypeofTableItem.POTION, true);
        addItem("Potion of supreme healing", 15, TypeofTableItem.POTION, true);
        addScroll(15, true, 9);
        addItem("Universal solvent", 8, TypeofTableItem.OTHER, true);
        addItem("Arrow of slaying", 5, TypeofTableItem.AMMO, true);
        addItem("Sovereign glue", 2, TypeofTableItem.OTHER, true);
    }
    /*public MagicItemTableObject getItem(int number) {

        if (number < 31) {
            spells = new GenerateSpell(8);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 56) {
            generatedStrings = new GenerateItemStrings();
             generatedStrings.setName("Potion of storm giant strength");
        } else if (number < 71) {
            generatedStrings = new GenerateItemStrings();
             generatedStrings.setName("Potion of supreme healing");
        } else if (number < 86) {
            spells = new GenerateSpell(9);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 94) {
            generatedStrings = new GenerateItemStrings();
             generatedStrings.setName("Universal solvent");
        } else if (number < 99) {
            generatedStrings = new GenerateItemStrings();
             generatedStrings.setName("Arrow of slaying");
        } else {
            generatedStrings = new GenerateItemStrings();
             generatedStrings.setName("Sovereign glue");
        }

        generatedStrings.setMagicItemtable("(Table E)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }*/
}