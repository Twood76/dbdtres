package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-12-03.
 */
public abstract class AbstractMagicItemTable extends GenerateSpell {
    Dice d = new Dice();
    int secondary;
    MagicItemTableObject magicItemTableObject = new MagicItemTableObject();
}
