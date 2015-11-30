package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_I implements MagicItemTable {
    Dice d;
    int secondary;
    DamageType damageType;

    public String getItem(int number) {
        String magicItem;
        if (number < 6) {
            magicItem = "Defender";
        } else if (number < 11) {
            magicItem = "Hammer of thunderbolts";
        } else if (number < 16) {
            magicItem = "Luck blade";
        } else if (number < 21) {
            magicItem = "Sword of answering";
        } else if (number < 24) {
            magicItem = "Holy avenger";
        } else if (number < 27) {
            magicItem = "Ring of djinni summoning";
        } else if (number < 30) {
            magicItem = "Ring of invisibility";
        } else if (number < 33) {
            magicItem = "Ring of spell turning";
        } else if (number < 36) {
            magicItem = "Rod of lordly might";
        } else if (number < 39) {
            magicItem = "Staff of the magi";
        } else if (number < 42) {
            magicItem = "Vorpal sword";
        } else if (number < 44) {
            magicItem = "Belt of cloud giant strength";
        } else if (number < 46) {
            magicItem = "Armor, +2 breastplate";
        } else if (number < 48) {
            magicItem = "Armor, +3 chain mail";
        } else if (number < 50) {
            magicItem = "Armor, +3 chain shirt";
        } else if (number < 52) {
            magicItem = "Cloak of invisibility";
        } else if (number < 54) {
            magicItem = "Crystal ball (legendary version)";
        } else if (number < 56) {
            magicItem = "Armor, +1 half plate";
        } else if (number < 58) {
            magicItem = "Iron flask";
        } else if (number < 60) {
            magicItem = "Armor, +3 leather";
        } else if (number < 62) {
            magicItem = "Armor, +1 plate";
        } else if (number < 64) {
            magicItem = "Robe of the archmagi";
        } else if (number < 66) {
            magicItem = "Rod of resurrection";
        } else if (number < 68) {
            magicItem = "Armor, +1 scale mail";
        } else if (number < 70) {
            magicItem = "Scarab of protection";
        } else if (number < 72) {
            magicItem = "Armor, +2 splint";
        } else if (number < 74) {
            magicItem = "Armor, +2 studded leather";
        } else if (number < 76) {
            magicItem = "Well of many worlds";
        } else if (number == 76) {
            secondary = d.roll(12);
            if (secondary < 3)
                magicItem = "Armor, +2 half plate";
            else if (secondary < 5)
                magicItem = "Armor, +2 plate";
            else if (secondary < 7)
                magicItem = "Armor, +3 studded leather";
            else if (secondary < 9)
                magicItem = "Armor, +3 breastplate";
            else if (secondary < 11)
                magicItem = "Armor, +3 splint";
            else if (secondary == 11)
                magicItem = "Armor, +3 half plate";
            else
                magicItem = "Armor, +3 plate";
        } else if (number == 77) {
            magicItem = "Apparatus of Kwalish";
        } else if (number == 78) {
            magicItem = "Armor of invulnerability";
        } else if (number == 79) {
            magicItem = "Belt of storm giant strength";
        } else if (number == 80) {
            magicItem = "Cubic gate";
        } else if (number == 81) {
            magicItem = "Deck of many things";
        } else if (number == 82) {
            magicItem = "Efreeti chain";
        } else if (number == 83) {
            magicItem = "Armor of " + damageType.getDamageType() + " resistance (half plate)";
        } else if (number == 84) {
            magicItem = "Horn of Valhalla (iron)";
        } else if (number == 85) {
            magicItem = "Instrument of the bards (Ollamh harp)";
        } else if (number == 86) {
            magicItem = "loun stone (greater absorption)";
        } else if (number == 87) {
            magicItem = "loun stone (mastery)";
        } else if (number == 88) {
            magicItem = "loun stone (regeneration)";
        } else if (number == 89) {
            magicItem = "Plate armor of etherealness";
        } else if (number == 90) {
            magicItem = "Plate armor of " + damageType.getDamageType() + " resistance";
        } else if (number == 91) {
            magicItem = "Ring of air elemental command";
        } else if (number == 92) {
            magicItem = "Ring of earth elemental command";
        } else if (number == 93) {
            magicItem = "Ring of fire elemental command";
        } else if (number == 94) {
            magicItem = "Ring of three wishes";
        } else if (number == 95) {
            magicItem = "Ring of water elemental command";
        } else if (number == 96) {
            magicItem = "Sphere of annihilation";
        } else if (number == 97) {
            magicItem = "Talisman of pure good";
        } else if (number == 98) {
            magicItem = "Talisman of the sphere";
        } else if (number == 99) {
            magicItem = "Talisman of ultimate evil";
        } else {
            magicItem = "Tome of the stilled tongue";
        }
        magicItem += " (Table I)";
        return magicItem;
    }
}

