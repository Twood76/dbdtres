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

    public String getItem(int number){
        String magicItem;

        if (number < 51) {
            magicItem = "Potion of healing";
        } else if (number < 61) {
            magicItem = generateSpell(0);
        } else if (number < 71) {
            magicItem = "Potion of climbing";
        } else if (number < 91) {
            magicItem = generateSpell(1);
        } else if (number < 95) {
            magicItem = generateSpell(2);
        } else if (number < 99) {
            magicItem = "Potion of greater healing";
        } else if (number == 99) {
            magicItem = "Bag of holding";
        } else {
            magicItem = "Driftglobe";
        }

        magicItem += " (Table A)";
        return magicItem;
    }


}
