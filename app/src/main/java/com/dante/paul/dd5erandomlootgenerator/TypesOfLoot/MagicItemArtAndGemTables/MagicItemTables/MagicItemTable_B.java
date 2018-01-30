package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

import java.util.LinkedList;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_B extends AbstractMagicItemTable implements MagicItemTable {


    public MagicItemTable_B() {
        tableLetter = "B";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable();
    }
    @Override
    public void fillTable(){
        int counter = 0;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Potion of greater healing");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<15; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 15;
        generatedStrings.setName("Potion of greater healing");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<22; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 22;
        generatedStrings.setName("Damage Resistence");
        generatedStrings.setMagicItemtable(tableName);
        for(int i = counter ;i<29; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 29;
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
        generatedStrings.setMagicItemtable("(Table A)");
        for(int i = counter ;i<98; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 98;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Bag of holding");
        generatedStrings.setMagicItemtable("(Table A)");
        for(int i = counter ;i<99; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
        counter = 99;
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setName("Driftglobe");
        generatedStrings.setMagicItemtable("(Table A)");
        for(int i = counter ;i<100; i++){
            table[i]= new MagicItemTableObject();
            table[i].generatedStrings = generatedStrings;
        }
    }

    @Override
    public void getDefaultTable() {
        addItem("Potion of greater healing", 15, TypeofTableItem.POTION, true);
        addItem("Potion of fire breath", 7, TypeofTableItem.POTION, true);
        addItem("Potion", 7, TypeofTableItem.POTION, true, true);
        addItem("Ammunition", 5, TypeofTableItem.AMMO, true, 1);
        addItem("Potion of animal friendship", 5, TypeofTableItem.POTION, true);
        addItem("Potion of hill giant strength", 5, TypeofTableItem.POTION, true);
        addItem("Potion of growth", 5, TypeofTableItem.POTION, true);
        addItem("Potion of water breathing", 5, TypeofTableItem.POTION, true);
        addScroll(5, true, 2);
        addScroll(5, true, 3);
        addItem("Bag of holding",3,TypeofTableItem.OTHER,true);
        addItem("Keoghtom's ointment",3,TypeofTableItem.OTHER,true);
        addItem("Oil of slipperiness",3,TypeofTableItem.OTHER,true);
        addItem("Dust of disappearance",2,TypeofTableItem.OTHER,true);
        addItem("Dust of dryness",2,TypeofTableItem.OTHER,true);
        addItem("Dust of sneezing and choking",2,TypeofTableItem.OTHER,true);
        addItem("Elemental gem",2,TypeofTableItem.GEM,true, true);
        addItem("Dust of dryness",2,TypeofTableItem.OTHER,true);

        addScroll(10, true, 0);
        addItem("Potion of climbing",10,TypeofTableItem.POTION,true);
        addScroll(20, true, 1);
        addScroll(4, true, 2);
        addItem("Potion of greater healing",4,TypeofTableItem.POTION,true);
        addItem("Bag of holding",1,TypeofTableItem.OTHER,true);
        addItem("Driftglobe",1,TypeofTableItem.OTHER,true);
    }
    public MagicItemTableObject getItem(int number) {
        if (number < 16) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of greater healing");
        } else if (number < 23) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of fire breath");
        } else if (number < 30) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of " + damageType.getDamageType() + " resistance");
        } else if (number < 35) {
            generatedStrings = new GenerateItemStrings();
            magicItemTableObject.numberOfItem = d.roll(6);
            generatedStrings.setName("Ammunition, +1");
        } else if (number < 40) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of animal friendship");
        } else if (number < 45) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of hill giant strength");
        } else if (number < 50) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of growth");
        } else if (number < 55) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of water breathing");
        } else if (number < 60) {
            spells = new GenerateSpell(2);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 65) {
            spells = new GenerateSpell(3);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 68) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Bag of holding");
        } else if (number < 71) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Keoghtom's ointment");
        } else if (number < 74) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Oil of slipperiness");
        } else if (number < 76) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Dust of disappearance");
        } else if (number < 78) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Dust of dryness");
        } else if (number < 80) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Dust of sneezing and choking");
        } else if (number < 82) {
            generatedStrings = new GenerateItemStrings();
            secondary = d.roll(4);
            if (secondary == 1)
                generatedStrings.setName("Blue sapphire elemental gem (air elemental)");
            else if (secondary == 2)
                generatedStrings.setName("Yellow diamond elemental gem (earth elemental)");
            else if (secondary == 3)
                generatedStrings.setName("Red corundum elemental gem (fire elemental)");
            else
                generatedStrings.setName("Emerald elemental gem (water elemental)");
        } else if (number < 84) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Philter of love");
        } else if (number == 84) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Alchemy jug");
        } else if (number == 85) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Cap of water breathing");
        } else if (number == 86) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Cloak of manta ray");
        } else if (number == 87) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Driftglobe");
        } else if (number == 88) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Goggles of night");
        } else if (number == 89) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Helm of comprehending languages");
        } else if (number == 90) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Immovable rod");
        } else if (number == 91) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Lantern of revealing");
        } else if (number == 92) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Mariner's armor");
        } else if (number == 93) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Mithral armor");
        } else if (number == 94) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of poison");
        } else if (number == 95) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Ring of swimming");
        } else if (number == 96) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Robe of useful items");
        } else if (number == 97) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Rope of climbing");
        } else if (number == 98) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Saddle of the cavalier");
        } else if (number == 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Wand of magic detection");
        } else {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Wand of secrets");
        }


        generatedStrings.setMagicItemtable("(Table B)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }
}