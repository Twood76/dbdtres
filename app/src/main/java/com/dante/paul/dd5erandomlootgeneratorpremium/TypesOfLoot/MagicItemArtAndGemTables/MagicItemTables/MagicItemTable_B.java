package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import java.util.LinkedList;

import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects.MagicItemTableObject;



import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.*;


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
        fillTable(defaultOrModifiedTableFilters());
    }

    public void oldfillTable(){
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
        ItemFilters temp = new ItemFilters();

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of greater healing", 15, temp);
        addItem("Potion of fire breath", 7, temp);
        addItem("Potion", 7, true, temp);

        temp = setBaseFilters();
        temp.setFilter(AMMO);
        temp.setFilter(WEAPON);
        temp.setFilter(OTHER);
        addItem("Ammunition", 5, 1, temp
        );

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of animal friendship", 5, temp);
        addItem("Potion of hill giant strength", 5, temp);
        addItem("Potion of growth", 5, temp);
        addItem("Potion of water breathing", 5, temp);
        addScroll(5, 2);
        addScroll(5, 3);

        temp = setBaseFilters();
        temp.setFilter(WONDEROUS);
        temp.setFilter(OTHER);
        addItem("Bag of holding",3,temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(OIL);
        addItem("Keoghtom's ointment",3,temp);

        temp = setBaseFilters();
        temp.setFilter(OIL);
        addItem("Oil of slipperiness",3,temp);

        temp = setBaseFilters();
        temp.setFilter(DUST);
        temp.setFilter(WONDEROUS);
        temp.setFilter(OTHER);
        addItem("Dust of disappearance",2,temp);
        addItem("Dust of dryness",2,temp);
        addItem("Dust of sneezing and choking",2,temp);

        temp = setBaseFilters();
        temp.setFilter(GEM);
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Elemental gem",2, false, temp);

        temp = setBaseFilters();
        temp.setFilter(POTION);
        temp.setFilter(OTHER);
        addItem("Philter of love",2, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Alchemy jug",1,temp);

        temp = setBaseFilters();
        temp.setFilter(HEADGEAR);
        temp.setFilter(WONDEROUS);
        addItem("Cap of water breathing",1,temp);

        temp = setBaseFilters();
        temp.setFilter(CLOAK);
        temp.setFilter(WONDEROUS);
        addItem("Cloak of the manta ray",1,temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Driftglobe",1,temp);

        temp = setBaseFilters();
        temp.setFilter(HEADGEAR);
        temp.setFilter(WONDEROUS);
        addItem("Goggles of night",1,temp);
        addItem("Helm of comprehending languages",1,
                temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        addItem("Immovable rod",1,temp);

        temp.setFilter(WONDEROUS);
        addItem("Lantern of revealing",1,temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        addItem("Mariner's armor",1,temp);

        temp.deleteFilter(MAGIC_ITEM);
        addItem("Mithral armor",1,temp);

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of poison", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(RING);
        temp.setFilter(JEWELRY);
        addItem("Ring of swimming", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(ROBE);
        temp.setFilter(WONDEROUS);
        addItem("Robe of useful items", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Rope of climbing", 1, temp);
        addItem("Saddle of the cavalier", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(WAND);
        addItem("Wand of magic detection", 1,  temp);
        addItem("Wand of secrets", 1,  temp);

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