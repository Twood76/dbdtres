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
public class MagicItemTable_D extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTable_D() {
        tableLetter = "D";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable();
    }

    @Override
    public void getDefaultTable() {
        addItem("Potion of supreme healing", 20, TypeofTableItem.POTION, true);
        addItem("Potion of invisibility", 10, TypeofTableItem.POTION, true);
        addItem("Potion of speed", 10, TypeofTableItem.POTION, true);
        addScroll(10, true, 6);
        addScroll(7, true, 7);
        addItem("Ammunition", 5, TypeofTableItem.AMMO, true, 3);
        addItem("Oil of sharpness", 5, TypeofTableItem.OTHER, true);
        addItem("Potion of flying", 5, TypeofTableItem.POTION, true);
        addItem("Potion of cloud giant strength", 5, TypeofTableItem.POTION, true);
        addItem("Potion of longevity", 5, TypeofTableItem.POTION, true);
        addItem("Potion of vitality", 5, TypeofTableItem.POTION, true);
        addScroll(5, true, 8);
        addItem("Horseshoes of a zephyr", 3, TypeofTableItem.OTHER, true);
        addItem("Nolzur's marvelous pigments", 3, TypeofTableItem.OTHER, true);
        addItem("Bag of devouring", 1, TypeofTableItem.OTHER, true);
        addItem("Portable hole", 1, TypeofTableItem.OTHER, true);
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