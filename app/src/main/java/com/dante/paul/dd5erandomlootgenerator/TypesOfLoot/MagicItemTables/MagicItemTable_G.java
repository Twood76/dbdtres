package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_G extends GenerateSpell implements MagicItemTable {
    DamageType damageType = new DamageType();

    public MagicItemTableObject getItem(int number) {
        String magicItem = null;

        if (number < 12) {
            mITO.itemName = "Weapon (any), +2";
        } else if (number < 15) {
            secondary = d.roll(8);
            if (secondary == 1)
                mITO.itemName = "Bronze griffon";
            else if (secondary == 2)
                mITO.itemName = "Ebony fly";
            else if (secondary == 3)
                mITO.itemName = "Golden lions";
            else if (secondary == 4)
                mITO.itemName = "Ivory goats";
            else if (secondary == 5)
                mITO.itemName = "Marble elephant";
            else if (secondary < 8)
                mITO.itemName = "Onyx dog";
            else if (secondary == 8)
                mITO.itemName = "Serpentine owl";
        } else if (number == 15) {
            mITO.itemName = "Adamantine armor (breastplate)";
        } else if (number == 16) {
            mITO.itemName = "Adamantine armor (splint)";
        } else if (number == 17) {
            mITO.itemName = "Amulet of health";
        } else if (number == 18) {
            mITO.itemName = "Armor of vulnerability";
        } else if (number == 19) {
            mITO.itemName = "Arrow-catching shield";
        } else if (number == 20) {
            mITO.itemName = "Belt of dwarvenkind";
        } else if (number == 21) {
            mITO.itemName = "Belt of hill giant strength";
        } else if (number == 22) {
            mITO.itemName = "Berserker axe";
        } else if (number == 23) {
            mITO.itemName = "Boots of levitation";
        } else if (number == 24) {
            mITO.itemName = "Boots of speed";
        } else if (number == 25) {
            mITO.itemName = "Bowl of commanding water elementals";
        } else if (number == 26) {
            mITO.itemName = "Bracers of defense";
        } else if (number == 27) {
            mITO.itemName = "Brazier of commanding fire elementals";
        } else if (number == 28) {
            mITO.itemName = "Cape of the mountebank";
        } else if (number == 29) {
            mITO.itemName = "Censer of controlling air elementals";
        } else if (number == 30) {
            mITO.itemName = "Armor, +1 chain mail";
        } else if (number == 31) {
            mITO.itemName = "Armor of resistance (chain mail)";
        } else if (number == 32) {
            mITO.itemName = "Armor,+1 chain shirt";
        } else if (number == 33) {
            mITO.itemName = "Armor of resistance (chain shirt)";
        } else if (number == 34) {
            mITO.itemName = "Cloak of displacement";
        } else if (number == 35) {
            mITO.itemName = "Cloak of the bat";
        } else if (number == 36) {
            mITO.itemName = "Cube of force";
        } else if (number == 37) {
            mITO.itemName = "Daern's instant fortress";
        } else if (number == 38) {
            mITO.itemName = "Dagger of venom";
        } else if (number == 39) {
            mITO.itemName = "Dimensional shackles";
        } else if (number == 40) {
            mITO.itemName = "Dragon slayer";
        } else if (number == 41) {
            mITO.itemName = "Elven chain";
        } else if (number == 42) {
            mITO.itemName = "Flame tongue";
        } else if (number == 43) {
            mITO.itemName = "Gem of seeing";
        } else if (number == 44) {
            mITO.itemName = "Giant slayer";
        } else if (number == 45) {
            mITO.itemName = "Clamoured studded leather";
        } else if (number == 46) {
            mITO.itemName = "Helm of teleportation";
        } else if (number == 47) {
            mITO.itemName = "Horn of blasting";
        } else if (number == 48) {
            secondary = d.roll(2);
                    if (secondary == 1)
                        mITO.itemName = "Horn of Valhalla (silver)";
                    else
                        mITO.itemName = "Horn of Valhalla (brass)";
        } else if (number == 49) {
            mITO.itemName = "Instrument of the bards (Canaith mandolin)";
        } else if (number == 50) {
            mITO.itemName = "Instrument of the bards (Cii lyre)";
        } else if (number == 51) {
            mITO.itemName = "loun stone (awareness)";
        } else if (number == 52) {
            mITO.itemName = "loun stone (protection)";
        } else if (number == 53) {
            mITO.itemName = "loun stone (reserve)";
        } else if (number == 54) {
            mITO.itemName = "loun stone (sustenance)";
        } else if (number == 55) {
            mITO.itemName = "Iron bands of Bilarro";
        } else if (number == 56) {
            mITO.itemName = "Armor, +1 leather";
        } else if (number == 57) {
            mITO.itemName = "Armor of " + damageType.getDamageType() + " resistance (leather)";
        } else if (number == 58) {
            mITO.itemName = "Mace of disruption";
        } else if (number == 59) {
            mITO.itemName = "Mace of smiting";
        } else if (number == 60) {
            mITO.itemName = "Mace of terror";
        } else if (number == 61) {
            mITO.itemName = "Mantle of spell resistance";
        } else if (number == 62) {
            mITO.itemName = "Necklace of prayer beads";
        } else if (number == 63) {
            mITO.itemName = "Periapt of proof against poison";
        } else if (number == 64) {
            mITO.itemName = "Ring of animal influence";
        } else if (number == 65) {
            mITO.itemName = "Ring of evasion";
        } else if (number == 66) {
            mITO.itemName = "Ring of feather falling";
        } else if (number == 67) {
            mITO.itemName = "Ring of free action";
        } else if (number == 68) {
            mITO.itemName = "Ring of protection";
        } else if (number == 69) {
            mITO.itemName = "Ring of " + damageType.getDamageType() + " resistance";
        } else if (number == 70) {
            mITO.itemName = "Ring of spell storing";
        } else if (number == 71) {
            mITO.itemName = "Ring of the ram";
        } else if (number == 72) {
            mITO.itemName = "Ring of X-ray vision";
        } else if (number == 73) {
            mITO.itemName = "Robe of eyes";
        } else if (number == 74) {
            mITO.itemName = "Rod of rulership";
        } else if (number == 75) {
            mITO.itemName = "Rod of the pact keeper, +2";
        } else if (number == 76) {
            mITO.itemName = "Rope of entanglement";
        } else if (number == 77) {
            mITO.itemName = "Armor, +1 scale mail";
        } else if (number == 78) {
            mITO.itemName = "Armor of " + damageType.getDamageType() + " resistance (scale mail)";
        } else if (number == 79) {
            mITO.itemName = "Shield, +2";
        } else if (number == 80) {
            mITO.itemName = "Shield of missile attraction";
        } else if (number == 81) {
            mITO.itemName = "Staff of charming";
        } else if (number == 82) {
            mITO.itemName = "Staff of healing";
        } else if (number == 83) {
            mITO.itemName = "Staff of swarming insects";
        } else if (number == 84) {
            mITO.itemName = "Staff of the woodlands";
        } else if (number == 85) {
            mITO.itemName = "Staff of withering";
        } else if (number == 86) {
            mITO.itemName = "Stone of controlling earth elementals";
        } else if (number == 87) {
            mITO.itemName = "Sun blade";
        } else if (number == 88) {
            mITO.itemName = "Sword of life stealing";
        } else if (number == 89) {
            mITO.itemName = "Sword of life stealing";
        } else if (number == 90) {
            mITO.itemName = "Tentacle rod";
        } else if (number == 91) {
            mITO.itemName = "Vicious weapon (Any type)";
        } else if (number == 92) {
            mITO.itemName = "Wand of binding";
        } else if (number == 93) {
            mITO.itemName = "Wand of enemy detection";
        } else if (number == 94) {
            mITO.itemName = "Wand of fear";
        } else if (number == 95) {
            mITO.itemName = "Wand of fireballs";
        } else if (number == 96) {
            mITO.itemName = "Wand of lightning bolts";
        } else if (number == 97) {
            mITO.itemName = "Wand of paralysis";
        } else if (number == 98) {
            mITO.itemName = "Wand of the war mage, +2";
        } else if (number == 99) {
            mITO.itemName = "Wand of wonder";
        } else {
            mITO.itemName = "Wings of flying";
        }
        mITO.itemName += " (Table G)";
        return mITO;
    }
}