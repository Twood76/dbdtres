package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem;
import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.ItemFilters;



import java.util.LinkedList;

import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.AMMO;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ARMOR;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.BOOTS;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.CLOAK;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.CURSED;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ENCHANTED;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.GEM;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.GLOVES;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.HEADGEAR;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.INSTRUMENT;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.JEWELRY;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.OTHER;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.RING;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.ROD;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.SHIELD;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.STAFF;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.SWORD;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WAND;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WEAPON;
import static com.dante.paul.dd5erandomlootgeneratorpremium.EnumeratedClasses.TypeOfItem.WONDEROUS;

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
        fillTable(defaultOrModifiedTableFilters());
    }

    @Override
    public void getDefaultTable() {
        ItemFilters temp = new ItemFilters();

        temp = setBaseFilters();
        temp.setFilter(WEAPON);
        temp.setFilter(ENCHANTED);
        addItem("Weapon (any), +1", 15, temp);

        temp = setBaseFilters();
        temp.setFilter(SHIELD);
        temp.setFilter(ENCHANTED);
        addItem("Shield, +1", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(SHIELD);
        addItem("Sentinel shield", 3, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        addItem("Amulet of proof against detection and location", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(BOOTS);
        temp.setFilter(WONDEROUS);
        addItem("Boots of elvenkind", 2, temp);
        addItem("Boots of striding and springing", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(GLOVES);
        temp.setFilter(WONDEROUS);
        addItem("Bracers of archery", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        addItem("Brooch of shielding", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Broom of flying", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(CLOAK);
        temp.setFilter(WONDEROUS);
        addItem("Cloak of elvenkind", 2, temp);
        addItem("Cloak of protection", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(GLOVES);
        temp.setFilter(WONDEROUS);
        addItem("Bracers of archery", 2, temp);
        addItem("Gauntlets of ogre power", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(HEADGEAR);
        temp.setFilter(WONDEROUS);
        addItem("Hat of disguise", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(WEAPON);
        addItem("Javelin of lightning", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(GEM);
        temp.setFilter(WONDEROUS);
        addItem("Pearl of power", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ROD);
        temp.setFilter(ENCHANTED);
        addItem("Rod of the pact keeper, + 1", 2,temp);

        temp = setBaseFilters();
        temp.setFilter(BOOTS);
        temp.setFilter(WONDEROUS);
        addItem("Slippers of spider climbing", 2,temp);

        temp = setBaseFilters();
        temp.setFilter(STAFF);
        addItem("Staff of the adder", 2, temp);
        addItem("Staff of the python", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(SWORD);
        temp.setFilter(WEAPON);
        temp.setFilter(CURSED);
        addItem("Sword of vengeance", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(WEAPON);
        addItem("Trident of fish command", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(WAND);
        addItem("Wand of magic missile", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(WAND);
        temp.setFilter(ENCHANTED);
        addItem("Wand of war mage, +1", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(WAND);
        addItem("Wand of web", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(WEAPON);
        addItem("Weapon of warning", 2, temp);

        temp = setBaseFilters();
        temp.setFilter(ARMOR);
        addItem("Adamantine armor (chain mail)", 1, temp);
        addItem("Adamantine armor (chain shirt)", 1, temp);
        addItem("Adamantine armor (scale mail)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Bag of tricks (gray)", 1, temp);
        addItem("Bag of tricks (rust)", 1, temp);
        addItem("Bag of tricks (tan)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(BOOTS);
        temp.setFilter(WONDEROUS);
        addItem("Boots of winterlands", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        addItem("Circlet of blasting", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Deck of illusions", 1, temp);
        addItem("Eversmoking bottle", 1, temp);
        addItem("Eyes of charming", 1, temp);
        addItem("Eyes of the eagle", 1, temp);
        addItem("Figurine of wonderous power (silver raven)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(GEM);
        temp.setFilter(WONDEROUS);
        addItem("Gem of brightness", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(GLOVES);
        temp.setFilter(WONDEROUS);
        addItem("Gloves of missile snaring", 1, temp);
        addItem("Gloves of swimming and climbing", 1, temp);
        addItem("Gloves of thievery", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(HEADGEAR);
        temp.setFilter(WONDEROUS);
        addItem("Headband of intellect", 1, temp);
        addItem("Helm of telepathy", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(INSTRUMENT);
        temp.setFilter(WONDEROUS);
        addItem("Instrument of the bards (Doss lute)", 1, temp);
        addItem("Instrument of the bards (Fochlucan bandore)", 1, temp);
        addItem("Instrument of the bards (Mac-Fuimidh cittern)", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(JEWELRY);
        temp.setFilter(WONDEROUS);
        addItem("Medallion of thoughts", 1,  temp);
        addItem("Necklace of adaption", 1,  temp);
        addItem("Periapt of wound closure", 1,  temp);

        temp = setBaseFilters();
        temp.setFilter(INSTRUMENT);
        temp.setFilter(WONDEROUS);
        addItem("Pipes of haunting", 1, temp);
        addItem("Pipes of sewers", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(RING);
        temp.setFilter(JEWELRY);
        addItem("Ring of jumping", 1, temp);
        addItem("Ring of mind shielding", 1, temp);
        addItem("Ring of warmth", 1, temp);
        addItem("Ring of water walking", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(AMMO);
        temp.setFilter(WONDEROUS);
        addItem("Quiver of Ehlonna", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(OTHER);
        temp.setFilter(WONDEROUS);
        addItem("Stone of good luck", 1, temp);
        addItem("Wind fan", 1, temp);

        temp = setBaseFilters();
        temp.setFilter(BOOTS);
        temp.setFilter(WONDEROUS);
        addItem("Winged boots", 1, temp);

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
