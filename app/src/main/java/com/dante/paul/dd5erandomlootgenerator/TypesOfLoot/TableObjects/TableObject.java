package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.AbstractGeneratedStrings;

/**
 * Created by PaulD on 2015-12-02.
 */
public abstract class TableObject {
    public int numberOfItem;
    public AbstractGeneratedStrings generatedStrings;


    public String getName(){
        return generatedStrings.getName() + "\r\n  " + generatedStrings.getMagicItemtable();
    }

    public TypeOfItem getItemType(){
        return generatedStrings.getTypeOfItem();
    }

    public void setItemType(TypeOfItem typeOfItem){
        generatedStrings.setTypeOfItem(typeOfItem);
    }
    public void setName(String name){
        generatedStrings.setName(name);
    }

    public String getLevel(){
        return generatedStrings.getLevel();
    }

    public String getSpellClass(){
        return generatedStrings.getSpellCLass();
    }

    public String getItemTable(){
        return generatedStrings.getMagicItemtable();
    }
}
