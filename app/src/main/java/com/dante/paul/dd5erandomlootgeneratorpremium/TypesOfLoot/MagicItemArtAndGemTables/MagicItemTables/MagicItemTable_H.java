package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects.MagicItemTableObject;


import java.util.LinkedList;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_H extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTable_H() {
        tableLetter = "H";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable();
    }

    @Override
    public void getDefaultTable() {
        addItem("Weapon (any), +3", 10, TypeofTableItem.WEAPON, true);
        addItem("Amulet of the planes", 2, TypeofTableItem.JEWELRY, true);
        addItem("Carpet of flying", 2, TypeofTableItem.OTHER, true);
        addItem("Crystal ball (very rare version)", 2, TypeofTableItem.OTHER, true);
        addItem("Ring of regeneration", 2, TypeofTableItem.RING, true);
        addItem("Ring of shooting stars", 2, TypeofTableItem.RING, true);
        addItem("Ring of telekinesis", 2, TypeofTableItem.RING, true);
        addItem("Robe of scintillating colors", 2, TypeofTableItem.ROBE, true);
        addItem("Robe of stars", 2, TypeofTableItem.ROBE, true);
        addItem("Rod of absorption", 2, TypeofTableItem.ROD, true);
        addItem("Rod of alertness", 2, TypeofTableItem.ROD, true);
        addItem("Rod of security", 2, TypeofTableItem.ROD, true);
        addItem("Rod of the pact keeper, +3", 2, TypeofTableItem.ROD, true);
        addItem("Scimitar of speed", 2, TypeofTableItem.WEAPON, true);
        addItem("Shield, +3", 2, TypeofTableItem.SHIELD, true);
        addItem("Staff of fire", 2, TypeofTableItem.STAFF, true);
        addItem("Staff of frost", 2, TypeofTableItem.STAFF, true);
        addItem("Staff of power", 2, TypeofTableItem.STAFF, true);
        addItem("Staff of striking", 2, TypeofTableItem.STAFF, true);
        addItem("Staff of thunder and lightning", 2, TypeofTableItem.STAFF, true);
        addItem("Sword of sharpness", 2, TypeofTableItem.WEAPON, true);
        addItem("Wand of polymorph", 2, TypeofTableItem.WAND, true);
        addItem("Wand of the war mage, +3", 2, TypeofTableItem.WAND, true);
        addItem("Adamantine armor (half plate)", 1, TypeofTableItem.ARMOR, true);
        addItem("Adamantine armor (plate)", 1, TypeofTableItem.ARMOR, true);
        addItem("Animated shield", 1, TypeofTableItem.SHIELD, true);
        addItem("Belt of fire giant strength", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Belt of frost (or stone) giant strength", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Armor, +1 breastplate", 1, TypeofTableItem.ARMOR, true);
        addItem("Breastplate", 1, TypeofTableItem.ARMOR, true, true);
        addItem("Candle of invocation", 1, TypeofTableItem.OTHER, true);
        addItem("Armor, +2 chain mail", 1, TypeofTableItem.ARMOR, true);
        addItem("Armor, +2 chain shirt", 1, TypeofTableItem.ARMOR, true);
        addItem("Cloak of arachnida", 1, TypeofTableItem.CLOAK, true);
        addItem("Dancing sword", 1, TypeofTableItem.WEAPON, true);
        addItem("Demon armor", 1, TypeofTableItem.ARMOR, true);
        addItem("Dragon scale mail", 1, TypeofTableItem.ARMOR, true);
        addItem("Dwarven plate", 1, TypeofTableItem.ARMOR, true);
        addItem("Dwarven thrower (war hammer)", 1, TypeofTableItem.WEAPON, true);
        addItem("Efreeti bottle", 1, TypeofTableItem.OTHER, true);
        addItem("Figurine of wondrous power (obsidian steed)", 1, TypeofTableItem.OTHER, true);
        addItem("Frost brand", 1, TypeofTableItem.WEAPON, true);
        addItem("Helm of brilliance", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Horn of Valhalla (bronze)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Instrument of the bards (Anstruth harp)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Ioun stone (absorption)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (agility)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (fortitude)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (insight)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (intellect)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (leadership)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (strength)", 1, TypeofTableItem.OTHER, true);
        addItem("Armor, +2 leather", 1, TypeofTableItem.ARMOR, true);
        addItem("Manual of bodily health", 1, TypeofTableItem.OTHER, true);
        addItem("Manual of gainful exercise", 1, TypeofTableItem.OTHER, true);
        addItem("Manual of golems", 1, TypeofTableItem.OTHER, true);
        addItem("Manual of quickness of action", 1, TypeofTableItem.OTHER, true);
        addItem("Mirror of life trapping", 1, TypeofTableItem.OTHER, true);
        addItem("Nine lives stealer (sword)", 1, TypeofTableItem.WEAPON, true);
        addItem("Oathbow (longbow)", 1, TypeofTableItem.WEAPON, true);
        addItem("Armor, +2 (scale mail)", 1, TypeofTableItem.ARMOR, true);
        addItem("Spellguard shield", 1, TypeofTableItem.SHIELD, true);
        addItem("Armor, +1 (splint)", 1, TypeofTableItem.ARMOR, true);
        addItem("Splint Armor", 1, TypeofTableItem.ARMOR, true, true);
        addItem("Armor, +1 (studded leather)", 1, TypeofTableItem.ARMOR, true);
        addItem("Studded leather", 1, TypeofTableItem.ARMOR, true, true);
        addItem("Tome of clear thought", 1, TypeofTableItem.OTHER, true);
        addItem("Tome of leadership and influence", 1, TypeofTableItem.OTHER, true);
        addItem("Tome of understanding", 1, TypeofTableItem.OTHER, true);

    }
        DamageType damageType = new DamageType();


    /*public MagicItemTableObject getItem(int number) {
        generatedStrings = new GenerateItemStrings();
        if (number < 11) {
            generatedStrings.setName("Weapon (any), +3");
        } else if (number < 13) {
            generatedStrings.setName("Amulet of the planes");
        } else if (number < 15) {
            generatedStrings.setName("Carpet of flying");
        } else if (number < 17) {
            generatedStrings.setName("Crystal ball (very rare version)");
        } else if (number < 19) {
            generatedStrings.setName("Ring of regeneration");
        } else if (number < 21) {
            generatedStrings.setName("Ring of shooting stars");
        } else if (number < 23) {
            generatedStrings.setName("Ring of telekinesis");
        } else if (number < 25) {
            generatedStrings.setName("Robe of scintillating colors");
        } else if (number < 27) {
            generatedStrings.setName("Robe of stars");
        } else if (number < 29) {
            generatedStrings.setName("Rod of absorption");
        } else if (number < 31) {
            generatedStrings.setName("Rod of alertness");
        } else if (number < 33) {
            generatedStrings.setName("Rod of security");
        } else if (number < 35) {
            generatedStrings.setName("Rod of the pact keeper, +3");
        } else if (number < 37) {
            generatedStrings.setName("Scimitar of speed");
        } else if (number < 39) {
            generatedStrings.setName("Shield, +3");
        } else if (number < 41) {
            generatedStrings.setName("Staff of fire");
        } else if (number < 43) {
            generatedStrings.setName("Staff of frost");
        } else if (number < 45) {
            generatedStrings.setName("Staff of power");
        } else if (number < 47) {
            generatedStrings.setName("Staff of striking");
        } else if (number < 49) {
            generatedStrings.setName("Staff of thunder and lightning");
        } else if (number < 51) {
            generatedStrings.setName("Sword of sharpness");
        } else if (number < 53) {
            generatedStrings.setName("Wand of polymorph");
        } else if (number < 55) {
            generatedStrings.setName("Wand of the war mage, +3");
        } else if (number == 55) {
            generatedStrings.setName("Adamantine armor (half plate)");
        } else if (number == 56) {
            generatedStrings.setName("Adamantine armor (plate)");
        } else if (number == 57) {
            generatedStrings.setName("Animated shield");
        } else if (number == 58) {
            generatedStrings.setName("Belt of fire giant strength");
        } else if (number == 59) {
            generatedStrings.setName("Belt of frost (or stone) giant strength");
        } else if (number == 60) {
            generatedStrings.setName("Armor, +1 breastplate");
        } else if (number == 61) {
            generatedStrings.setName("Armor of " + damageType.getDamageType() + " resistance (breastplate)");
        } else if (number == 62) {
            generatedStrings.setName("Candle of invocation");
        } else if (number == 63) {
            generatedStrings.setName("Armor, +2 chain mail");
        } else if (number == 64) {
            generatedStrings.setName("Armor, +2 chain shirt");
        } else if (number == 65) {
            generatedStrings.setName("Cloak of arachnida");
        } else if (number == 66) {
            generatedStrings.setName("Dancing sword");
        } else if (number == 67) {
            generatedStrings.setName("Demon armor");
        } else if (number == 68) {
            generatedStrings.setName("Dragon scale mail");
        } else if (number == 69) {
            generatedStrings.setName("Dwarven plate");
        } else if (number == 70) {
            generatedStrings.setName("Dwarven thrower");
        } else if (number == 71) {
            generatedStrings.setName("Efreeti bottle");
        } else if (number == 72) {
            generatedStrings.setName("Figurine of wondrous power (obsidian steed)");
        } else if (number == 73) {
            generatedStrings.setName("Frost brand");
        } else if (number == 74) {
            generatedStrings.setName("Helm of brilliance");
        } else if (number == 75) {
            generatedStrings.setName("Horn of Valhalla (bronze)");
        } else if (number == 76) {
            generatedStrings.setName("Instrument of the bards (Anstruth harp)");
        } else if (number == 77) {
            generatedStrings.setName("loun stone (absorption)");
        } else if (number == 78) {
            generatedStrings.setName("loun stone (agility)");
        } else if (number == 79) {
            generatedStrings.setName("loun stone (fortitude)");
        } else if (number == 80) {
            generatedStrings.setName("loun stone (insight)");
        } else if (number == 81) {
            generatedStrings.setName("loun stone (intellect)");
        } else if (number == 82) {
            generatedStrings.setName("loun stone (leadership)");
        } else if (number == 83) {
            generatedStrings.setName("loun stone (strength)");
        } else if (number == 84) {
            generatedStrings.setName("Armor, +2 leather");
        } else if (number == 85) {
            generatedStrings.setName("Manual of bodily health");
        } else if (number == 86) {
            generatedStrings.setName("Manual of gainful exercise");
        } else if (number == 87) {
           secondary= d.roll(20);
            generatedStrings.setName("Manual of golems");
            if (secondary < 6)
                generatedStrings.setName(generatedStrings.getName() + " (clay)");
            else if (secondary < 18)
                generatedStrings.setName(generatedStrings.getName() + " (flesh)");
            else if (secondary == 18)
                generatedStrings.setName(generatedStrings.getName() + " (iron)");
            else
                generatedStrings.setName(generatedStrings.getName() + " (stone)");
            generatedStrings.setName(generatedStrings.getName() + " or DM decides)");
        } else if (number == 88) {
            generatedStrings.setName("Manual of quickness of action");
        } else if (number == 89) {
            generatedStrings.setName("Mirror of life trapping");
        } else if (number == 90) {
            generatedStrings.setName("Nine lives stealer");
        } else if (number == 91) {
            generatedStrings.setName("Oath bow");
        } else if (number == 92) {
            generatedStrings.setName("Armor, +2 scale mail");
        } else if (number == 93) {
            generatedStrings.setName("Spellguard shield");
        } else if (number == 94) {
            generatedStrings.setName("Armor, +1 splint");
        } else if (number == 95) {
            generatedStrings.setName("Armor of resistance (splint)");
        } else if (number == 96) {
            generatedStrings.setName("Armor, +1 studded leather");
        } else if (number == 97) {
            generatedStrings.setName("Armor of " + damageType.getDamageType() + " resistance (studded leather)");
        } else if (number == 98) {
            generatedStrings.setName("Tome of clear thought");
        } else if (number == 99) {
            generatedStrings.setName("Tome of leadership and influence");
        } else {
            generatedStrings.setName("Tome of understanding");
        }
        generatedStrings.setMagicItemtable("(Table H)");
        magicItemTableObject.generatedStrings = generatedStrings;
        return magicItemTableObject;
    }*/
}
