package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.AbstractGeneratedStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

import java.util.LinkedList;

/**
 * Created by PaulD on 2015-12-03.
 */
public abstract class AbstractMagicItemTable extends GenerateSpell {
    protected Dice d = new Dice();
    protected int secondary;
    MagicItemTableObject magicItemTableObject = new MagicItemTableObject();
    MagicItemTableObject magItemTableObject;
    protected  GenerateSpell spells;
    protected AbstractGeneratedStrings generatedStrings;
    protected MagicItemTableObject[] table;
    protected String tableLetter;
    protected String tableName;
    DamageType damageType = new DamageType();
    LinkedList<TableItemInterface> tableItems;
    int numberOfItems;

    protected MagicItemTableObject generateItemString(MagicItemTableObject magicItemTableObject){
        AbstractGeneratedStrings generatedStrings = magicItemTableObject.generatedStrings;
        String item = generatedStrings.getName();
        String table = generatedStrings.getMagicItemtable();
        if (item.length() <= 21)
            generatedStrings.setName(item + " " + table);
        else if (item.length() <31)
            generatedStrings.setName(item + "\r\n   " + table);
        else
            generatedStrings.setName(getRow(item, table));
        return magicItemTableObject;
    }

    protected MagicItemTableObject getSpell(MagicItemTableObject magicItemTableObject){
        spells = new GenerateSpell(magicItemTableObject.getLevel());
        generatedStrings = new GenerateSpellStrings();
        generatedStrings = spells.generateSpell();
        generatedStrings.setMagicItemtable(tableName);
        magItemTableObject = new MagicItemTableObject(generatedStrings);
        return magItemTableObject;
    }

    protected MagicItemTableObject getDamageResistence(MagicItemTableObject magicItemTableObject){
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setMagicItemtable(tableName);
        generatedStrings.setName(magicItemTableObject.getItemTable() + damageType.getDamageType()
       + " resistence" );
        magItemTableObject = new MagicItemTableObject();
        magItemTableObject.generatedStrings = generatedStrings;
        return magicItemTableObject;

    }
    private String getRow(String name, String table){
        if (name.length() <= 18)
            return name + " " + table;
        else if (name.length() <28)
            return name + "\r\n   " + table;
        else {
            char letter = name.charAt(30);
            int index = 30;
            while (letter != ' '){
                index--;
                letter = name.charAt(index);
            }
            return name.substring(0,index-1) + "\r\n   " + getRow(name.substring(index+1),table);
        }
    }
    public MagicItemTableObject getItem(int number){
        String name = table[number].getName();
        TypeofTableItem typeOfItem = table[number].getTypeofTableItem();
        if(name.equals("Create Spell")){
            return getSpell(table[number]);
        }else if(table[number].getResistance()){
            generatedStrings.setName(name + " of " + damageType.getDamageType() + " resistance");
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setItemType(typeOfItem);
            magItemTableObject = new MagicItemTableObject(generatedStrings);
            return magItemTableObject;
        }else if(typeOfItem.equals(TypeofTableItem.AMMO)){
            generatedStrings.setName("Ammunition, +" + table[number].getLevel());
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setItemType(typeOfItem);
            magItemTableObject = new MagicItemTableObject(generatedStrings);
            return magItemTableObject;
        }else if(name.equals("Elemental gem")){
            generatedStrings.setName(elementalGemCreate());
        }
        else return table[number];
    }

    //TODO create for this specific object
    private String elementalGemCreate() {
    return "";
    }

    protected String creatTableName(String letter){
        return"(Table "+ letter +")";
    }

    protected void addItem(String name, int numberOfThisItem, TypeofTableItem potion, boolean base) {
        TableItem item = new TableItem(name,numberOfThisItem*10, potion,base);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void addItem(String name, int numberOfThisItem, TypeofTableItem potion, boolean
            base, boolean resistance) {
        TableItem item = new TableItem(name,numberOfThisItem*10, potion,base, resistance);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void addItem(String name, int numberOfThisItem, TypeofTableItem potion, boolean
            base, int level) {
        TableItem item = new TableItem(name,numberOfThisItem*10, potion,base, level);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void addScroll(int numberOfThisItem, boolean base, int level) {
        TableItem item = new TableItem("Create Spell",numberOfThisItem*10, TypeofTableItem.SCROLL,base,level);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void fillTable() {
        table = new MagicItemTableObject[10 * numberOfItems];
        int counter = 0;
        for (TableItemInterface ti: tableItems) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName(ti.getName());
            generatedStrings.setMagicItemtable(tableName);
            generatedStrings.setLevel(ti.getLevel());
            for (int i = 0; i < ti.getLevel(); i++) {
                table[i + counter] = new MagicItemTableObject((generatedStrings));
            }
            counter += ti.getCurrentValue();
        }
    }
    //TODO Implement to check if the base tables have been set
    protected boolean loaded(){
        return false;
    }
}
