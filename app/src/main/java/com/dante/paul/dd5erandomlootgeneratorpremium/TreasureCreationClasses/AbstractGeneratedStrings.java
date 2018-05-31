package com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ClassOfItem;

import java.util.HashSet;

/**
 * Created by PaulD on 2015-12-04.
 */
public abstract class AbstractGeneratedStrings {
    protected String level = "";
    protected String magicItemtable = "";
    protected String name = "";
    protected ClassOfItem classOfItem;
    protected String spellCLass = "";
    protected HashSet<ClassOfItem> filters = new HashSet<>();

    public boolean getFilters(ClassOfItem filter) {
        return filters.contains(filter);
    }

    public void setFilter(ClassOfItem filter) {
        this.filters.add(filter);
    }

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
