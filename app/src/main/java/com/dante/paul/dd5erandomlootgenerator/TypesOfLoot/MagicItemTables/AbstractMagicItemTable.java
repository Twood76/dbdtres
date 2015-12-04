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
    GenerateSpell spells;

    protected MagicItemTableObject generateItemString(MagicItemTableObject magicItemTableObject, String tableName){
        String item = magicItemTableObject.itemName;
        magicItemTableObject.itemName = getRow(item, tableName);
        return magicItemTableObject;
    }

    private String getRow(String subString, String tableName){
        if (subString.length() <= 21)
            return subString + " " + tableName;
        else if (subString.length() <31)
            return subString + "\r\n   " + tableName;
        else {
            char letter = subString.charAt(30);
            int index = 30;
            while (letter != ' '){
                index--;
                letter = subString.charAt(index);
            }
            return subString.substring(0,index-1) + "\r\n   " + getRow(subString.substring(index+1), tableName);
    }
}
}
