package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;


import java.util.LinkedList;

import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ARMOR;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.BELT;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.CLOAK;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ENCHANTED;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.HAMMER;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.INSTRUMENT;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.IOUN;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.JEWELRY;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.LEGENDARY;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OTHER;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.RING;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ROBE;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ROD;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.STAFF;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.SWORD;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.TOME;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WEAPON;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WONDEROUS;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_I extends AbstractMagicItemTable implements MagicItemTable {
    public MagicItemTable_I() {
        tableLetter = "I";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable(defaultOrModifiedTableFilters());
    }

    @Override
    public void getDefaultTable() {
        ItemFilters temp = new ItemFilters();

        temp = setBaseFilters();
        temp.setFilter(WEAPON);
        temp.setFilter(LEGENDARY);
        addItem("Defender", 5, temp);

        temp = setBaseFilters();
        temp.setFilter(HAMMER);
        temp.setFilter(LEGENDARY);
        addItem("Hammer of thunderbolts", 5, temp);

        temp = setBaseFilters();
        temp.setFilter(SWORD);
        temp.setFilter(LEGENDARY);
        addItem("Luck blade", 5, temp);
        addItem("Sword of answering", 5, temp);
        addItem("Holy avenger", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(RING);
        temp.setFilter(LEGENDARY);
        addItem("Ring of djinni summoning", 3, temp);
        addItem("Ring of invisibility", 3, temp);
        addItem("Ring of spell turning", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(ROD);
        temp.setFilter(LEGENDARY);
        addItem("Rod of lordly might", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(STAFF);
        temp.setFilter(LEGENDARY);
        addItem("Staff of the magi", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(SWORD);
        temp.setFilter(LEGENDARY);
        addItem("Vorpal sword", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(BELT);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Belt of cloud giant strength", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        addItem("Breastplate +2 ", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        temp.setFilter(LEGENDARY);
        addItem("Chain mail +3", 2, temp);
        addItem("Chain shirt +3", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(CLOAK);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Cloak of invisibility", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Crystal ball (legendary version)", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        addItem("Half plate + 1", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Iron flask", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        temp.setFilter(LEGENDARY);
        addItem("Leather armor +3", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        addItem("Plate armor +1", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ROBE);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Robe of the archmagi", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ROBE);
        temp.setFilter(LEGENDARY);
        addItem("Rod of resurrection", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        addItem("Scale mail +1", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Scarab of protection", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        addItem("Splint mail +2", 2, temp);
        addItem("Studded leather +2", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Well of many worlds", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(ENCHANTED);
        addItem("Magic armor", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Apparatus of Kwalish", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(LEGENDARY);
        addItem("Armor of invulnerability", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(BELT);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Belt of storm giant strength", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Cubic gate", 1, temp);
        addItem("Deck of many things", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(LEGENDARY);
        addItem("Efreeti chain", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        addItem("Half plate", 1, true, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Horn of Valhalla (iron)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(INSTRUMENT);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Instrument of the bards (Ollamh harp))", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Ioun stone (greater absorption)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(IOUN);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Ioun stone (mastery)", 1, temp);
        addItem("Ioun stone (regeneration)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        temp.setFilter(LEGENDARY);
        addItem("Plate armor of etherealness", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        addItem("Plate armor", 1, true, temp);

        temp = setBaseFilters();
        temp.setFilter(RING);
        temp.setFilter(LEGENDARY);
        addItem("Ring of air elemental command", 1, temp);
        addItem("Ring of earth elemental command", 1, temp);
        addItem("Ring of fire elemental command", 1, temp);
        addItem("Ring of three wishes", 1, temp);
        addItem("Ring of water elemental command", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Sphere of annihilation", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Talisman of pure good", 1, temp);
        addItem("Talisman of the sphere", 1, temp);
        addItem("Talisman of ultimate evil", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(TOME);
        temp.setFilter(WONDEROUS);
        temp.setFilter(LEGENDARY);
        addItem("Tome of the stilled tongue", 1, temp);
    }



    DamageType damageType = new DamageType();

    /*public MagicItemTableObject getItem(int number) {
        generatedStrings = new GenerateItemStrings();
        if (number < 6) {
             generatedStrings.setName("Defender");
        } else if (number < 11) {
             generatedStrings.setName("Hammer of thunderbolts");
        } else if (number < 16) {
             generatedStrings.setName("Luck blade");
        } else if (number < 21) {
             generatedStrings.setName("Sword of answering");
        } else if (number < 24) {
             generatedStrings.setName("Holy avenger");
        } else if (number < 27) {
             generatedStrings.setName("Ring of djinni summoning");
        } else if (number < 30) {
             generatedStrings.setName("Ring of invisibility");
        } else if (number < 33) {
             generatedStrings.setName("Ring of spell turning");
        } else if (number < 36) {
             generatedStrings.setName("Rod of lordly might");
        } else if (number < 39) {
             generatedStrings.setName("Staff of the magi");
        } else if (number < 42) {
             generatedStrings.setName("Vorpal sword");
        } else if (number < 44) {
             generatedStrings.setName("Belt of cloud giant strength");
        } else if (number < 46) {
             generatedStrings.setName("Armor, +2 breastplate");
        } else if (number < 48) {
             generatedStrings.setName("Armor, +3 chain mail");
        } else if (number < 50) {
             generatedStrings.setName("Armor, +3 chain shirt");
        } else if (number < 52) {
             generatedStrings.setName("Cloak of invisibility");
        } else if (number < 54) {
             generatedStrings.setName("Crystal ball (legendary version)");
        } else if (number < 56) {
             generatedStrings.setName("Armor, +1 half plate");
        } else if (number < 58) {
             generatedStrings.setName("Iron flask");
        } else if (number < 60) {
             generatedStrings.setName("Armor, +3 leather");
        } else if (number < 62) {
             generatedStrings.setName("Armor, +1 plate");
        } else if (number < 64) {
             generatedStrings.setName("Robe of the archmagi");
        } else if (number < 66) {
             generatedStrings.setName("Rod of resurrection");
        } else if (number < 68) {
             generatedStrings.setName("Armor, +1 scale mail");
        } else if (number < 70) {
             generatedStrings.setName("Scarab of protection");
        } else if (number < 72) {
             generatedStrings.setName("Armor, +2 splint");
        } else if (number < 74) {
             generatedStrings.setName("Armor, +2 studded leather");
        } else if (number < 76) {
             generatedStrings.setName("Well of many worlds");
        } else if (number == 76) {
            secondary = d.roll(12);
            if (secondary < 3)
                 generatedStrings.setName("Armor, +2 half plate");
            else if (secondary < 5)
                 generatedStrings.setName("Armor, +2 plate");
            else if (secondary < 7)
                 generatedStrings.setName("Armor, +3 studded leather");
            else if (secondary < 9)
                 generatedStrings.setName("Armor, +3 breastplate");
            else if (secondary < 11)
                 generatedStrings.setName("Armor, +3 splint");
            else if (secondary == 11)
                 generatedStrings.setName("Armor, +3 half plate");
            else
                 generatedStrings.setName("Armor, +3 plate");
        } else if (number == 77) {
             generatedStrings.setName("Apparatus of Kwalish");
        } else if (number == 78) {
             generatedStrings.setName("Armor of invulnerability");
        } else if (number == 79) {
             generatedStrings.setName("Belt of storm giant strength");
        } else if (number == 80) {
             generatedStrings.setName("Cubic gate");
        } else if (number == 81) {
             generatedStrings.setName("Deck of many things");
        } else if (number == 82) {
             generatedStrings.setName("Efreeti chain");
        } else if (number == 83) {
             generatedStrings.setName("Armor of " + damageType.getDamageType() + " resistance (half plate)");
        } else if (number == 84) {
             generatedStrings.setName("Horn of Valhalla (iron)");
        } else if (number == 85) {
             generatedStrings.setName("Instrument of the bards (Ollamh harp)");
        } else if (number == 86) {
             generatedStrings.setName("loun stone (greater absorption)");
        } else if (number == 87) {
             generatedStrings.setName("loun stone (mastery)");
        } else if (number == 88) {
             generatedStrings.setName("loun stone (regeneration)");
        } else if (number == 89) {
             generatedStrings.setName("Plate armor of etherealness");
        } else if (number == 90) {
             generatedStrings.setName("Plate armor of " + damageType.getDamageType() + " resistance");
        } else if (number == 91) {
             generatedStrings.setName("Ring of air elemental command");
        } else if (number == 92) {
             generatedStrings.setName("Ring of earth elemental command");
        } else if (number == 93) {
             generatedStrings.setName("Ring of fire elemental command");
        } else if (number == 94) {
             generatedStrings.setName("Ring of three wishes");
        } else if (number == 95) {
             generatedStrings.setName("Ring of water elemental command");
        } else if (number == 96) {
             generatedStrings.setName("Sphere of annihilation");
        } else if (number == 97) {
             generatedStrings.setName("Talisman of pure good");
        } else if (number == 98) {
             generatedStrings.setName("Talisman of the sphere");
        } else if (number == 99) {
             generatedStrings.setName("Talisman of ultimate evil");
        } else {
             generatedStrings.setName("Tome of the stilled tongue");
        }
        generatedStrings.setMagicItemtable("(Table I)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }*/
}

