package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.TypeofTableItem;

/**
 * Created by pdante on 1/29/2018.
 */

public interface TableItemInterface {
    public String getName();
    public int getLevel();
    public boolean isBase();
    public TypeofTableItem getTypeOfItem();
    public int getCurrentValue();
    public void setCurrentValue(int currentValue);
    public boolean isActive();
    public void setActive(boolean active);
}
