package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects.MagicItemTableObject;


import java.util.LinkedList;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_F extends AbstractMagicItemTable implements MagicItemTable {
    public MagicItemTable_F() {
        tableLetter = "F";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable();
    }

    @Override
    public void getDefaultTable() {
        addItem("Weapon (any), +1", 15, TypeofTableItem.WEAPON, true);
        addItem("Shield, +1", 3, TypeofTableItem.SHIELD, true);
        addItem("Sentinel shield", 3, TypeofTableItem.SHIELD, true);
        addItem("Amulet of proof against detection and location", 2, TypeofTableItem.JEWELRY,
                true);
        addItem("Boots of elvenkind", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Boots of striding and springing", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Bracers of archery", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Brooch of shielding", 2, TypeofTableItem.JEWELRY, true);
        addItem("Broom of flying", 2, TypeofTableItem.OTHER, true);
        addItem("Cloak of elvenkind", 2, TypeofTableItem.CLOAK, true);
        addItem("Cloak of protection", 2, TypeofTableItem.CLOAK, true);
        addItem("Bracers of archery", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Gauntlets of ogre power", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Hat of disguise", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Javelin of lightning", 2, TypeofTableItem.WEAPON, true);
        addItem("Pearl of power", 2, TypeofTableItem.GEM, true);
        addItem("Rod of the pact keeper, + 1", 2, TypeofTableItem.ROD, true);
        addItem("Slippers of spider climbing", 2, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Staff of the adder", 2, TypeofTableItem.STAFF, true);
        addItem("Staff of the python", 2, TypeofTableItem.STAFF, true);
        addItem("Sword of vengeance", 2, TypeofTableItem.WEAPON, true);
        addItem("Trident of fish command", 2, TypeofTableItem.WEAPON, true);
        addItem("Wand of magic missile", 2, TypeofTableItem.WAND, true);
        addItem("Wand of war mage, +1", 2, TypeofTableItem.WAND, true);
        addItem("Wand of web", 2, TypeofTableItem.WAND, true);
        addItem("Weapon of warning", 2, TypeofTableItem.WEAPON, true);
        addItem("Adamantine armor (chain mail)", 1, TypeofTableItem.ARMOR, true);
        addItem("Adamantine armor (chain shirt)", 1, TypeofTableItem.ARMOR, true);
        addItem("Adamantine armor (scale mail)", 1, TypeofTableItem.ARMOR, true);
        addItem("Bag of tricks (gray)", 1, TypeofTableItem.OTHER, true);
        addItem("Bag of tricks (rust)", 1, TypeofTableItem.OTHER, true);
        addItem("Bag of tricks (tan)", 1, TypeofTableItem.OTHER, true);
        addItem("Boots of winterlands", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Circlet of blasting", 1, TypeofTableItem.JEWELRY, true);
        addItem("Deck of illusions", 1, TypeofTableItem.OTHER, true);
        addItem("Eversmoking bottle", 1, TypeofTableItem.OTHER, true);
        addItem("Eyes of charming", 1, TypeofTableItem.OTHER, true);
        addItem("Eyes of the eagle", 1, TypeofTableItem.OTHER, true);
        addItem("Figurine of wonderous power (silver raven)", 1, TypeofTableItem.OTHER, true);
        addItem("Gem of brightness", 1, TypeofTableItem.GEM, true);
        addItem("Gloves of missile snaring", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Gloves of swimming and climbing", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Gloves of thievery", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Headband of intellect", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Helm of telepathy", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Instrument of the bards (Doss lute)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Instrument of the bards (Fochlucan bandore)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Instrument of the bards (Mac-Fuimidh cittern)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Medallion of thoughts", 1, TypeofTableItem.JEWELRY, true);
        addItem("Necklace of adaption", 1, TypeofTableItem.JEWELRY, true);
        addItem("Periapt of wound closure", 1, TypeofTableItem.JEWELRY, true);
        addItem("Pipes of haunting", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Pipes of sewers", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Ring of jumping", 1, TypeofTableItem.RING, true);
        addItem("Ring of mind shielding", 1, TypeofTableItem.RING, true);
        addItem("Ring of warmth", 1, TypeofTableItem.RING, true);
        addItem("Ring of water walking", 1, TypeofTableItem.RING, true);
        addItem("Quiver of Ehlonna", 1, TypeofTableItem.AMMO, true);
        addItem("Stone of good luck", 1, TypeofTableItem.OTHER, true);
        addItem("Wind fan", 1, TypeofTableItem.OTHER, true);
        addItem("Winged boots", 1, TypeofTableItem.OTHERCLOTHING, true);

    }
    /*public MagicItemTableObject getItem(int number) {
        generatedStrings = new GenerateItemStrings();
        if (number < 16) {
             generatedStrings.setName("Weapon (any), +1");
        } else if (number < 19) {
             generatedStrings.setName("Shield,+1");
        } else if (number < 22) {
             generatedStrings.setName("Sentinel shield");
        } else if (number < 24) {
             generatedStrings.setName("Amulet of proof against detection and location");
        } else if (number < 26) {
             generatedStrings.setName("Boots of elvenkind");
        } else if (number < 28) {
             generatedStrings.setName("Boots of striding and springing");
        } else if (number < 30) {
             generatedStrings.setName("Bracers of archery");
        } else if (number < 32) {
             generatedStrings.setName("Brooch of shielding");
        } else if (number < 34) {
             generatedStrings.setName("Broom of flying");
        } else if (number < 36) {
             generatedStrings.setName("Cloak of elvenkind");
        } else if (number < 38) {
             generatedStrings.setName("Cloak of protection");
        } else if (number < 40) {
             generatedStrings.setName("Gauntlets of ogre power");
        } else if (number < 42) {
             generatedStrings.setName("Hat of disguise");
        } else if (number < 44) {
             generatedStrings.setName("Javelin of lightning");
        } else if (number < 46) {
             generatedStrings.setName("Pearl of power");
        } else if (number < 48) {
             generatedStrings.setName("Rod of the pact keeper, +1");
        } else if (number < 50) {
             generatedStrings.setName("Slippers of spider climbing");
        } else if (number < 52) {
             generatedStrings.setName("Staff of the adder");
        } else if (number < 54) {
             generatedStrings.setName("Staff of the python");
        } else if (number < 56) {
             generatedStrings.setName("Sword of vengeance");
        } else if (number < 58) {
             generatedStrings.setName("Trident of fish command");
        } else if (number < 60) {
             generatedStrings.setName("Wand of magic missiles");
        } else if (number < 62) {
             generatedStrings.setName("Wand of the war mage, +1");
        } else if (number < 64) {
             generatedStrings.setName("Wand of web");
        } else if (number < 66) {
             generatedStrings.setName("Weapon (any) of warning");
        } else if (number == 66) {
             generatedStrings.setName("Adamantine armor (chain mail)");
        } else if (number == 67) {
             generatedStrings.setName("Adamantine armor (chain shirt)");
        } else if (number == 68) {
             generatedStrings.setName("Adamantine armor (scale mail)");
        } else if (number == 69) {
             generatedStrings.setName("Bag of tricks (gray)");
        } else if (number == 70) {
             generatedStrings.setName("Bag of tricks (rust)");
        } else if (number == 71) {
             generatedStrings.setName("Bag of tricks (tan)");
        } else if (number == 72) {
             generatedStrings.setName("Boots of the winterlands");
        } else if (number == 73) {
             generatedStrings.setName("Circlet of blasting");
        } else if (number == 74) {
             generatedStrings.setName("Deck of illusions");
        } else if (number == 75) {
             generatedStrings.setName("Eversmoking bottle");
        } else if (number == 76) {
             generatedStrings.setName("Eyes of charming");
        } else if (number == 77) {
             generatedStrings.setName("Eyes of the eagle");
        } else if (number == 78) {
             generatedStrings.setName("Figurine of wondrous power (silver raven)");
        } else if (number == 79) {
             generatedStrings.setName("Gem of brightness");
        } else if (number == 80) {
             generatedStrings.setName("Gloves of missile snaring");
        } else if (number == 81) {
             generatedStrings.setName("Gloves of swimming and climbing");
        } else if (number == 82) {
             generatedStrings.setName("Gloves of thievery");
        } else if (number == 83) {
             generatedStrings.setName("Headband of intellect");
        } else if (number == 84) {
             generatedStrings.setName("Helm of telepathy");
        } else if (number == 85) {
             generatedStrings.setName("Instrument of the bards (Doss lute)");
        } else if (number == 86) {
             generatedStrings.setName("Instrument of the bards (Fochlucan bandore)");
        } else if (number == 87) {
             generatedStrings.setName("Instrument of the bards (Mac-Fuimidh cittern)");
        } else if (number == 88) {
             generatedStrings.setName("Medallion ofthoughts");
        } else if (number == 89) {
             generatedStrings.setName("Necklace of adaptation");
        } else if (number == 90) {
             generatedStrings.setName("Periapt of wound closure");
        } else if (number == 91) {
             generatedStrings.setName("Pipes of haunting");
        } else if (number == 92) {
             generatedStrings.setName("Pipes of the sewers");
        } else if (number == 93) {
             generatedStrings.setName("Ring of jumping");
        } else if (number == 94) {
             generatedStrings.setName("Ring of mind shielding");
        } else if (number == 95) {
             generatedStrings.setName("Ring of warmth");
        } else if (number == 96) {
             generatedStrings.setName("Ring of water walking");
        } else if (number == 97) {
             generatedStrings.setName("Quiver of Ehlonna");
        } else if (number == 98) {
             generatedStrings.setName("Stone of good luck");
        } else if (number == 99) {
             generatedStrings.setName("Wind fan");
        } else {
             generatedStrings.setName("Winged boots");
        }

        generatedStrings.setMagicItemtable("(Table F)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }*/
}
