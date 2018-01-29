package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.AbstractGeneratedStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpell;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateSpellStrings;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-12-03.
 */
public abstract class AbstractMagicItemTable extends GenerateSpell {
    protected Dice d = new Dice();
    protected int secondary;
    MagicItemTableObject magicItemTableObject = new MagicItemTableObject();
    MagicItemTableObject magItemTableObject;
    protected  GenerateSpell spells;
    protected AbstractGeneratedStrings generatedStrings;
    protected MagicItemTableObject[] table;
    protected String tableLetter;
    protected String tableName;
    DamageType damageType = new DamageType();

    protected MagicItemTableObject generateItemString(MagicItemTableObject magicItemTableObject){
        AbstractGeneratedStrings generatedStrings = magicItemTableObject.generatedStrings;
        String item = generatedStrings.getName();
        String table = generatedStrings.getMagicItemtable();
        if (item.length() <= 21)
            generatedStrings.setName(item + " " + table);
        else if (item.length() <31)
            generatedStrings.setName(item + "\r\n   " + table);
        else
            generatedStrings.setName(getRow(item, table));
        return magicItemTableObject;
    }

    protected MagicItemTableObject getSpell(MagicItemTableObject magicItemTableObject){
        spells = new GenerateSpell(Integer.parseInt(magicItemTableObject.generatedStrings
                .getMagicItemtable()));
        generatedStrings = new GenerateSpellStrings();
        generatedStrings = spells.generateSpell();
        generatedStrings.setMagicItemtable(tableName);
        magItemTableObject = new MagicItemTableObject();
        magItemTableObject.generatedStrings = generatedStrings;
        return magItemTableObject;
    }

    protected MagicItemTableObject getDamageResistence(MagicItemTableObject magicItemTableObject){
        generatedStrings = new GenerateItemStrings();
        generatedStrings.setMagicItemtable(tableName);
        generatedStrings.setName(magicItemTableObject.getItemTable() + damageType.getDamageType()
       + " resistence" );
        magItemTableObject = new MagicItemTableObject();
        magItemTableObject.generatedStrings = generatedStrings;
        return magicItemTableObject;

    }
    private String getRow(String name, String table){
        if (name.length() <= 18)
            return name + " " + table;
        else if (name.length() <28)
            return name + "\r\n   " + table;
        else {
            char letter = name.charAt(30);
            int index = 30;
            while (letter != ' '){
                index--;
                letter = name.charAt(index);
            }
            return name.substring(0,index-1) + "\r\n   " + getRow(name.substring(index+1),table);
        }
    }
    public MagicItemTableObject getItem(int number){
        String name = table[number].getName();
        if(name.equals("Create Spell")){
            return getSpell(table[number]);
        }else if(name.equals("Damage Resistence")){
            generatedStrings.setName("Potion of " + damageType.getDamageType() + " resistance");
        }
        else return table[number];
    }

    protected String creatTableName(String letter){
        return"(Table "+ letter +")";
    }
}
