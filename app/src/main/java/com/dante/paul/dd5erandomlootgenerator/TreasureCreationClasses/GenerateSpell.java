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
    AbstractSpells spells;
    int level;
    String spellType;

    //RANDOM SELL CLASS AND LEVEL-------------------------------------------------------------------
    public GenerateSpell() {

        secondary = d.roll(8);

        switch (secondary) {
            case 1:
                spells = new BardSpells();
                spellType = "Bard";
                break;
            case 2:
                spells = new ClericSpells();
                spellType = "Cleric";
                break;
            case 3:
                spells = new DruidSpells();
                spellType = "Druid";
                break;
            case 4:
                spells = new SorcererSpells();
                spellType = "Sorcerer";
                break;
            case 5:
                spells = new WarlockSpells();
                spellType = "Warlock";
                break;
            case 6:
                spells = new WizardSpells();
                spellType = "Wizard";
                break;
            case 7:
                spells = new RangerSpells();
                spellType = "Ranger";
                break;
            default:
                spells = new PaladinSpells();
                spellType = "Paladin";
                break;
        }
        if (secondary > 6)
            level = d.roll(5);
        else
            level = d.roll(10) - 1;

    }

    //RANDOM SPELL LEVEL---------------------------------------------------------------------------
    public GenerateSpell(AbstractSpells spells, String spellType) {

        this.spells=spells;
        this.spellType=spellType;
        
        if (spellType.equals("Paladin") || spellType.equals("Ranger"))
            level = d.roll(5);
        else
            level = d.roll(10) - 1;

    }

    //RANDOM SPELL CLASS---------------------------------------------------------------------------
    public GenerateSpell(int level) {
        this.level = level;
        
        if (level == 0 || level > 5)
            secondary = d.roll(6);
        else
            secondary = d.roll(8);

        switch (secondary) {
            case 1:
                spells = new BardSpells();
                spellType = "Bard";
                break;
            case 2:
                spells = new ClericSpells();
                spellType = "Cleric";
                break;
            case 3:
                spells = new DruidSpells();
                spellType = "Druid";
                break;
            case 4:
                spells = new SorcererSpells();
                spellType = "Sorcerer";
                break;
            case 5:
                spells = new WarlockSpells();
                spellType = "Warlock";
                break;
            case 6:
                spells = new WizardSpells();
                spellType = "Wizard";
                break;
            case 7:
                spells = new RangerSpells();
                spellType = "Ranger";
                break;
            default:
                spells = new PaladinSpells();
                spellType = "Paladin";
                break;
        }
    }

    //KNOWN CLASS AND LEVEL------------------------------------------------------------------------
    public GenerateSpell(AbstractSpells spells, String spellType, int level){
        this.spells = spells;
        this.spellType = spellType;
        this.level = level;
    }
    public String generateSpell() {

        String scroll;
        String spellName;

        if ((level == 0) && (spells.getClass() == PaladinSpells.class) || (spells.getClass() == RangerSpells.class))
            return "This class does not have any Level 0 spells";
        if ((level > 5) && (spells.getClass() == PaladinSpells.class) || (spells.getClass() == RangerSpells.class))
            return "This class does not have any spells above Level 5";
        scroll = spells.getSpell(level);
        spellName = "Spell Scroll (Level " + level + ") - " + spellType + " spell: " + scroll;
        return spellName;
    }


}
