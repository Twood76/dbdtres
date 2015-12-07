package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables;

import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;


/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_A extends AbstractMagicItemTable implements MagicItemTable {
    public MagicItemTableObject getItem(int number) {

        if (number < 51) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of healing");
        } else if (number < 61) {
            spells = new GenerateSpell(0);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 71) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of climbing");
        } else if (number < 91) {
            spells = new GenerateSpell(1);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 95) {
            spells = new GenerateSpell(2);
            generatedStrings = new GenerateSpellStrings();
            generatedStrings = spells.generateSpell();
        } else if (number < 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Potion of greater healing");
        } else if (number == 99) {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Bag of holding");
        } else {
            generatedStrings = new GenerateItemStrings();
            generatedStrings.setName("Driftglobe");
        }
        generatedStrings.setMagicItemtable("(Table A)");
        magicItemTableObject.generatedStrings = generatedStrings;
        return magicItemTableObject;
    }


}
