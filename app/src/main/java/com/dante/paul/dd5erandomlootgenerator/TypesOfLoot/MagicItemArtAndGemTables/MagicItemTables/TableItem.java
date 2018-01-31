package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;

/**
 * Created by pdante on 1/29/2018.
 */

public class TableItem implements TableItemInterface {
    private String name;
    private int baseValue;
    private int currentValue;
    private TypeofTableItem typeOfItem;
    private boolean base;
    private boolean active;
    private int level;
    private boolean resistance;

    public TableItem(String name, int baseValue, TypeofTableItem typeOfItem, boolean base) {
        this.name = name;
        this.baseValue = baseValue;
        this.currentValue = baseValue;
        this.typeOfItem = typeOfItem;
        this.base = base;
        this.active = true;
        this.level = -1;
        this.resistance = false;
    }

    public TableItem(String name, int baseValue, TypeofTableItem typeOfItem, boolean base, int
            level) {
        this.name = name;
        this.baseValue = baseValue;
        this.currentValue = baseValue;
        this.typeOfItem = typeOfItem;
        this.base = base;
        this.active = true;
        this.level = level;
        this.resistance = false;
    }
    public TableItem(String name, int baseValue, TypeofTableItem typeOfItem, boolean base,
                     boolean resistance) {
        this.name = name;
        this.baseValue = baseValue * 10;
        this.currentValue = baseValue;
        this.typeOfItem = typeOfItem;
        this.base = base;
        this.active = true;
        this.level = -1;
        this.resistance = resistance;
    }
    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public TypeofTableItem getTypeOfItem() {
        return typeOfItem;
    }

    public boolean isBase() {
        return base;
    }

    public int getLevel() {
        return level;
    }
}
