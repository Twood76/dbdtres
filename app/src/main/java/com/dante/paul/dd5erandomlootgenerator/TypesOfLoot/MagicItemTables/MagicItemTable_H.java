package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_H implements MagicItemTable{

    public String getItem(int number) {
        String magicItem;

        if (number < 11) {
            //TODO determine what type
            magicItem = "Weapon, +1";
        } else if (number < 13) {
            //TODO determine what type
            magicItem = "Shield,+1";
        } else if (number < 15) {
            magicItem = "Sentinel shield";
        } else if (number < 17) {
            magicItem = "Amulet of proof against detection and location";
        } else if (number < 19) {
            magicItem = "Boots of elvenkind";
        } else if (number < 21) {
            magicItem = "Boots of striding and springing";
        } else if (number < 23) {
            magicItem = "Bracers of archery";
        } else if (number < 25) {
            magicItem = "Brooch of shielding";
        } else if (number < 27) {
            magicItem = "Broom of flying";
        } else if (number < 29) {
            magicItem = "Cloak of elvenkind";
        } else if (number < 31) {
            magicItem = "Cloak of protection";
        } else if (number < 33) {
            magicItem = "Gauntlets of ogre power";
        } else if (number < 35) {
            magicItem = "Hat of disguise";
        } else if (number < 37) {
            magicItem = "Javelin of lightning";
        } else if (number < 39) {
            magicItem = "Pearl of power";
        } else if (number < 41) {
            magicItem = "Rod of the pact keeper, +1";
        } else if (number < 43) {
            magicItem = "Slippers of spider climbing";
        } else if (number < 45) {
            magicItem = "Staff of the adder";
        } else if (number < 47) {
            magicItem = "Staff of the python";
        } else if (number < 49) {
            magicItem = "Sword of vengeance";
        } else if (number < 51) {
            magicItem = "Trident of fish command";
        } else if (number < 53) {
            magicItem = "Wand of magic missiles";
        } else if (number < 55) {
            magicItem = "Wand of the war mage, +1";
        } else if (number == 55) {
            magicItem = "Iron bands of Bilarro";
        } else if (number == 56) {
            magicItem = "Armor, +1 leather";
        } else if (number == 57) {
            //TODO type of resistance
            magicItem = "Armor of resistance (leather)";
        } else if (number == 58) {
            magicItem = "Mace of disruption";
        } else if (number == 59) {
            magicItem = "Mace of smiting";
        } else if (number == 60) {
            magicItem = "Mace of terror";
        } else if (number == 61) {
            //TODO check item
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
            //TODO type of resistance
            magicItem = "Ring of resistance";
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
            //TODO type of resistance
            magicItem = "Armor of resistance (scale mail)";
        } else if (number == 79) {
            //TODO type
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
            //TODO see item description
            magicItem = "Vicious weapon";
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
        return magicItem;
    }
}
