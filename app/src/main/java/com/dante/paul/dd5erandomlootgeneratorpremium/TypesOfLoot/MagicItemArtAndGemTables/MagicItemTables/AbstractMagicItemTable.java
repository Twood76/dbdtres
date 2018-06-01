package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import android.support.annotation.NonNull;

import com.dante.paul.dd5erandomlootgeneratorpremium.Dice.Dice;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ClassOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.AbstractGeneratedStrings;

import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.DamageTypesAndMonsterTypes
        .DamageType;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects.MagicItemTableObject;


import java.util.HashSet;
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
    public int tableSize;
    private ItemFilters tableFilters = new ItemFilters();

    abstract public void getDefaultTable();
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
        ClassOfItem classOfItem = table[number].getClassOfItem();
        ItemFilters filters = table[number].getFilters();
        if(name.equals("Create Spell")){
            return getSpell(table[number]);
        }else if(table[number].getResistance()){
            generatedStrings.setName(name + " of " + damageType.getDamageType() + " resistance");
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setClassOfItem(classOfItem);
            magItemTableObject = new MagicItemTableObject(generatedStrings);
            return magItemTableObject;
        }else if(filters.hasFilter(TypeOfItem.AMMO) && table[number].getLevel()>0){
            generatedStrings.setName("Ammunition, +" + table[number].getLevel());
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setClassOfItem(classOfItem);
            magItemTableObject = new MagicItemTableObject(generatedStrings);
            return magItemTableObject;
        }else if(name.equals("Elemental gem")){
            generatedStrings.setName(elementalGemCreate());
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setClassOfItem(classOfItem);
            magItemTableObject = new MagicItemTableObject(generatedStrings);
            return magItemTableObject;
        }else if(name.equals("Figurine of wonderous power")){
            generatedStrings.setName("Figurine of wonderous power (" + generateFigurine() + ")");
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setClassOfItem(classOfItem);
            return magItemTableObject;
        }else if(name.equals("Magic armor")){
            generatedStrings.setName(magicArmor());
            generatedStrings.setMagicItemtable(tableLetter);
            generatedStrings.setClassOfItem(classOfItem);
            magItemTableObject = new MagicItemTableObject(generatedStrings);
            return magItemTableObject;
        }
        else return table[number];
    }
    @NonNull
    private String magicArmor(){
        int i = d.roll(12);
        switch (i){
            case 3:
                return "Plate armor +2";
            case 4:
                return "Plate armor +2";
            case 5:
                return "Studded leather +3";
            case 6:
                return "Studded leather +3";
            case 7:
                return "Breastplate +3";
            case 8:
                return "Breastplate +3";
            case 9:
                return "Splint +3";
            case 10:
                return "Splint +3";
            case 11:
                return "Half plate +3";
            case 12:
                return "Plate +3";
            default:
                return "Half plate +2";
        }
    }
    @NonNull
    private String generateFigurine(){
        int i  = d.roll(8);
        switch(i){
            case 1:
                return "Bronze griffon";
            case 2:
                return "Ebony fly";
            case 3:
                return "Golden lions";
            case 4:
                return "Ivory goats";
            case 5:
                return "Marble elephant";
            case 8:
                return "Serpentine owl";
            default:
                return "Onyx dog";
        }
    };
    @NonNull
    private String elementalGemCreate() {
        int i = d.roll(4);
        switch (i){
            case(1):
               return "Blue sapphire elemental gem";
            case (2):
                return "Yellow diamond elemental gem";
            case (3):
                return "Red corundum elemental gem";
            default:
                return "Emerald elemental gem";
        }
    }
    protected String creatTableName(String letter){
        return"(Table "+ letter +")";
    }
    protected void addItem(String name, int numberOfThisItem,
                           ItemFilters filters) {
        TableItem item = new TableItem(name
                , numberOfThisItem *10
                , ClassOfItem.ARTORGEM
                , filters);

        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void addItem(String name, int numberOfThisItem,  boolean resistance, ItemFilters filters) {
        TableItem item = new TableItem(
                name
                ,numberOfThisItem*10
                , ClassOfItem.ARTORGEM
                , filters
                , resistance);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void addItem(String name, int numberOfThisItem, int level, ItemFilters filters) {
        TableItem item = new TableItem(name
                ,numberOfThisItem*10
                , ClassOfItem.ARTORGEM
                , filters
                , level);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }

    protected void addScroll(int numberOfThisItem, int level) {
        TableItem item = new TableItem("Create Spell"
                ,numberOfThisItem*10
                , ClassOfItem.ARTORGEM
                , generatedStrings.getFilters()
                ,level);
        tableItems.add(item);
        numberOfItems += numberOfThisItem*10;
    }
    protected void fillTable(ItemFilters filtersForTable) {
        table = new MagicItemTableObject[10 * numberOfItems];
        int counter = 0;
        for (TableItemInterface ti: tableItems) {
            for (TypeOfItem filter: filtersForTable.getFilterSet()) {
                if(!generatedStrings.getFilters().hasFilter(filter))
                    continue;
                generatedStrings = new GenerateItemStrings();
                generatedStrings.setName(ti.getName());
                generatedStrings.setMagicItemtable(tableName);
                generatedStrings.setLevel(ti.getLevel());
                generatedStrings.setFilters(ti.getFilters());
                for (int i = 0; i < ti.getLevel(); i++) {
                    table[i + counter] = new MagicItemTableObject((generatedStrings));
                }
                counter += ti.getCurrentValue();
                break;
            }
        }
        tableSize = 10*numberOfItems;
    }

    public HashSet<TypeOfItem> getTableFiltersSet() {
        return tableFilters.getFilterSet();
    }

    public ItemFilters getTableFilters(){
        return tableFilters;
    }
    public void setTableFilters(ItemFilters tableFilters) {
        this.tableFilters = tableFilters;
    }
    public void setDefaultTableFilter(){
        for(TypeOfItem tOI: TypeOfItem.values()){
            tableFilters.setFilter(tOI);
        }
    }
    protected ItemFilters defaultOrModifiedTableFilters() {
        if(getTableFiltersSet().isEmpty()){
            setDefaultTableFilter();
            return getTableFilters();
        }
        else
            return getTableFilters();
    }

    protected ItemFilters setBaseFilters(){
        ItemFilters temp = new ItemFilters();
        temp.setFilter(TypeOfItem.PHB);
        temp.setFilter(TypeOfItem.BASE);
        return temp;
    }
    //TODO Implement to check if the base tables have been set
    protected boolean loaded(){
        return false;
    }
}
