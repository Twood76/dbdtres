package com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ClassOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;

import java.util.HashSet;

/**
 * Created by PaulD on 2015-12-04.
 */
public abstract class AbstractGeneratedStrings {
    protected int level = -1;
    protected String magicItemtable = "";
    protected String name = "";
    protected ClassOfItem classOfItem;
    protected String spellCLass = "";

    protected ItemFilters filters = new ItemFilters();
    protected boolean resistance;


    public ClassOfItem getClassOfItem() {
        return classOfItem;
    }

    public void setClassOfItem(ClassOfItem classOfItem) {
        this.classOfItem = classOfItem;
    }

    public int getLevel() {
        return level;
    }

    public String getLevelNameString(){
        return "spell scroll (level " + level + ")";
    }

    public void setLevel(int level) {
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

    public boolean hasResistance() {
        return resistance;
    }

    public void setHasResistance(boolean resistance) {
        this.resistance = resistance;
    }

    public ItemFilters getFilters(){return filters;}

    public void setFilters(ItemFilters filters){this.filters = filters;    }
}
