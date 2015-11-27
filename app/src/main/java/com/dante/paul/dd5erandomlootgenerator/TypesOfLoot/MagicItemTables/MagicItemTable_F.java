package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_F implements MagicItemTable {

    public String getItem(int number) {
        String magicItem;

        if (number < 16) {
            //TODO determine what type
            magicItem = "Weapon, +1";
        } else if (number < 19) {
            //TODO determine what type
            magicItem = "Shield,+1";
        } else if (number < 22) {
            magicItem = "Sentinel shield";
        } else if (number < 24) {
            magicItem = "Amulet of proof against detection and location";
        } else if (number < 26) {
            magicItem = "Boots of elvenkind";
        } else if (number < 28) {
            magicItem = "Boots of striding and springing";
        } else if (number < 30) {
            magicItem = "Bracers of archery";
        } else if (number < 32) {
            magicItem = "Brooch of shielding";
        } else if (number < 34) {
            magicItem = "Broom of flying";
        } else if (number < 36) {
            magicItem = "Cloak of elvenkind";
        } else if (number < 38) {
            magicItem = "Cloak of protection";
        } else if (number < 40) {
            magicItem = "Gauntlets of ogre power";
        } else if (number < 42) {
            magicItem = "Hat of disguise";
        } else if (number < 44) {
            magicItem = "Javelin of lightning";
        } else if (number < 46) {
            magicItem = "Pearl of power";
        } else if (number < 48) {
            magicItem = "Rod of the pact keeper, +1";
        } else if (number < 50) {
            magicItem = "Slippers of spider climbing";
        } else if (number < 52) {
            magicItem = "Staff of the adder";
        } else if (number < 54) {
            magicItem = "Staff of the python";
        } else if (number < 56) {
            magicItem = "Sword of vengeance";
        } else if (number < 58) {
            magicItem = "Trident of fish command";
        } else if (number < 60) {
            //TODO charges
            magicItem = "Wand of magic missiles";
        } else if (number < 62) {
            //TODO charges
            magicItem = "Wand of the war mage, +1";
        } else if (number < 64) {
            //TODO charges
            magicItem = "Wand of web";
        } else if (number < 66) {
            //TODO determine what type
            magicItem = "Weapon of warning";
        } else if (number == 66) {
            magicItem = "Adamantine armor (chain mail)";
        } else if (number == 67) {
            magicItem = "Adamantine armor (chain shirt)";
        } else if (number == 68) {
            magicItem = "Adamantine armor (scale mail)";
        } else if (number == 69) {
            magicItem = "Bag of tricks (gray)";
        } else if (number == 70) {
            magicItem = "Bag of tricks (rust)";
        } else if (number == 71) {
            magicItem = "Bag of tricks (tan)";
        } else if (number == 72) {
            magicItem = "Boots of the winterlands";
        } else if (number == 73) {
            magicItem = "Circlet of blasting";
        } else if (number == 74) {
            magicItem = "Deck of illusions";
        } else if (number == 75) {
            magicItem = "Eversmoking bottle";
        } else if (number == 76) {
            magicItem = "Eyes of charming";
        } else if (number == 77) {
            magicItem = "Eyes of the eagle";
        } else if (number == 78) {
            magicItem = "Figurine of wondrous power (silver raven)";
        } else if (number == 79) {
            magicItem = "Gem of brightness";
        } else if (number == 80) {
            magicItem = "Gloves of missile snaring";
        } else if (number == 81) {
            magicItem = "Gloves of swimming and climbing";
        } else if (number == 82) {
            magicItem = "Gloves of thievery";
        } else if (number == 83) {
            magicItem = "Headband of intellect";
        } else if (number == 84) {
            magicItem = "Helm of telepathy";
        } else if (number == 85) {
            magicItem = "Instrument of the bards (Doss lute)";
        } else if (number == 86) {
            magicItem = "Instrument of the bards (Fochlucan bandore)";
        } else if (number == 87) {
            magicItem = "Instrument of the bards (Mac-Fuimidh cittern)";
        } else if (number == 88) {
            magicItem = "Medallion ofthoughts";
        } else if (number == 89) {
            magicItem = "Necklace of adaptation";
        } else if (number == 90) {
            magicItem = "Periapt of wound closure";
        } else if (number == 91) {
            magicItem = "Pipes of haunting";
        } else if (number == 92) {
            magicItem = "Pipes of the sewers";
        } else if (number == 93) {
            magicItem = "Ring of jumping";
        } else if (number == 94) {
            magicItem = "Ring of mind shielding";
        } else if (number == 95) {
            magicItem = "Ring of warmth";
        } else if (number == 96) {
            magicItem = "Ring of water walking";
        } else if (number == 97) {
            magicItem = "Quiver of Ehlonna";
        } else if (number == 98) {
            magicItem = "Stone of good luck";
        } else if (number == 99) {
            magicItem = "Wind fan";
        } else {
            magicItem = "Winged boots";
        }
        return magicItem;
    }
}
