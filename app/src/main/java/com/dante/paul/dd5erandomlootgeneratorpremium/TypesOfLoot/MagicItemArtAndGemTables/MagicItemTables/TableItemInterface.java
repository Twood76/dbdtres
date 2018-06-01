package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.ClassOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;

/**
 * Created by pdante on 1/29/2018.
 */

public interface TableItemInterface {
    public String getName();
    public int getLevel();
    public boolean isBase();
    public ClassOfItem getClassOfItem();
    public int getCurrentValue();
    public void setCurrentValue(int currentValue);
    public boolean isActive();
    public void setActive(boolean active);
    public void setFilter(TypeOfItem filter);
    public boolean filtered(TypeOfItem filter);
    public ItemFilters getFilters();

}
