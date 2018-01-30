package com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;

/**
 * Created by PaulD on 2015-12-04.
 */
public abstract class AbstractGeneratedStrings {
    protected int level = -1;
    protected String magicItemtable = "";
    protected String name = "";
    protected TypeOfItem typeOfItem;
    protected String spellCLass = "";
    protected TypeofTableItem itemType;
    protected boolean resistance;

    public TypeOfItem getTypeOfItem() {
        return typeOfItem;
    }

    public void setTypeOfItem(TypeOfItem typeOfItem) {
        this.typeOfItem = typeOfItem;
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

    public TypeofTableItem getItemType() {
        return itemType;
    }

    public void setItemType(TypeofTableItem itemType) {
        this.itemType = itemType;
    }

    public boolean hasResistance() {
        return resistance;
    }

    public void setHasResistance(boolean resistance) {
        this.resistance = resistance;
    }
}
