package com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses;

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
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-11-30.
 */
public class GenerateSpell {
    Dice d = new Dice();
    int secondary;
    MagicItemTableObject magicItemTableObject = new MagicItemTableObject();

    //RANDOM SELL CLASS AND LEVEL-------------------------------------------------------------------
    public String generateSpell() {

        AbstractSpells spell;

        String scroll;
        String spellType;
        String spellName;

        int level;

        secondary = d.roll(8);

        switch (secondary) {
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
        if (secondary >6)
            level = d.roll(5);
        else
            level = d.roll(10)-1;

        scroll = spell.getSpell(level);
        spellName = "Spell Scroll (Level " + level + ") - " + spellType + " spell: " + scroll;
        return spellName;
    }

    //RANDOM SPELL LEVEL---------------------------------------------------------------------------
    public String generateSpell(AbstractSpells spell, String spellType) {

        String scroll;
        String spellName;
        int level;

        if (spellType.equals("Paladin")||spellType.equals("Ranger"))
            level = d.roll(5);
        else
        level = d.roll(10)-1;

        scroll = spell.getSpell(level);
        spellName = "Spell Scroll (Level " + level + ") - " + spellType + " spell: " + scroll;
        return spellName;
    }
    //RANDOM SPELL CLASS---------------------------------------------------------------------------
    public String generateSpell(int level) {

        AbstractSpells spell;

        String scroll;
        String spellType;
        String spellName;

        if (level == 0 || level > 5)
            secondary = d.roll(6);
        else
            secondary = d.roll(8);

        switch (secondary) {
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
        scroll = spell.getSpell(level);
        spellName = "Spell Scroll (Level " + level + ") - " + spellType + " spell: " + scroll;
        return spellName;
    }

    //KNOWN CLASS AND LEVEL------------------------------------------------------------------------
    public String generateSpell(int level, AbstractSpells spells, String spellType) {

        String scroll;
        String spellName;

        if (level == 0 || level > 5)
            secondary = d.roll(6);
        else
            secondary = d.roll(8);

        scroll = spells.getSpell(level);
        spellName = "Spell Scroll (Level " + level + ") - " + spellType + " spell: " + scroll;
        return spellName;
    }
}
