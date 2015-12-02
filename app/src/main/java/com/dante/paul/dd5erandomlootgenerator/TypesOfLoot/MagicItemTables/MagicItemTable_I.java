package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_I extends GenerateSpell implements MagicItemTable {

    DamageType damageType;

    public MagicItemTableObject getItem(int number) {
        String magicItem;
        if (number < 6) {
            mITO.itemName = "Defender";
        } else if (number < 11) {
            mITO.itemName = "Hammer of thunderbolts";
        } else if (number < 16) {
            mITO.itemName = "Luck blade";
        } else if (number < 21) {
            mITO.itemName = "Sword of answering";
        } else if (number < 24) {
            mITO.itemName = "Holy avenger";
        } else if (number < 27) {
            mITO.itemName = "Ring of djinni summoning";
        } else if (number < 30) {
            mITO.itemName = "Ring of invisibility";
        } else if (number < 33) {
            mITO.itemName = "Ring of spell turning";
        } else if (number < 36) {
            mITO.itemName = "Rod of lordly might";
        } else if (number < 39) {
            mITO.itemName = "Staff of the magi";
        } else if (number < 42) {
            mITO.itemName = "Vorpal sword";
        } else if (number < 44) {
            mITO.itemName = "Belt of cloud giant strength";
        } else if (number < 46) {
            mITO.itemName = "Armor, +2 breastplate";
        } else if (number < 48) {
            mITO.itemName = "Armor, +3 chain mail";
        } else if (number < 50) {
            mITO.itemName = "Armor, +3 chain shirt";
        } else if (number < 52) {
            mITO.itemName = "Cloak of invisibility";
        } else if (number < 54) {
            mITO.itemName = "Crystal ball (legendary version)";
        } else if (number < 56) {
            mITO.itemName = "Armor, +1 half plate";
        } else if (number < 58) {
            mITO.itemName = "Iron flask";
        } else if (number < 60) {
            mITO.itemName = "Armor, +3 leather";
        } else if (number < 62) {
            mITO.itemName = "Armor, +1 plate";
        } else if (number < 64) {
            mITO.itemName = "Robe of the archmagi";
        } else if (number < 66) {
            mITO.itemName = "Rod of resurrection";
        } else if (number < 68) {
            mITO.itemName = "Armor, +1 scale mail";
        } else if (number < 70) {
            mITO.itemName = "Scarab of protection";
        } else if (number < 72) {
            mITO.itemName = "Armor, +2 splint";
        } else if (number < 74) {
            mITO.itemName = "Armor, +2 studded leather";
        } else if (number < 76) {
            mITO.itemName = "Well of many worlds";
        } else if (number == 76) {
            secondary = d.roll(12);
            if (secondary < 3)
                mITO.itemName = "Armor, +2 half plate";
            else if (secondary < 5)
                mITO.itemName = "Armor, +2 plate";
            else if (secondary < 7)
                mITO.itemName = "Armor, +3 studded leather";
            else if (secondary < 9)
                mITO.itemName = "Armor, +3 breastplate";
            else if (secondary < 11)
                mITO.itemName = "Armor, +3 splint";
            else if (secondary == 11)
                mITO.itemName = "Armor, +3 half plate";
            else
                mITO.itemName = "Armor, +3 plate";
        } else if (number == 77) {
            mITO.itemName = "Apparatus of Kwalish";
        } else if (number == 78) {
            mITO.itemName = "Armor of invulnerability";
        } else if (number == 79) {
            mITO.itemName = "Belt of storm giant strength";
        } else if (number == 80) {
            mITO.itemName = "Cubic gate";
        } else if (number == 81) {
            mITO.itemName = "Deck of many things";
        } else if (number == 82) {
            mITO.itemName = "Efreeti chain";
        } else if (number == 83) {
            mITO.itemName = "Armor of " + damageType.getDamageType() + " resistance (half plate)";
        } else if (number == 84) {
            mITO.itemName = "Horn of Valhalla (iron)";
        } else if (number == 85) {
            mITO.itemName = "Instrument of the bards (Ollamh harp)";
        } else if (number == 86) {
            mITO.itemName = "loun stone (greater absorption)";
        } else if (number == 87) {
            mITO.itemName = "loun stone (mastery)";
        } else if (number == 88) {
            mITO.itemName = "loun stone (regeneration)";
        } else if (number == 89) {
            mITO.itemName = "Plate armor of etherealness";
        } else if (number == 90) {
            mITO.itemName = "Plate armor of " + damageType.getDamageType() + " resistance";
        } else if (number == 91) {
            mITO.itemName = "Ring of air elemental command";
        } else if (number == 92) {
            mITO.itemName = "Ring of earth elemental command";
        } else if (number == 93) {
            mITO.itemName = "Ring of fire elemental command";
        } else if (number == 94) {
            mITO.itemName = "Ring of three wishes";
        } else if (number == 95) {
            mITO.itemName = "Ring of water elemental command";
        } else if (number == 96) {
            mITO.itemName = "Sphere of annihilation";
        } else if (number == 97) {
            mITO.itemName = "Talisman of pure good";
        } else if (number == 98) {
            mITO.itemName = "Talisman of the sphere";
        } else if (number == 99) {
            mITO.itemName = "Talisman of ultimate evil";
        } else {
            mITO.itemName = "Tome of the stilled tongue";
        }
        mITO.itemName += " (Table I)";
        return mITO;
    }
}

