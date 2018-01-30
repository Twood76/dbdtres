package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

import java.util.LinkedList;


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
            fillTable();
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
        addItem("Potion of healing", 50, TypeofTableItem.POTION, true);
        addScroll(10, true, 0);
        addItem("Potion of climbing",10,TypeofTableItem.POTION,true);
        addScroll(20, true, 1);
        addScroll(4, true, 2);
        addItem("Potion of greater healing",4,TypeofTableItem.POTION,true);
        addItem("Bag of holding",1,TypeofTableItem.OTHER,true);
        addItem("Driftglobe",1,TypeofTableItem.OTHER,true);
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
