package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_H extends GenerateSpell implements MagicItemTable {
    DamageType damageType;


    public MagicItemTableObject getItem(int number) {

        if (number < 11) {
            mITO.itemName = "Weapon (any), +3";
        } else if (number < 13) {
            mITO.itemName = "Amulet of the planes";
        } else if (number < 15) {
            mITO.itemName = "Carpet of flying";
        } else if (number < 17) {
            mITO.itemName = "Crystal ball (very rare version)";
        } else if (number < 19) {
            mITO.itemName = "Ring of regeneration";
        } else if (number < 21) {
            mITO.itemName = "Ring of shooting stars";
        } else if (number < 23) {
            mITO.itemName = "Ring of telekinesis";
        } else if (number < 25) {
            mITO.itemName = "Robe of scintillating colors";
        } else if (number < 27) {
            mITO.itemName = "Robe of stars";
        } else if (number < 29) {
            mITO.itemName = "Rod of absorption";
        } else if (number < 31) {
            mITO.itemName = "Rod of alertness";
        } else if (number < 33) {
            mITO.itemName = "Rod of security";
        } else if (number < 35) {
            mITO.itemName = "Rod of the pact keeper, +3";
        } else if (number < 37) {
            mITO.itemName = "Scimitar of speed";
        } else if (number < 39) {
            mITO.itemName = "Shield, +3";
        } else if (number < 41) {
            mITO.itemName = "Staff of fire";
        } else if (number < 43) {
            mITO.itemName = "Staff of frost";
        } else if (number < 45) {
            mITO.itemName = "Staff of power";
        } else if (number < 47) {
            mITO.itemName = "Staff of striking";
        } else if (number < 49) {
            mITO.itemName = "Staff of thunder and lightning";
        } else if (number < 51) {
            mITO.itemName = "Sword of sharpness";
        } else if (number < 53) {
            mITO.itemName = "Wand of polymorph";
        } else if (number < 55) {
            mITO.itemName = "Wand of the war mage, +3";
        } else if (number == 55) {
            mITO.itemName = "Adamantine armor (half plate)";
        } else if (number == 56) {
            mITO.itemName = "Adamantine armor (plate)";
        } else if (number == 57) {
            mITO.itemName = "Animated shield";
        } else if (number == 58) {
            mITO.itemName = "Belt of fire giant strength";
        } else if (number == 59) {
            mITO.itemName = "Belt of frost (or stone) giant strength";
        } else if (number == 60) {
            mITO.itemName = "Armor, +1 breastplate";
        } else if (number == 61) {
            mITO.itemName = "Armor of " + damageType.getDamageType() + " resistance (breastplate)";
        } else if (number == 62) {
            mITO.itemName = "Candle of invocation";
        } else if (number == 63) {
            mITO.itemName = "Armor, +2 chain mail";
        } else if (number == 64) {
            mITO.itemName = "Armor, +2 chain shirt";
        } else if (number == 65) {
            mITO.itemName = "Cloak of arachnida";
        } else if (number == 66) {
            mITO.itemName = "Dancing sword";
        } else if (number == 67) {
            mITO.itemName = "Demon armor";
        } else if (number == 68) {
            mITO.itemName = "Dragon scale mail";
        } else if (number == 69) {
            mITO.itemName = "Dwarven plate";
        } else if (number == 70) {
            mITO.itemName = "Dwarven thrower";
        } else if (number == 71) {
            mITO.itemName = "Efreeti bottle";
        } else if (number == 72) {
            mITO.itemName = "Figurine of wondrous power (obsidian steed)";
        } else if (number == 73) {
            mITO.itemName = "Frost brand";
        } else if (number == 74) {
            mITO.itemName = "Helm of brilliance";
        } else if (number == 75) {
            mITO.itemName = "Horn of Valhalla (bronze)";
        } else if (number == 76) {
            mITO.itemName = "Instrument of the bards (Anstruth harp)";
        } else if (number == 77) {
            mITO.itemName = "loun stone (absorption)";
        } else if (number == 78) {
            mITO.itemName = "loun stone (agility)";
        } else if (number == 79) {
            mITO.itemName = "loun stone (fortitude)";
        } else if (number == 80) {
            mITO.itemName = "loun stone (insight)";
        } else if (number == 81) {
            mITO.itemName = "loun stone (intellect)";
        } else if (number == 82) {
            mITO.itemName = "loun stone (leadership)";
        } else if (number == 83) {
            mITO.itemName = "loun stone (strength)";
        } else if (number == 84) {
            mITO.itemName = "Armor, +2 leather";
        } else if (number == 85) {
            mITO.itemName = "Manual of bodily health";
        } else if (number == 86) {
            mITO.itemName = "Manual of gainful exercise";
        } else if (number == 87) {
            mITO.numberOfItem += d.roll(20);
            mITO.itemName = "Manual of golems";
            if (secondary < 6)
                mITO.itemName += " (clay";
            else if (secondary < 18)
                mITO.itemName += " (flesh";
            else if (secondary == 18)
                mITO.itemName += " (iron";
            else
                mITO.itemName += " (stone";
            mITO.itemName += " or DM decides)";
        } else if (number == 88) {
            mITO.itemName = "Manual of quickness of action";
        } else if (number == 89) {
            mITO.itemName = "Mirror of life trapping";
        } else if (number == 90) {
            mITO.itemName = "Nine lives stealer";
        } else if (number == 91) {
            mITO.itemName = "Oath bow";
        } else if (number == 92) {
            mITO.itemName = "Armor, +2 scale mail";
        } else if (number == 93) {
            mITO.itemName = "Spellguard shield";
        } else if (number == 94) {
            mITO.itemName = "Armor, +1 splint";
        } else if (number == 95) {
            mITO.itemName = "Armor of resistance (splint)";
        } else if (number == 96) {
            mITO.itemName = "Armor, +1 studded leather";
        } else if (number == 97) {
            mITO.itemName = "Armor of " + damageType.getDamageType() + " resistance (studded leather)";
        } else if (number == 98) {
            mITO.itemName = "Tome of clear thought";
        } else if (number == 99) {
            mITO.itemName = "Tome of leadership and influence";
        } else {
            mITO.itemName = "Tome of understanding";
        }
        mITO.itemName += " (Table H)";
        return mITO;
    }
}
