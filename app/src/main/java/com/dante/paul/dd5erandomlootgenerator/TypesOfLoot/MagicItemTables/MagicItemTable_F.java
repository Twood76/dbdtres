package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_F extends GenerateSpell implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {
        String magicItem;

        if (number < 16) {
            mITO.itemName = "Weapon (any), +1";
        } else if (number < 19) {
            mITO.itemName = "Shield,+1";
        } else if (number < 22) {
            mITO.itemName = "Sentinel shield";
        } else if (number < 24) {
            mITO.itemName = "Amulet of proof against detection and location";
        } else if (number < 26) {
            mITO.itemName = "Boots of elvenkind";
        } else if (number < 28) {
            mITO.itemName = "Boots of striding and springing";
        } else if (number < 30) {
            mITO.itemName = "Bracers of archery";
        } else if (number < 32) {
            mITO.itemName = "Brooch of shielding";
        } else if (number < 34) {
            mITO.itemName = "Broom of flying";
        } else if (number < 36) {
            mITO.itemName = "Cloak of elvenkind";
        } else if (number < 38) {
            mITO.itemName = "Cloak of protection";
        } else if (number < 40) {
            mITO.itemName = "Gauntlets of ogre power";
        } else if (number < 42) {
            mITO.itemName = "Hat of disguise";
        } else if (number < 44) {
            mITO.itemName = "Javelin of lightning";
        } else if (number < 46) {
            mITO.itemName = "Pearl of power";
        } else if (number < 48) {
            mITO.itemName = "Rod of the pact keeper, +1";
        } else if (number < 50) {
            mITO.itemName = "Slippers of spider climbing";
        } else if (number < 52) {
            mITO.itemName = "Staff of the adder";
        } else if (number < 54) {
            mITO.itemName = "Staff of the python";
        } else if (number < 56) {
            mITO.itemName = "Sword of vengeance";
        } else if (number < 58) {
            mITO.itemName = "Trident of fish command";
        } else if (number < 60) {
            mITO.itemName = "Wand of magic missiles";
        } else if (number < 62) {
            mITO.itemName = "Wand of the war mage, +1";
        } else if (number < 64) {
            mITO.itemName = "Wand of web";
        } else if (number < 66) {
            mITO.itemName = "Weapon (any) of warning";
        } else if (number == 66) {
            mITO.itemName = "Adamantine armor (chain mail)";
        } else if (number == 67) {
            mITO.itemName = "Adamantine armor (chain shirt)";
        } else if (number == 68) {
            mITO.itemName = "Adamantine armor (scale mail)";
        } else if (number == 69) {
            mITO.itemName = "Bag of tricks (gray)";
        } else if (number == 70) {
            mITO.itemName = "Bag of tricks (rust)";
        } else if (number == 71) {
            mITO.itemName = "Bag of tricks (tan)";
        } else if (number == 72) {
            mITO.itemName = "Boots of the winterlands";
        } else if (number == 73) {
            mITO.itemName = "Circlet of blasting";
        } else if (number == 74) {
            mITO.itemName = "Deck of illusions";
        } else if (number == 75) {
            mITO.itemName = "Eversmoking bottle";
        } else if (number == 76) {
            mITO.itemName = "Eyes of charming";
        } else if (number == 77) {
            mITO.itemName = "Eyes of the eagle";
        } else if (number == 78) {
            mITO.itemName = "Figurine of wondrous power (silver raven)";
        } else if (number == 79) {
            mITO.itemName = "Gem of brightness";
        } else if (number == 80) {
            mITO.itemName = "Gloves of missile snaring";
        } else if (number == 81) {
            mITO.itemName = "Gloves of swimming and climbing";
        } else if (number == 82) {
            mITO.itemName = "Gloves of thievery";
        } else if (number == 83) {
            mITO.itemName = "Headband of intellect";
        } else if (number == 84) {
            mITO.itemName = "Helm of telepathy";
        } else if (number == 85) {
            mITO.itemName = "Instrument of the bards (Doss lute)";
        } else if (number == 86) {
            mITO.itemName = "Instrument of the bards (Fochlucan bandore)";
        } else if (number == 87) {
            mITO.itemName = "Instrument of the bards (Mac-Fuimidh cittern)";
        } else if (number == 88) {
            mITO.itemName = "Medallion ofthoughts";
        } else if (number == 89) {
            mITO.itemName = "Necklace of adaptation";
        } else if (number == 90) {
            mITO.itemName = "Periapt of wound closure";
        } else if (number == 91) {
            mITO.itemName = "Pipes of haunting";
        } else if (number == 92) {
            mITO.itemName = "Pipes of the sewers";
        } else if (number == 93) {
            mITO.itemName = "Ring of jumping";
        } else if (number == 94) {
            mITO.itemName = "Ring of mind shielding";
        } else if (number == 95) {
            mITO.itemName = "Ring of warmth";
        } else if (number == 96) {
            mITO.itemName = "Ring of water walking";
        } else if (number == 97) {
            mITO.itemName = "Quiver of Ehlonna";
        } else if (number == 98) {
            mITO.itemName = "Stone of good luck";
        } else if (number == 99) {
            mITO.itemName = "Wind fan";
        } else {
            mITO.itemName = "Winged boots";
        }

        mITO.itemName += " (Table F)";
        return mITO;
    }
}
