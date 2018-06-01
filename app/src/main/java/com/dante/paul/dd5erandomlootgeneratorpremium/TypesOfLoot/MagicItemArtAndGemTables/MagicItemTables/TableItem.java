package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;



import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ClassOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.DnDSource;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;

/**
 * Created by pdante on 1/29/2018.
 */

public class TableItem implements TableItemInterface {
    private String name;
    private int baseValue;
    private int currentValue;
    private ClassOfItem classOfItem;
    private boolean base;
    private boolean active;
    private int level;
    private boolean resistance;
    private ItemFilters filters = new ItemFilters();


    public TableItem(String name, int baseValue, ClassOfItem classOfItem, ItemFilters filters) {
        this.name = name;
        this.baseValue = baseValue;
        this.currentValue = baseValue;
        this.classOfItem = classOfItem;
        this.active = true;
        this.level = -1;
        this.resistance = false;
        this.filters = filters;

    }

    public TableItem(String name, int baseValue, ClassOfItem classOfItem, ItemFilters filters, int
            level) {
        this.name = name;
        this.baseValue = baseValue;
        this.currentValue = baseValue;
        this.classOfItem = classOfItem;
        this.active = true;
        this.level = level;
        this.resistance = false;
        this.filters = filters;

    }
    public TableItem(String name, int baseValue, ClassOfItem classOfItem, ItemFilters filters,
                     boolean resistance) {
        this.name = name;
        this.baseValue = baseValue * 10;
        this.currentValue = baseValue;
        this.classOfItem = classOfItem;
        this.active = true;
        this.level = -1;
        this.resistance = resistance;
        this.filters = filters;

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

    public void setFilter(TypeOfItem filter) {
        this.filters.setFilter(filter);
    }

    public boolean filtered(TypeOfItem filter) {
        return this.filters.hasFilter(filter);
    }

    public ItemFilters getFilters(){return filters;}

    public String getName() {
        return name;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public ClassOfItem getClassOfItem() {
        return classOfItem;
    }

    public boolean isBase() {
        return base;
    }

    public int getLevel() {
        return level;
    }

}
