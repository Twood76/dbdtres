package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;



import java.util.LinkedList;

import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.AMMO;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OTHER;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.POTION;

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
        fillTable(defaultOrModifiedTableFilters());
    }

    @Override
    public void getDefaultTable() {
        ItemFilters temp = new ItemFilters();

        addScroll(30, 8);

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of storm giant strength", 25, temp);
        addItem("Potion of supreme healing", 15, temp);
        addScroll(15, 9);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        addItem("Universal solvent", 8, temp);

        temp = setBaseFilters();
        temp.setFilter(AMMO);
        addItem("Arrow of slaying", 5, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        addItem("Sovereign glue", 2, temp);
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