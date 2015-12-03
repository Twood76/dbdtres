package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_H extends GenerateSpell implements MagicItemTable {
    DamageType damageType = new DamageType();


    public MagicItemTableObject getItem(int number) {

        if (number < 11) {
            magicItemTableObject.itemName = "Weapon (any), +3";
        } else if (number < 13) {
            magicItemTableObject.itemName = "Amulet of the planes";
        } else if (number < 15) {
            magicItemTableObject.itemName = "Carpet of flying";
        } else if (number < 17) {
            magicItemTableObject.itemName = "Crystal ball (very rare version)";
        } else if (number < 19) {
            magicItemTableObject.itemName = "Ring of regeneration";
        } else if (number < 21) {
            magicItemTableObject.itemName = "Ring of shooting stars";
        } else if (number < 23) {
            magicItemTableObject.itemName = "Ring of telekinesis";
        } else if (number < 25) {
            magicItemTableObject.itemName = "Robe of scintillating colors";
        } else if (number < 27) {
            magicItemTableObject.itemName = "Robe of stars";
        } else if (number < 29) {
            magicItemTableObject.itemName = "Rod of absorption";
        } else if (number < 31) {
            magicItemTableObject.itemName = "Rod of alertness";
        } else if (number < 33) {
            magicItemTableObject.itemName = "Rod of security";
        } else if (number < 35) {
            magicItemTableObject.itemName = "Rod of the pact keeper, +3";
        } else if (number < 37) {
            magicItemTableObject.itemName = "Scimitar of speed";
        } else if (number < 39) {
            magicItemTableObject.itemName = "Shield, +3";
        } else if (number < 41) {
            magicItemTableObject.itemName = "Staff of fire";
        } else if (number < 43) {
            magicItemTableObject.itemName = "Staff of frost";
        } else if (number < 45) {
            magicItemTableObject.itemName = "Staff of power";
        } else if (number < 47) {
            magicItemTableObject.itemName = "Staff of striking";
        } else if (number < 49) {
            magicItemTableObject.itemName = "Staff of thunder and lightning";
        } else if (number < 51) {
            magicItemTableObject.itemName = "Sword of sharpness";
        } else if (number < 53) {
            magicItemTableObject.itemName = "Wand of polymorph";
        } else if (number < 55) {
            magicItemTableObject.itemName = "Wand of the war mage, +3";
        } else if (number == 55) {
            magicItemTableObject.itemName = "Adamantine armor (half plate)";
        } else if (number == 56) {
            magicItemTableObject.itemName = "Adamantine armor (plate)";
        } else if (number == 57) {
            magicItemTableObject.itemName = "Animated shield";
        } else if (number == 58) {
            magicItemTableObject.itemName = "Belt of fire giant strength";
        } else if (number == 59) {
            magicItemTableObject.itemName = "Belt of frost (or stone) giant strength";
        } else if (number == 60) {
            magicItemTableObject.itemName = "Armor, +1 breastplate";
        } else if (number == 61) {
            magicItemTableObject.itemName = "Armor of " + damageType.getDamageType() + " resistance (breastplate)";
        } else if (number == 62) {
            magicItemTableObject.itemName = "Candle of invocation";
        } else if (number == 63) {
            magicItemTableObject.itemName = "Armor, +2 chain mail";
        } else if (number == 64) {
            magicItemTableObject.itemName = "Armor, +2 chain shirt";
        } else if (number == 65) {
            magicItemTableObject.itemName = "Cloak of arachnida";
        } else if (number == 66) {
            magicItemTableObject.itemName = "Dancing sword";
        } else if (number == 67) {
            magicItemTableObject.itemName = "Demon armor";
        } else if (number == 68) {
            magicItemTableObject.itemName = "Dragon scale mail";
        } else if (number == 69) {
            magicItemTableObject.itemName = "Dwarven plate";
        } else if (number == 70) {
            magicItemTableObject.itemName = "Dwarven thrower";
        } else if (number == 71) {
            magicItemTableObject.itemName = "Efreeti bottle";
        } else if (number == 72) {
            magicItemTableObject.itemName = "Figurine of wondrous power (obsidian steed)";
        } else if (number == 73) {
            magicItemTableObject.itemName = "Frost brand";
        } else if (number == 74) {
            magicItemTableObject.itemName = "Helm of brilliance";
        } else if (number == 75) {
            magicItemTableObject.itemName = "Horn of Valhalla (bronze)";
        } else if (number == 76) {
            magicItemTableObject.itemName = "Instrument of the bards (Anstruth harp)";
        } else if (number == 77) {
            magicItemTableObject.itemName = "loun stone (absorption)";
        } else if (number == 78) {
            magicItemTableObject.itemName = "loun stone (agility)";
        } else if (number == 79) {
            magicItemTableObject.itemName = "loun stone (fortitude)";
        } else if (number == 80) {
            magicItemTableObject.itemName = "loun stone (insight)";
        } else if (number == 81) {
            magicItemTableObject.itemName = "loun stone (intellect)";
        } else if (number == 82) {
            magicItemTableObject.itemName = "loun stone (leadership)";
        } else if (number == 83) {
            magicItemTableObject.itemName = "loun stone (strength)";
        } else if (number == 84) {
            magicItemTableObject.itemName = "Armor, +2 leather";
        } else if (number == 85) {
            magicItemTableObject.itemName = "Manual of bodily health";
        } else if (number == 86) {
            magicItemTableObject.itemName = "Manual of gainful exercise";
        } else if (number == 87) {
            magicItemTableObject.numberOfItem += d.roll(20);
            magicItemTableObject.itemName = "Manual of golems";
            if (secondary < 6)
                magicItemTableObject.itemName += " (clay";
            else if (secondary < 18)
                magicItemTableObject.itemName += " (flesh";
            else if (secondary == 18)
                magicItemTableObject.itemName += " (iron";
            else
                magicItemTableObject.itemName += " (stone";
            magicItemTableObject.itemName += " or DM decides)";
        } else if (number == 88) {
            magicItemTableObject.itemName = "Manual of quickness of action";
        } else if (number == 89) {
            magicItemTableObject.itemName = "Mirror of life trapping";
        } else if (number == 90) {
            magicItemTableObject.itemName = "Nine lives stealer";
        } else if (number == 91) {
            magicItemTableObject.itemName = "Oath bow";
        } else if (number == 92) {
            magicItemTableObject.itemName = "Armor, +2 scale mail";
        } else if (number == 93) {
            magicItemTableObject.itemName = "Spellguard shield";
        } else if (number == 94) {
            magicItemTableObject.itemName = "Armor, +1 splint";
        } else if (number == 95) {
            magicItemTableObject.itemName = "Armor of resistance (splint)";
        } else if (number == 96) {
            magicItemTableObject.itemName = "Armor, +1 studded leather";
        } else if (number == 97) {
            magicItemTableObject.itemName = "Armor of " + damageType.getDamageType() + " resistance (studded leather)";
        } else if (number == 98) {
            magicItemTableObject.itemName = "Tome of clear thought";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Tome of leadership and influence";
        } else {
            magicItemTableObject.itemName = "Tome of understanding";
        }
        magicItemTableObject.itemName += " (Table H)";
        return magicItemTableObject;
    }
}
