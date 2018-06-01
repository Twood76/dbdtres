package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects;

import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.AbstractGeneratedStrings;

/**
 * Created by PaulD on 2015-12-02.
 */
public class MagicItemTableObject extends TableObject {

    public MagicItemTableObject() {
        this.numberOfItem = 1;
    }

    public MagicItemTableObject(AbstractGeneratedStrings generatedStrings){
        this.generatedStrings = generatedStrings;
    }

}
