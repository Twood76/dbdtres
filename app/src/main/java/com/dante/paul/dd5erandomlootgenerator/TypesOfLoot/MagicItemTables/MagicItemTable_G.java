package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_G extends AbstractMagicItemTable implements MagicItemTable {
    DamageType damageType = new DamageType();

    public MagicItemTableObject getItem(int number) {
        String magicItem = null;

        if (number < 12) {
            magicItemTableObject.itemName = "Weapon (any), +2";
        } else if (number < 15) {
            secondary = d.roll(8);
            if (secondary == 1)
                magicItemTableObject.itemName = "Bronze griffon";
            else if (secondary == 2)
                magicItemTableObject.itemName = "Ebony fly";
            else if (secondary == 3)
                magicItemTableObject.itemName = "Golden lions";
            else if (secondary == 4)
                magicItemTableObject.itemName = "Ivory goats";
            else if (secondary == 5)
                magicItemTableObject.itemName = "Marble elephant";
            else if (secondary < 8)
                magicItemTableObject.itemName = "Onyx dog";
            else if (secondary == 8)
                magicItemTableObject.itemName = "Serpentine owl";
        } else if (number == 15) {
            magicItemTableObject.itemName = "Adamantine armor (breastplate)";
        } else if (number == 16) {
            magicItemTableObject.itemName = "Adamantine armor (splint)";
        } else if (number == 17) {
            magicItemTableObject.itemName = "Amulet of health";
        } else if (number == 18) {
            magicItemTableObject.itemName = "Armor of vulnerability";
        } else if (number == 19) {
            magicItemTableObject.itemName = "Arrow-catching shield";
        } else if (number == 20) {
            magicItemTableObject.itemName = "Belt of dwarvenkind";
        } else if (number == 21) {
            magicItemTableObject.itemName = "Belt of hill giant strength";
        } else if (number == 22) {
            magicItemTableObject.itemName = "Berserker axe";
        } else if (number == 23) {
            magicItemTableObject.itemName = "Boots of levitation";
        } else if (number == 24) {
            magicItemTableObject.itemName = "Boots of speed";
        } else if (number == 25) {
            magicItemTableObject.itemName = "Bowl of commanding water elementals";
        } else if (number == 26) {
            magicItemTableObject.itemName = "Bracers of defense";
        } else if (number == 27) {
            magicItemTableObject.itemName = "Brazier of commanding fire elementals";
        } else if (number == 28) {
            magicItemTableObject.itemName = "Cape of the mountebank";
        } else if (number == 29) {
            magicItemTableObject.itemName = "Censer of controlling air elementals";
        } else if (number == 30) {
            magicItemTableObject.itemName = "Armor, +1 chain mail";
        } else if (number == 31) {
            magicItemTableObject.itemName = "Armor of resistance (chain mail)";
        } else if (number == 32) {
            magicItemTableObject.itemName = "Armor,+1 chain shirt";
        } else if (number == 33) {
            magicItemTableObject.itemName = "Armor of resistance (chain shirt)";
        } else if (number == 34) {
            magicItemTableObject.itemName = "Cloak of displacement";
        } else if (number == 35) {
            magicItemTableObject.itemName = "Cloak of the bat";
        } else if (number == 36) {
            magicItemTableObject.itemName = "Cube of force";
        } else if (number == 37) {
            magicItemTableObject.itemName = "Daern's instant fortress";
        } else if (number == 38) {
            magicItemTableObject.itemName = "Dagger of venom";
        } else if (number == 39) {
            magicItemTableObject.itemName = "Dimensional shackles";
        } else if (number == 40) {
            magicItemTableObject.itemName = "Dragon slayer";
        } else if (number == 41) {
            magicItemTableObject.itemName = "Elven chain";
        } else if (number == 42) {
            magicItemTableObject.itemName = "Flame tongue";
        } else if (number == 43) {
            magicItemTableObject.itemName = "Gem of seeing";
        } else if (number == 44) {
            magicItemTableObject.itemName = "Giant slayer";
        } else if (number == 45) {
            magicItemTableObject.itemName = "Clamoured studded leather";
        } else if (number == 46) {
            magicItemTableObject.itemName = "Helm of teleportation";
        } else if (number == 47) {
            magicItemTableObject.itemName = "Horn of blasting";
        } else if (number == 48) {
            secondary = d.roll(2);
                    if (secondary == 1)
                        magicItemTableObject.itemName = "Horn of Valhalla (silver)";
                    else
                        magicItemTableObject.itemName = "Horn of Valhalla (brass)";
        } else if (number == 49) {
            magicItemTableObject.itemName = "Instrument of the bards (Canaith mandolin)";
        } else if (number == 50) {
            magicItemTableObject.itemName = "Instrument of the bards (Cii lyre)";
        } else if (number == 51) {
            magicItemTableObject.itemName = "loun stone (awareness)";
        } else if (number == 52) {
            magicItemTableObject.itemName = "loun stone (protection)";
        } else if (number == 53) {
            magicItemTableObject.itemName = "loun stone (reserve)";
        } else if (number == 54) {
            magicItemTableObject.itemName = "loun stone (sustenance)";
        } else if (number == 55) {
            magicItemTableObject.itemName = "Iron bands of Bilarro";
        } else if (number == 56) {
            magicItemTableObject.itemName = "Armor, +1 leather";
        } else if (number == 57) {
            magicItemTableObject.itemName = "Armor of " + damageType.getDamageType() + " resistance (leather)";
        } else if (number == 58) {
            magicItemTableObject.itemName = "Mace of disruption";
        } else if (number == 59) {
            magicItemTableObject.itemName = "Mace of smiting";
        } else if (number == 60) {
            magicItemTableObject.itemName = "Mace of terror";
        } else if (number == 61) {
            magicItemTableObject.itemName = "Mantle of spell resistance";
        } else if (number == 62) {
            magicItemTableObject.itemName = "Necklace of prayer beads";
        } else if (number == 63) {
            magicItemTableObject.itemName = "Periapt of proof against poison";
        } else if (number == 64) {
            magicItemTableObject.itemName = "Ring of animal influence";
        } else if (number == 65) {
            magicItemTableObject.itemName = "Ring of evasion";
        } else if (number == 66) {
            magicItemTableObject.itemName = "Ring of feather falling";
        } else if (number == 67) {
            magicItemTableObject.itemName = "Ring of free action";
        } else if (number == 68) {
            magicItemTableObject.itemName = "Ring of protection";
        } else if (number == 69) {
            magicItemTableObject.itemName = "Ring of " + damageType.getDamageType() + " resistance";
        } else if (number == 70) {
            magicItemTableObject.itemName = "Ring of spell storing";
        } else if (number == 71) {
            magicItemTableObject.itemName = "Ring of the ram";
        } else if (number == 72) {
            magicItemTableObject.itemName = "Ring of X-ray vision";
        } else if (number == 73) {
            magicItemTableObject.itemName = "Robe of eyes";
        } else if (number == 74) {
            magicItemTableObject.itemName = "Rod of rulership";
        } else if (number == 75) {
            magicItemTableObject.itemName = "Rod of the pact keeper, +2";
        } else if (number == 76) {
            magicItemTableObject.itemName = "Rope of entanglement";
        } else if (number == 77) {
            magicItemTableObject.itemName = "Armor, +1 scale mail";
        } else if (number == 78) {
            magicItemTableObject.itemName = "Armor of " + damageType.getDamageType() + " resistance (scale mail)";
        } else if (number == 79) {
            magicItemTableObject.itemName = "Shield, +2";
        } else if (number == 80) {
            magicItemTableObject.itemName = "Shield of missile attraction";
        } else if (number == 81) {
            magicItemTableObject.itemName = "Staff of charming";
        } else if (number == 82) {
            magicItemTableObject.itemName = "Staff of healing";
        } else if (number == 83) {
            magicItemTableObject.itemName = "Staff of swarming insects";
        } else if (number == 84) {
            magicItemTableObject.itemName = "Staff of the woodlands";
        } else if (number == 85) {
            magicItemTableObject.itemName = "Staff of withering";
        } else if (number == 86) {
            magicItemTableObject.itemName = "Stone of controlling earth elementals";
        } else if (number == 87) {
            magicItemTableObject.itemName = "Sun blade";
        } else if (number == 88) {
            magicItemTableObject.itemName = "Sword of life stealing";
        } else if (number == 89) {
            magicItemTableObject.itemName = "Sword of life stealing";
        } else if (number == 90) {
            magicItemTableObject.itemName = "Tentacle rod";
        } else if (number == 91) {
            magicItemTableObject.itemName = "Vicious weapon (Any type)";
        } else if (number == 92) {
            magicItemTableObject.itemName = "Wand of binding";
        } else if (number == 93) {
            magicItemTableObject.itemName = "Wand of enemy detection";
        } else if (number == 94) {
            magicItemTableObject.itemName = "Wand of fear";
        } else if (number == 95) {
            magicItemTableObject.itemName = "Wand of fireballs";
        } else if (number == 96) {
            magicItemTableObject.itemName = "Wand of lightning bolts";
        } else if (number == 97) {
            magicItemTableObject.itemName = "Wand of paralysis";
        } else if (number == 98) {
            magicItemTableObject.itemName = "Wand of the war mage, +2";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Wand of wonder";
        } else {
            magicItemTableObject.itemName = "Wings of flying";
        }
        generateItemString(magicItemTableObject, "(Table G)");
        return magicItemTableObject;
    }
}