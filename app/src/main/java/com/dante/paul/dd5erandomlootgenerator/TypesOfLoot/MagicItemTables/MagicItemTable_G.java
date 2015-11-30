package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_G implements MagicItemTable {
    Dice d = new Dice();
    DamageType damageType = new DamageType();

    public String getItem(int number) {
        String magicItem = null;

        if (number < 12) {
            magicItem = "Weapon (any), +2";
        } else if (number < 15) {
            int secondary = d.roll(8);
            if (secondary == 1)
                magicItem = "Bronze griffon";
            else if (secondary == 2)
                magicItem = "Ebony fly";
            else if (secondary == 3)
                magicItem = "Golden lions";
            else if (secondary == 4)
                magicItem = "Ivory goats";
            else if (secondary == 5)
                magicItem = "Marble elephant";
            else if (secondary < 8)
                magicItem = "Onyx dog";
            else if (secondary == 8)
                magicItem = "Serpentine owl";
        } else if (number == 15) {
            magicItem = "Adamantine armor (breastplate)";
        } else if (number == 16) {
            magicItem = "Adamantine armor (splint)";
        } else if (number == 17) {
            magicItem = "Amulet of health";
        } else if (number == 18) {
            magicItem = "Armor of vulnerability";
        } else if (number == 19) {
            magicItem = "Arrow-catching shield";
        } else if (number == 20) {
            magicItem = "Belt of dwarvenkind";
        } else if (number == 21) {
            magicItem = "Belt of hill giant strength";
        } else if (number == 22) {
            magicItem = "Berserker axe";
        } else if (number == 23) {
            magicItem = "Boots of levitation";
        } else if (number == 24) {
            magicItem = "Boots of speed";
        } else if (number == 25) {
            magicItem = "Bowl of commanding water elementals";
        } else if (number == 26) {
            magicItem = "Bracers of defense";
        } else if (number == 27) {
            magicItem = "Brazier of commanding fire elementals";
        } else if (number == 28) {
            magicItem = "Cape of the mountebank";
        } else if (number == 29) {
            magicItem = "Censer of controlling air elementals";
        } else if (number == 30) {
            magicItem = "Armor, +1 chain mail";
        } else if (number == 31) {
            magicItem = "Armor of resistance (chain mail)";
        } else if (number == 32) {
            magicItem = "Armor,+1 chain shirt";
        } else if (number == 33) {
            magicItem = "Armor of resistance (chain shirt)";
        } else if (number == 34) {
            magicItem = "Cloak of displacement";
        } else if (number == 35) {
            magicItem = "Cloak of the bat";
        } else if (number == 36) {
            magicItem = "Cube of force";
        } else if (number == 37) {
            magicItem = "Daern's instant fortress";
        } else if (number == 38) {
            magicItem = "Dagger of venom";
        } else if (number == 39) {
            magicItem = "Dimensional shackles";
        } else if (number == 40) {
            magicItem = "Dragon slayer";
        } else if (number == 41) {
            magicItem = "Elven chain";
        } else if (number == 42) {
            magicItem = "Flame tongue";
        } else if (number == 43) {
            magicItem = "Gem of seeing";
        } else if (number == 44) {
            magicItem = "Giant slayer";
        } else if (number == 45) {
            magicItem = "Clamoured studded leather";
        } else if (number == 46) {
            magicItem = "Helm of teleportation";
        } else if (number == 47) {
            magicItem = "Horn of blasting";
        } else if (number == 48) {
            int secondary = d.roll(2);
                    if (secondary == 1)
                        magicItem = "Horn of Valhalla (silver)";
                    else
                        magicItem = "Horn of Valhalla (brass)";
        } else if (number == 49) {
            magicItem = "Instrument of the bards (Canaith mandolin)";
        } else if (number == 50) {
            magicItem = "Instrument of the bards (Cii lyre)";
        } else if (number == 51) {
            magicItem = "loun stone (awareness)";
        } else if (number == 52) {
            magicItem = "loun stone (protection)";
        } else if (number == 53) {
            magicItem = "loun stone (reserve)";
        } else if (number == 54) {
            magicItem = "loun stone (sustenance)";
        } else if (number == 55) {
            magicItem = "Iron bands of Bilarro";
        } else if (number == 56) {
            magicItem = "Armor, +1 leather";
        } else if (number == 57) {
            magicItem = "Armor of " + damageType.getDamageType() + " resistance (leather)";
        } else if (number == 58) {
            magicItem = "Mace of disruption";
        } else if (number == 59) {
            magicItem = "Mace of smiting";
        } else if (number == 60) {
            magicItem = "Mace of terror";
        } else if (number == 61) {
            magicItem = "Mantle of spell resistance";
        } else if (number == 62) {
            magicItem = "Necklace of prayer beads";
        } else if (number == 63) {
            magicItem = "Periapt of proof against poison";
        } else if (number == 64) {
            magicItem = "Ring of animal influence";
        } else if (number == 65) {
            magicItem = "Ring of evasion";
        } else if (number == 66) {
            magicItem = "Ring of feather falling";
        } else if (number == 67) {
            magicItem = "Ring of free action";
        } else if (number == 68) {
            magicItem = "Ring of protection";
        } else if (number == 69) {
            magicItem = "Ring of " + damageType.getDamageType() + " resistance";
        } else if (number == 70) {
            magicItem = "Ring of spell storing";
        } else if (number == 71) {
            magicItem = "Ring of the ram";
        } else if (number == 72) {
            magicItem = "Ring of X-ray vision";
        } else if (number == 73) {
            magicItem = "Robe of eyes";
        } else if (number == 74) {
            magicItem = "Rod of rulership";
        } else if (number == 75) {
            magicItem = "Rod of the pact keeper, +2";
        } else if (number == 76) {
            magicItem = "Rope of entanglement";
        } else if (number == 77) {
            magicItem = "Armor, +1 scale mail";
        } else if (number == 78) {
            magicItem = "Armor of " + damageType.getDamageType() + " resistance (scale mail)";
        } else if (number == 79) {
            magicItem = "Shield, +2";
        } else if (number == 80) {
            magicItem = "Shield of missile attraction";
        } else if (number == 81) {
            magicItem = "Staff of charming";
        } else if (number == 82) {
            magicItem = "Staff of healing";
        } else if (number == 83) {
            magicItem = "Staff of swarming insects";
        } else if (number == 84) {
            magicItem = "Staff of the woodlands";
        } else if (number == 85) {
            magicItem = "Staff of withering";
        } else if (number == 86) {
            magicItem = "Stone of controlling earth elementals";
        } else if (number == 87) {
            magicItem = "Sun blade";
        } else if (number == 88) {
            magicItem = "Sword of life stealing";
        } else if (number == 89) {
            magicItem = "Sword of life stealing";
        } else if (number == 90) {
            magicItem = "Tentacle rod";
        } else if (number == 91) {
            magicItem = "Vicious weapon (Any type)";
        } else if (number == 92) {
            magicItem = "Wand of binding";
        } else if (number == 93) {
            magicItem = "Wand of enemy detection";
        } else if (number == 94) {
            magicItem = "Wand of fear";
        } else if (number == 95) {
            magicItem = "Wand of fireballs";
        } else if (number == 96) {
            magicItem = "Wand of lightning bolts";
        } else if (number == 97) {
            magicItem = "Wand of paralysis";
        } else if (number == 98) {
            magicItem = "Wand of the war mage, +2";
        } else if (number == 99) {
            magicItem = "Wand of wonder";
        } else {
            magicItem = "Wings of flying";
        }
        magicItem += " (Table G)";
        return magicItem;
    }
}