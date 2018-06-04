package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;



import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;



import java.util.LinkedList;

import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.AMMO;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OIL;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OTHER;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.POTION;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WONDEROUS;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_D extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTable_D() {
        tableLetter = "D";
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
        addItem("Potion of supreme healing", 20, temp);
        addItem("Potion of invisibility", 10,temp);
        addItem("Potion of speed", 10, temp);
        addScroll(10, 6);
        addScroll(7, 7);

        temp = setBaseFilters();
        temp.setFilter(AMMO);
        addItem("Ammunition", 5, 3, temp);

        temp = setBaseFilters();
        temp.setFilter(OIL);
        temp.setFilter(OTHER);
        addItem("Oil of sharpness", 5, temp);

        temp = setBaseFilters();
        temp.setFilter(POTION);
        addItem("Potion of flying", 5, temp);
        addItem("Potion of cloud giant strength", 5, temp);
        addItem("Potion of longevity", 5, temp);
        addItem("Potion of vitality", 5, temp);
        addScroll(5,  8);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Horseshoes of a zephyr", 3, temp);
        addItem("Nolzur's marvelous pigments", 3, temp);
        addItem("Bag of devouring", 1, temp);
        addItem("Portable hole", 1, temp);
    }
    /*public MagicItemTableObject getItem(int number) {

        if (number < 21) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of supreme healing");
        } else if (number < 31) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of invisibility");
        } else if (number < 41) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of speed");
        } else if (number < 51) {
            spells = new GenerateSpell(6);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 58) {
            spells = new GenerateSpell(7);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 63) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName(" Ammunition, +3");
        } else if (number < 68) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Oil of sharpness");
        } else if (number < 73) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of flying");
        } else if (number < 78) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of cloud giant strength");
        } else if (number < 83) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of longevity");
        } else if (number < 88) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of vitality");
        } else if (number < 93) {
            spells = new GenerateSpell(8);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 96) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Horseshoes of a zephyr");
        } else if (number < 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Nolzur's marvelous pigments");
        } else if (number == 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Bag of devouring");
        } else {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Portable hole");
        }
        generatedStrings.setMagicItemtable("(Table D)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }*/
}