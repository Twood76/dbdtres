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
 * Created by PaulD on 2015-11-30.
 */
public abstract class GenerateSpell {

    protected String generateSpell(int level){
        int secondary;
        AbstractSpells spell;
        Dice d = new Dice();
        String scroll;
        String spellType;
        String spellName;

        if (level == 0 || level > 5)
            secondary = 6;
        else
            secondary = 8;

        switch (secondary){
            case 1:
                spell = new BardSpells();
                spellType = "Bard";
                break;
            case 2:
                spell = new ClericSpells();
                spellType = "Cleric";
                break;
            case 3:
                spell = new DruidSpells();
                spellType = "Druid";
                break;
            case 4:
                spell = new SorcererSpells();
                spellType = "Sorcerer";
                break;
            case 5:
                spell = new WarlockSpells();
                spellType = "Warlock";
                break;
            case 6:
                spell = new WizardSpells();
                spellType = "Wizard";
                break;
            case 7:
                spell = new RangerSpells();
                spellType = "Ranger";
                break;
            default:
                spell = new PaladinSpells();
                spellType = "Paladin";
                break;
        }
        scroll = spell.getSpell(0);
        spellName = "Spell Scroll (Level " + level + ") - " + spellType + " spell: " + scroll;
        return spellName;
    }
}
