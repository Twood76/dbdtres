package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.AbstractSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.BardSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.ClericSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.DruidSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.PaladinSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.RangerSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.SorcererSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.WarlockSpells;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables.WizardSpells;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_A extends GenerateSpell implements MagicItemTable{

    public MagicItemTableObject getItem(int number){

        if (number < 51) {
            mITO.itemName = "Potion of healing";
        } else if (number < 61) {
            mITO.itemName = generateSpell(0);
        } else if (number < 71) {
            mITO.itemName = "Potion of climbing";
        } else if (number < 91) {
            mITO.itemName = generateSpell(1);
        } else if (number < 95) {
            mITO.itemName = generateSpell(2);
        } else if (number < 99) {
            mITO.itemName = "Potion of greater healing";
        } else if (number == 99) {
            mITO.itemName = "Bag of holding";
        } else {
            mITO.itemName = "Driftglobe";
        }

        mITO.itemName += " (Table A)";
        return mITO;
    }


}
