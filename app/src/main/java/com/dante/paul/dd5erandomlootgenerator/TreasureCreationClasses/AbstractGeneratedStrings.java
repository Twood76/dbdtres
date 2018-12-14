package com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ClassOfItem;

/**
 * Created by PaulD on 2015-12-04.
 * Abstract Class for classes that create strings that will go into the final loot list
 */
public abstract class AbstractGeneratedStrings {
    protected String level = "";
    protected String magicItemtable = "";
    protected String name = "";
    protected ClassOfItem classOfItem;
    protected String spellCLass = "";


    public ClassOfItem getClassOfItem() {
        return classOfItem;
    }

    public void setClassOfItem(ClassOfItem classOfItem) {
        this.classOfItem = classOfItem;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMagicItemtable() {
        return magicItemtable;
    }

    public void setMagicItemtable(String magicItemtable) {
        this.magicItemtable = magicItemtable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpellCLass(){
        return spellCLass;
    }

    public void setSpellCLass(String spellCLass) {
        this.spellCLass = spellCLass;
    }
}
