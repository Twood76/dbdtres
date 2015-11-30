package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_H implements MagicItemTable {
    DamageType damageType;
    Dice d;

    public String getItem(int number) {
        String magicItem;

        if (number < 11) {
            magicItem = "Weapon (any), +3";
        } else if (number < 13) {
            magicItem = "Amulet of the planes";
        } else if (number < 15) {
            magicItem = "Carpet of flying";
        } else if (number < 17) {
            magicItem = "Crystal ball (very rare version)";
        } else if (number < 19) {
            magicItem = "Ring of regeneration";
        } else if (number < 21) {
            magicItem = "Ring of shooting stars";
        } else if (number < 23) {
            magicItem = "Ring of telekinesis";
        } else if (number < 25) {
            magicItem = "Robe of scintillating colors";
        } else if (number < 27) {
            magicItem = "Robe of stars";
        } else if (number < 29) {
            magicItem = "Rod of absorption";
        } else if (number < 31) {
            magicItem = "Rod of alertness";
        } else if (number < 33) {
            magicItem = "Rod of security";
        } else if (number < 35) {
            magicItem = "Rod of the pact keeper, +3";
        } else if (number < 37) {
            magicItem = "Scimitar of speed";
        } else if (number < 39) {
            magicItem = "Shield, +3";
        } else if (number < 41) {
            magicItem = "Staff of fire";
        } else if (number < 43) {
            magicItem = "Staff of frost";
        } else if (number < 45) {
            magicItem = "Staff of power";
        } else if (number < 47) {
            magicItem = "Staff of striking";
        } else if (number < 49) {
            magicItem = "Staff of thunder and lightning";
        } else if (number < 51) {
            magicItem = "Sword of sharpness";
        } else if (number < 53) {
            magicItem = "Wand of polymorph";
        } else if (number < 55) {
            magicItem = "Wand of the war mage, +3";
        } else if (number == 55) {
            magicItem = "Adamantine armor (half plate)";
        } else if (number == 56) {
            magicItem = "Adamantine armor (plate)";
        } else if (number == 57) {
            magicItem = "Animated shield";
        } else if (number == 58) {
            magicItem = "Belt of fire giant strength";
        } else if (number == 59) {
            magicItem = "Belt of frost (or stone) giant strength";
        } else if (number == 60) {
            magicItem = "Armor, +1 breastplate";
        } else if (number == 61) {
            magicItem = "Armor of " + damageType.getDamageType() + " resistance (breastplate)";
        } else if (number == 62) {
            magicItem = "Candle of invocation";
        } else if (number == 63) {
            magicItem = "Armor, +2 chain mail";
        } else if (number == 64) {
            magicItem = "Armor, +2 chain shirt";
        } else if (number == 65) {
            magicItem = "Cloak of arachnida";
        } else if (number == 66) {
            magicItem = "Dancing sword";
        } else if (number == 67) {
            magicItem = "Demon armor";
        } else if (number == 68) {
            magicItem = "Dragon scale mail";
        } else if (number == 69) {
            magicItem = "Dwarven plate";
        } else if (number == 70) {
            magicItem = "Dwarven thrower";
        } else if (number == 71) {
            magicItem = "Efreeti bottle";
        } else if (number == 72) {
            magicItem = "Figurine of wondrous power (obsidian steed)";
        } else if (number == 73) {
            magicItem = "Frost brand";
        } else if (number == 74) {
            magicItem = "Helm of brilliance";
        } else if (number == 75) {
            magicItem = "Horn of Valhalla (bronze)";
        } else if (number == 76) {
            magicItem = "Instrument of the bards (Anstruth harp)";
        } else if (number == 77) {
            magicItem = "loun stone (absorption)";
        } else if (number == 78) {
            magicItem = "loun stone (agility)";
        } else if (number == 79) {
            magicItem = "loun stone (fortitude)";
        } else if (number == 80) {
            magicItem = "loun stone (insight)";
        } else if (number == 81) {
            magicItem = "loun stone (intellect)";
        } else if (number == 82) {
            magicItem = "loun stone (leadership)";
        } else if (number == 83) {
            magicItem = "loun stone (strength)";
        } else if (number == 84) {
            magicItem = "Armor, +2 leather";
        } else if (number == 85) {
            magicItem = "Manual of bodily health";
        } else if (number == 86) {
            magicItem = "Manual of gainful exercise";
        } else if (number == 87) {
            int secondary = d.roll(20);
            magicItem = "Manual of golems";
            if (secondary < 6)
                magicItem += " (clay";
            else if (secondary < 18)
                magicItem += " (flesh";
            else if (secondary == 18)
                magicItem += " (iron";
            else
                magicItem += " (stone";
            magicItem += " or DM decides)";
        } else if (number == 88) {
            magicItem = "Manual of quickness of action";
        } else if (number == 89) {
            magicItem = "Mirror of life trapping";
        } else if (number == 90) {
            magicItem = "Nine lives stealer";
        } else if (number == 91) {
            magicItem = "Oath bow";
        } else if (number == 92) {
            magicItem = "Armor, +2 scale mail";
        } else if (number == 93) {
            magicItem = "Spellguard shield";
        } else if (number == 94) {
            magicItem = "Armor, +1 splint";
        } else if (number == 95) {
            magicItem = "Armor of resistance (splint)";
        } else if (number == 96) {
            magicItem = "Armor, +1 studded leather";
        } else if (number == 97) {
            magicItem = "Armor of " + damageType.getDamageType() + " resistance (studded leather)";
        } else if (number == 98) {
            magicItem = "Tome of clear thought";
        } else if (number == 99) {
            magicItem = "Tome of leadership and influence";
        } else {
            magicItem = "Tome of understanding";
        }
        magicItem += " (Table H)";
        return magicItem;
    }
}
