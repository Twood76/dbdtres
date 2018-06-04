package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;



import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;



import java.util.LinkedList;

import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.AMMO;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ENCHANTED;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.INSTRUMENT;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.JEWELRY;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.MAGIC_ITEM;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OIL;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OTHER;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.POTION;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.SCROLL;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WONDEROUS;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_C extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTable_C() {
        tableLetter = "C";
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

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of superior healing", 15,   temp);


        addScroll(7,4);

        temp = setBaseFilters();
        temp.setFilter(AMMO);
        addItem("Ammunition", 5,  2, temp);

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of clairvoyance", 5,temp);
        addItem("Potion of diminution", 5,temp);
        addItem("Potion of gaseous form", 5, temp);
        addItem("Potion of frost giant strength", 5, temp);
        addItem("Potion of stone giant strength", 5, temp);
        addItem("Potion of frost giant strength", 5, temp);
        addItem("Potion of heroism", 5, temp);
        addItem("Potion of invulnerability", 5, temp);
        addItem("Potion of mind reading", 5, temp);
        addScroll(5, 5);
        addItem("Elixir of health", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(OIL);
        temp.setFilter(OTHER);
        addItem("Oil of etherealness", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of fire giant strength", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(MAGIC_ITEM);
        addItem("Quaal's feather token", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(SCROLL);
        addItem("Scroll of protection", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(MAGIC_ITEM);
        addItem("Bag of beans", 2, temp);
        addItem("Bead of force", 2,temp);

        temp = setBaseFilters();
        temp.setFilter(INSTRUMENT);
        temp.setFilter(WONDEROUS);
        addItem("Chime of opening", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(MAGIC_ITEM);
        addItem("Decanter of endless water", 1, temp);
        addItem("Eyes of minute seeing", 1, temp);
        addItem("Folding boat", 1, temp);
        addItem("Heward's handy haversack", 1, temp);
        addItem("Horseshoes of speed", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        temp.setFilter(MAGIC_ITEM);
        addItem("Neckless of fireballs", 1, temp);
        addItem("Periapt of health", 1, temp);
        addItem("Sending stones", 1, temp);
    }
    /*public MagicItemTableObject getItem(int number) {
        MonsterType monsterType = new MonsterType();

        if (number < 16) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of superior healing");
        } else if (number < 23) {
            spells = new GenerateSpell(4);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 28) {
            generatedStrings = new GenerateItemStrings();
            magicItemTableObject.numberOfItem = d.roll(4);
            generatedStrings.setName("Ammunition, +2");
        } else if (number < 33) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of clairvoyance");
        } else if (number < 38) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of diminution");
        } else if (number < 43) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of gaseous form");
        } else if (number < 48) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of frost giant strength");
        } else if (number < 53) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of stone giant strength");
        } else if (number < 58) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of heroism");
        } else if (number < 63) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of invulnerability");
        } else if (number < 68) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of mind reading");
        } else if (number < 73) {
            spells = new GenerateSpell(5);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 76) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Elixir of health");
        } else if (number < 79) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Oil of etherealness");
        } else if (number < 82) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of fire giant strength");
        } else if (number < 85) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Quaal's feather token");
        } else if (number < 88) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Scroll of protection from " + monsterType.getMonsterType());
        } else if (number < 90) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Bag of beans");
        } else if (number < 92) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Bead of force");
        } else if (number == 92) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Chime of opening");
        } else if (number == 93) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Decanter of endless water");
        } else if (number == 94) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Eyes of minute seeing");
        } else if (number == 95) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Folding boat");
        } else if (number == 96) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Heward's handy haversack");
        } else if (number == 97) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Horseshoes of speed");
        } else if (number == 98) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Necklace of fireballs");
        } else if (number == 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Periapt of health");
        } else {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Sending stones");
        }

        generatedStrings.setMagicItemtable("(Table C)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }*/
}