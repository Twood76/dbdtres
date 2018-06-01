package com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses;

import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;

import java.util.HashSet;

/**
 * Created by pdante on 5/31/2018.
 */

public class ItemFilters {
    private HashSet<TypeOfItem> filters;

    public ItemFilters() {
        this.filters = new HashSet<>();
    }

    public boolean hasFilter(TypeOfItem filter) {
        return filters.contains(filter);
    }

    public void setFilter(TypeOfItem filter) {
        this.filters.add(filter);
    }
    public void deleteFilter(TypeOfItem filter){
        filters.remove(filter);
    }

    public void deleteAllFilters(){
        filters.clear();
    }
    public HashSet<TypeOfItem> getFilterSet(){
        return filters;
    }
}
