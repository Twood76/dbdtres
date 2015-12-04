package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.MagicItemTableObject;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_F extends AbstractMagicItemTable implements MagicItemTable {

    public MagicItemTableObject getItem(int number) {
        String magicItem;

        if (number < 16) {
            magicItemTableObject.itemName = "Weapon (any), +1";
        } else if (number < 19) {
            magicItemTableObject.itemName = "Shield,+1";
        } else if (number < 22) {
            magicItemTableObject.itemName = "Sentinel shield";
        } else if (number < 24) {
            magicItemTableObject.itemName = "Amulet of proof against detection and location";
        } else if (number < 26) {
            magicItemTableObject.itemName = "Boots of elvenkind";
        } else if (number < 28) {
            magicItemTableObject.itemName = "Boots of striding and springing";
        } else if (number < 30) {
            magicItemTableObject.itemName = "Bracers of archery";
        } else if (number < 32) {
            magicItemTableObject.itemName = "Brooch of shielding";
        } else if (number < 34) {
            magicItemTableObject.itemName = "Broom of flying";
        } else if (number < 36) {
            magicItemTableObject.itemName = "Cloak of elvenkind";
        } else if (number < 38) {
            magicItemTableObject.itemName = "Cloak of protection";
        } else if (number < 40) {
            magicItemTableObject.itemName = "Gauntlets of ogre power";
        } else if (number < 42) {
            magicItemTableObject.itemName = "Hat of disguise";
        } else if (number < 44) {
            magicItemTableObject.itemName = "Javelin of lightning";
        } else if (number < 46) {
            magicItemTableObject.itemName = "Pearl of power";
        } else if (number < 48) {
            magicItemTableObject.itemName = "Rod of the pact keeper, +1";
        } else if (number < 50) {
            magicItemTableObject.itemName = "Slippers of spider climbing";
        } else if (number < 52) {
            magicItemTableObject.itemName = "Staff of the adder";
        } else if (number < 54) {
            magicItemTableObject.itemName = "Staff of the python";
        } else if (number < 56) {
            magicItemTableObject.itemName = "Sword of vengeance";
        } else if (number < 58) {
            magicItemTableObject.itemName = "Trident of fish command";
        } else if (number < 60) {
            magicItemTableObject.itemName = "Wand of magic missiles";
        } else if (number < 62) {
            magicItemTableObject.itemName = "Wand of the war mage, +1";
        } else if (number < 64) {
            magicItemTableObject.itemName = "Wand of web";
        } else if (number < 66) {
            magicItemTableObject.itemName = "Weapon (any) of warning";
        } else if (number == 66) {
            magicItemTableObject.itemName = "Adamantine armor (chain mail)";
        } else if (number == 67) {
            magicItemTableObject.itemName = "Adamantine armor (chain shirt)";
        } else if (number == 68) {
            magicItemTableObject.itemName = "Adamantine armor (scale mail)";
        } else if (number == 69) {
            magicItemTableObject.itemName = "Bag of tricks (gray)";
        } else if (number == 70) {
            magicItemTableObject.itemName = "Bag of tricks (rust)";
        } else if (number == 71) {
            magicItemTableObject.itemName = "Bag of tricks (tan)";
        } else if (number == 72) {
            magicItemTableObject.itemName = "Boots of the winterlands";
        } else if (number == 73) {
            magicItemTableObject.itemName = "Circlet of blasting";
        } else if (number == 74) {
            magicItemTableObject.itemName = "Deck of illusions";
        } else if (number == 75) {
            magicItemTableObject.itemName = "Eversmoking bottle";
        } else if (number == 76) {
            magicItemTableObject.itemName = "Eyes of charming";
        } else if (number == 77) {
            magicItemTableObject.itemName = "Eyes of the eagle";
        } else if (number == 78) {
            magicItemTableObject.itemName = "Figurine of wondrous power (silver raven)";
        } else if (number == 79) {
            magicItemTableObject.itemName = "Gem of brightness";
        } else if (number == 80) {
            magicItemTableObject.itemName = "Gloves of missile snaring";
        } else if (number == 81) {
            magicItemTableObject.itemName = "Gloves of swimming and climbing";
        } else if (number == 82) {
            magicItemTableObject.itemName = "Gloves of thievery";
        } else if (number == 83) {
            magicItemTableObject.itemName = "Headband of intellect";
        } else if (number == 84) {
            magicItemTableObject.itemName = "Helm of telepathy";
        } else if (number == 85) {
            magicItemTableObject.itemName = "Instrument of the bards (Doss lute)";
        } else if (number == 86) {
            magicItemTableObject.itemName = "Instrument of the bards (Fochlucan bandore)";
        } else if (number == 87) {
            magicItemTableObject.itemName = "Instrument of the bards (Mac-Fuimidh cittern)";
        } else if (number == 88) {
            magicItemTableObject.itemName = "Medallion ofthoughts";
        } else if (number == 89) {
            magicItemTableObject.itemName = "Necklace of adaptation";
        } else if (number == 90) {
            magicItemTableObject.itemName = "Periapt of wound closure";
        } else if (number == 91) {
            magicItemTableObject.itemName = "Pipes of haunting";
        } else if (number == 92) {
            magicItemTableObject.itemName = "Pipes of the sewers";
        } else if (number == 93) {
            magicItemTableObject.itemName = "Ring of jumping";
        } else if (number == 94) {
            magicItemTableObject.itemName = "Ring of mind shielding";
        } else if (number == 95) {
            magicItemTableObject.itemName = "Ring of warmth";
        } else if (number == 96) {
            magicItemTableObject.itemName = "Ring of water walking";
        } else if (number == 97) {
            magicItemTableObject.itemName = "Quiver of Ehlonna";
        } else if (number == 98) {
            magicItemTableObject.itemName = "Stone of good luck";
        } else if (number == 99) {
            magicItemTableObject.itemName = "Wind fan";
        } else {
            magicItemTableObject.itemName = "Winged boots";
        }

        generateItemString(magicItemTableObject, "(Table F)");
        return magicItemTableObject;
    }
}
