package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects.MagicItemTableObject;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateItemStrings;


import java.util.LinkedList;

import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.BASE;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.PHB;


/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_A extends AbstractMagicItemTable implements MagicItemTable {
    public MagicItemTable_A() {
        tableLetter = "A";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
            fillTable(defaultOrModifiedTableFilters());
    }




    public void oldFillTable(){
        int counter = 0;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Potion of healing");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<50; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 50;
        generatedStrings.setName("Create Spell");
        generatedStrings.setMagicItemtable("0");
        for(int i = counter ;i<60; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 60;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Potion of climbing");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<70; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 70;
        generatedStrings.setName("Create Spell");
        generatedStrings.setMagicItemtable("1");
        for(int i = counter ;i<90; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 90;
        generatedStrings.setName("Create Spell");
        generatedStrings.setMagicItemtable("2");
        for(int i = counter ;i<94; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 94;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Potion of greater healing");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<98; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 98;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Bag of holding");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<99; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 99;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Driftglobe");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<100; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
    }

    @Override
    public void getDefaultTable() {
        ItemFilters temp = new ItemFilters();

        temp = setBaseFilters();
        temp.setFilter(TypeOfItem.POTION);
        addItem("Potion of healing", 50,  temp);
        addScroll(10, 0);
        addItem("Potion of climbing",10,temp);
        addScroll(20, 1);
        addScroll(4, 2);
        addItem("Potion of greater healing",4, temp);

        temp = setBaseFilters();
        temp.setFilter(TypeOfItem.WONDEROUS);
        temp.setFilter(TypeOfItem.OTHER);
        addItem("Bag of holding",1, temp);
        addItem("Driftglobe",1, temp);
    }
    



    /*public MagicItemTableObject getItem(int number) {

        if (number < 51) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of healing");
        } else if (number < 61) {
            spells = new GenerateSpell(0);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 71) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of climbing");
        } else if (number < 91) {
            spells = new GenerateSpell(1);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 95) {
            spells = new GenerateSpell(2);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of greater healing");
        } else if (number == 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Bag of holding");
        } else {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Driftglobe");
        }
        generatedStrings.setMagicItemtable("(Table A)");
        magicItemTableObject.generatedStrings = generatedStrings;
        return magicItemTableObject;
    }*/


}
