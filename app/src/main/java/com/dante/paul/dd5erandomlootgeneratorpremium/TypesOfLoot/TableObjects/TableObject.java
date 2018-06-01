package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects;

import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.AbstractGeneratedStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ClassOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.AbstractGeneratedStrings;


import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;

/**
 * Created by PaulD on 2015-12-02.
 */
public abstract class TableObject {
    public int numberOfItem;
    public AbstractGeneratedStrings generatedStrings;


    public String getName(){
        return generatedStrings.getName();
    }

    public ClassOfItem getItemClass(){
        return generatedStrings.getClassOfItem();
    }

    public void setItemClass(ClassOfItem classOfItem){
        generatedStrings.setClassOfItem(classOfItem);
    }
    public void setName(String name){
        generatedStrings.setName(name);
    }

    public int getLevel(){
        return generatedStrings.getLevel();
    }

    public String getSpellClass(){
        return generatedStrings.getSpellCLass();
    }

    public String getItemTable(){
        return generatedStrings.getMagicItemtable();
    }
    public ClassOfItem getClassOfItem(){
        return generatedStrings.getClassOfItem();
    }
    public boolean getResistance(){
        return generatedStrings.hasResistance();
    }
    public ItemFilters getFilters(){return generatedStrings.getFilters();}
}
