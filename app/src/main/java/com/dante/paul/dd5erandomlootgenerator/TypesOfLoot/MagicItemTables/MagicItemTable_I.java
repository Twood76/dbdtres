package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_I extends GenerateSpell implements MagicItemTable {

    DamageType damageType;

    public MagicItemTableObject getItem(int number) {
        String magicItem;
        if (number < 6) {
            magicItemTableObject.itemName = "Defender";
        } else if (number < 11) {
            magicItemTableObject.itemName = "Hammer of thunderbolts";
        } else if (number < 16) {
            magicItemTableObject.itemName = "Luck blade";
        } else if (number < 21) {
            magicItemTableObject.itemName = "Sword of answering";
        } else if (number < 24) {
            magicItemTableObject.itemName = "Holy avenger";
        } else if (number < 27) {
            magicItemTableObject.itemName = "Ring of djinni summoning";
        } else if (number < 30) {
            magicItemTableObject.itemName = "Ring of invisibility";
        } else if (number < 33) {
            magicItemTableObject.itemName = "Ring of spell turning";
        } else if (number < 36) {
            magicItemTableObject.itemName = "Rod of lordly might";
        } else if (number < 39) {
            magicItemTableObject.itemName = "Staff of the magi";
        } else if (number < 42) {
            magicItemTableObject.itemName = "Vorpal sword";
        } else if (number < 44) {
            magicItemTableObject.itemName = "Belt of cloud giant strength";
        } else if (number < 46) {
            magicItemTableObject.itemName = "Armor, +2 breastplate";
        } else if (number < 48) {
            magicItemTableObject.itemName = "Armor, +3 chain mail";
        } else if (number < 50) {
            magicItemTableObject.itemName = "Armor, +3 chain shirt";
        } else if (number < 52) {
            magicItemTableObject.itemName = "Cloak of invisibility";
        } else if (number < 54) {
            magicItemTableObject.itemName = "Crystal ball (legendary version)";
        } else if (number < 56) {
            magicItemTableObject.itemName = "Armor, +1 half plate";
        } else if (number < 58) {
            magicItemTableObject.itemName = "Iron flask";
        } else if (number < 60) {
            magicItemTableObject.itemName = "Armor, +3 leather";
        } else if (number < 62) {
            magicItemTableObject.itemName = "Armor, +1 plate";
        } else if (number < 64) {
            magicItemTableObject.itemName = "Robe of the archmagi";
        } else if (number < 66) {
            magicItemTableObject.itemName = "Rod of resurrection";
        } else if (number < 68) {
            magicItemTableObject.itemName = "Armor, +1 scale mail";
        } else if (number < 70) {
            magicItemTableObject.itemName = "Scarab of protection";
        } else if (number < 72) {
            magicItemTableObject.itemName = "Armor, +2 splint";
        } else if (number < 74) {
            magicItemTableObject.itemName = "Armor, +2 studded leather";
        } else if (number < 76) {
            magicItemTableObject.itemName = "Well of many worlds";
        } else if (number == 76) {
            secondary = d.roll(12);
            if (secondary < 3)
                magicItemTableObject.itemName = "Armor, +2 half plate";
            else if (secondary < 5)
                magicItemTableObject.itemName = "Armor, +2 plate";
            else if (secondary < 7)
                magicItemTableObject.itemName = "Armor, +3 studded leather";
            else if (secondary < 9)
                magicItemTableObject.itemName = "Armor, +3 breastplate";
            else if (secondary < 11)
                magicItemTableObject.itemName = "Armor, +3 splint";
            else if (secondary == 11)
                magicItemTableObject.itemName = "Armor, +3 half plate";
            else
                magicItemTableObject.itemName = "Armor, +3 plate";
        } else if (number == 77) {
            magicItemTableObject.itemName = "Apparatus of Kwalish";
        } else if (number == 78) {
            magicItemTableObject.itemName = "Armor of invulnerability";
        } else if (number == 79) {
            magicItemTableObject.itemName = "Belt of storm giant strength";
        } else if (number == 80) {
            magicItemTableObject.itemName = "Cubic gate";
        } else if (number == 81) {
            magicItemTableObject.itemName = "Deck of many things";
        } else if (number == 82) {
            magicItemTableObject.itemName = "Efreeti chain";
        } else if (number == 83) {
            magicItemTableObject.itemName = "Armor of " + damageType.getDamageType() + " resistance (half plate)";
        } else if (number == 84) {
            magicItemTableObject.itemName = "Horn of Valhalla (iron)";
        } else if (number == 85) {
            magicItemTableObject.itemName = "Instrument of the bards (Ollamh harp)";
        } else if (number == 86) {
            magicItemTableObject.itemName = "loun stone (greater absorption)";
        } else if (number == 87) {
            magicItemTableObject.itemName = "loun stone (mastery)";
        } else if (number == 88) {
            magicItemTableObject.itemName = "loun stone (regeneration)";
        } else if (number == 89) {
            magicItemTableObject.itemName = "Plate armor of etherealness";
        } else if (number == 90) {
            magicItemTableObject.itemName = "Plate armor of " + damageType.getDamageType() + " resistance";
        } else if (number == 91) {
            magicItemTableObject.itemName = "Ring of air elemental command";
        } else if (number == 92) {
            magicItemTableObject.itemName = "Ring of earth elemental command";
        } else if (number == 93) {
            magicItemTableObject.itemName = "Ring of fire elemental command";
        } else if (number == 94) {
            magicItemTableObject.itemName = "Ring of three wishes";
        } else if (number == 95) {
            magicItemTableObject.itemName = "Ring of water elemental command";
        } else if (number == 96) {
            magicItemTableObject.itemName = "Sphere of annihilation";
        } else if (number == 97) {
            magicItemTableObject.itemName = "Talisman of pure good";
        } else if (number == 98) {
            magicItemTableObject.itemName = "Talisman of the sphere";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Talisman of ultimate evil";
        } else {
            magicItemTableObject.itemName = "Tome of the stilled tongue";
        }
        magicItemTableObject.itemName += " (Table I)";
        return magicItemTableObject;
    }
}

