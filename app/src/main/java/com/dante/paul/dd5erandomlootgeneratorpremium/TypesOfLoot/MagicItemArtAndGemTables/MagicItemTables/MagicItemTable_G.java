package com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.MagicItemArtAndGemTables.MagicItemTables;


import com.dante.paul.dd5erandomlootgeneratorpremium.TreasureCreationClasses.GenerateItemStrings;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.DamageTypesAndMonsterTypes.DamageType;
import com.dante.paul.dd5erandomlootgeneratorpremium.TypesOfLoot.TableObjects.MagicItemTableObject;


import java.util.LinkedList;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_G extends AbstractMagicItemTable implements MagicItemTable {
    public MagicItemTable_G() {
        tableLetter = "G";
        tableName = creatTableName(tableLetter);
        tableItems = new LinkedList<>();
        if(!loaded()) {
            getDefaultTable();
        }
        fillTable();
    }

    @Override
    public void getDefaultTable() {
        addItem("Weapon (any), +2", 11, TypeofTableItem.WEAPON, true);
        addItem("Figurine of wonderous power", 3, TypeofTableItem.OTHER, true);
        addItem("Adamantine armor (breastplate)", 11, TypeofTableItem.ARMOR, true);
        addItem("Adamantine armor (splint)", 1, TypeofTableItem.ARMOR, true);
        addItem("Amulet of health", 1, TypeofTableItem.JEWELRY, true);
        addItem("Armor of vulnerability", 1, TypeofTableItem.ARMOR, true);
        addItem("Arrow-catching shield", 1, TypeofTableItem.SHIELD, true);
        addItem("Belt of dwarvenkind", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Belt of hill giant strength", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Berserker axe", 1, TypeofTableItem.WEAPON, true);
        addItem("Boots of levitation", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Boots of speed", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Bowl of commanding water elementals", 1, TypeofTableItem.OTHER, true);
        addItem("Bracers of defense", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Brazier of commanding fire elementals", 1, TypeofTableItem.OTHER, true);
        addItem("Cape of the mountebank", 1, TypeofTableItem.CLOAK, true);
        addItem("Censer of controlling air elementals", 1, TypeofTableItem.OTHER, true);
        addItem("Armor, +1 chain mail", 1, TypeofTableItem.ARMOR, true);
        addItem("Chain mail", 1, TypeofTableItem.ARMOR, true,true);
        addItem("Armor, +1 chain shirt", 1, TypeofTableItem.ARMOR, true);
        addItem("Chain shirt", 1, TypeofTableItem.ARMOR, true,true);
        addItem("Cloak of displacement", 1, TypeofTableItem.CLOAK, true);
        addItem("Cloak of the bat", 1, TypeofTableItem.CLOAK, true);
        addItem("Cube of force", 1, TypeofTableItem.OTHER, true);
        addItem("Daern's instant fortress", 1, TypeofTableItem.OTHER, true);
        addItem("Dagger of venom", 1, TypeofTableItem.WEAPON, true);
        addItem("Dimensional shackles", 1, TypeofTableItem.OTHER, true);
        addItem("Dragon slayer (sword)", 1, TypeofTableItem.WEAPON, true);
        addItem("Elven chain", 1, TypeofTableItem.ARMOR, true);
        addItem("Flame tongue (sword)", 1, TypeofTableItem.WEAPON, true);
        addItem("Gem of seeing", 1, TypeofTableItem.GEM, true);
        addItem("Dragon slayer (sword or axe)", 1, TypeofTableItem.WEAPON, true);
        addItem("Glamoured studded leather", 1, TypeofTableItem.ARMOR, true);
        addItem("Helm of teleportation", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Horn of blasting", 1, TypeofTableItem.OTHER, true);
        addItem("Horn of Valhalla", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Instrument of the bards (Canaith mandolin)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Instrument of the bards (Cli lyre)", 1, TypeofTableItem.INSTRUMENT, true);
        addItem("Ioun stone (awareness)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (protection)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (reserve)", 1, TypeofTableItem.OTHER, true);
        addItem("Ioun stone (sustenance)", 1, TypeofTableItem.OTHER, true);
        addItem("Iron bands of Bilarro", 1, TypeofTableItem.OTHER, true);
        addItem("Armor, +1 (leather)", 1, TypeofTableItem.ARMOR, true);
        addItem("Leather armor", 1, TypeofTableItem.ARMOR, true, true);
        addItem("Mace of disruption", 1, TypeofTableItem.WEAPON, true);
        addItem("Mace of smiting", 1, TypeofTableItem.WEAPON, true);
        addItem("Mace of terror", 1, TypeofTableItem.WEAPON, true);
        addItem("Mantle of spell resistance", 1, TypeofTableItem.OTHERCLOTHING, true);
        addItem("Necklace of prayer beads", 1, TypeofTableItem.JEWELRY, true);
        addItem("Periapt of proof against poison", 1, TypeofTableItem.JEWELRY, true);
        addItem("Ring of animal influence", 1, TypeofTableItem.RING, true);
        addItem("Ring of evasion", 1, TypeofTableItem.RING, true);
        addItem("Ring of feather falling", 1, TypeofTableItem.RING, true);
        addItem("Ring of free falling", 1, TypeofTableItem.RING, true);
        addItem("Ring of protection", 1, TypeofTableItem.RING, true);
        addItem("Ring", 1, TypeofTableItem.RING, true, true);
        addItem("Ring of spell storing", 1, TypeofTableItem.RING, true);
        addItem("Ring of the ram", 1, TypeofTableItem.RING, true);
        addItem("Ring of X-ray vision", 1, TypeofTableItem.RING, true);
        addItem("Robe of eyes", 1, TypeofTableItem.ROBE, true);
        addItem("Rod of rulership", 1, TypeofTableItem.ROD, true);
        addItem("Rod of pact keeper, +2", 1, TypeofTableItem.ROD, true);
        addItem("Robe of entanglement", 1, TypeofTableItem.ROBE, true);
        addItem("Armor, +1 (scale mail)", 1, TypeofTableItem.ARMOR, true);
        addItem("Scale mail", 1, TypeofTableItem.ARMOR, true, true);
        addItem("Shield, +2", 1, TypeofTableItem.SHIELD, true);
        addItem("Shield of missile attraction", 1, TypeofTableItem.SHIELD, true);
        addItem("Staff of charming", 1, TypeofTableItem.STAFF, true);
        addItem("Staff of healing", 1, TypeofTableItem.STAFF, true);
        addItem("Staff of woodlands", 1, TypeofTableItem.STAFF, true);
        addItem("Staff of withering", 1, TypeofTableItem.STAFF, true);
        addItem("Stone of controlling earth elementals", 1, TypeofTableItem.OTHER, true);
        addItem("Sun blade", 1, TypeofTableItem.WEAPON, true);
        addItem("Sword of life stealing", 1, TypeofTableItem.WEAPON, true);
        addItem("Sword of wounding", 1, TypeofTableItem.WEAPON, true);
        addItem("Tentacle rod", 1, TypeofTableItem.ROD, true);
        addItem("Vicious weapon (any)", 1, TypeofTableItem.WEAPON, true);
        addItem("Wand of binding", 1, TypeofTableItem.WAND, true);
        addItem("Wand of enemy detection", 1, TypeofTableItem.WAND, true);
        addItem("Wand of fear", 1, TypeofTableItem.WAND, true);
        addItem("Wand of fireballs", 1, TypeofTableItem.WAND, true);
        addItem("Wand of lightning bolts", 1, TypeofTableItem.WAND, true);
        addItem("Wand of paralysis", 1, TypeofTableItem.WAND, true);
        addItem("Wand of the war mage, +2", 1, TypeofTableItem.WAND, true);
        addItem("Wand of wonder", 1, TypeofTableItem.WAND, true);
        addItem("Wings of flying", 1, TypeofTableItem.OTHER, true);
    }


   /* DamageType damageType = new DamageType();

    public MagicItemTableObject getItem(int number) {
        generatedStrings = new GenerateItemStrings();
        if (number < 12) {
             generatedStrings.setName("Weapon (any), +2");
        } else if (number < 15) {
            secondary = d.roll(8);
            if (secondary == 1)
                 generatedStrings.setName("Bronze griffon");
            else if (secondary == 2)
                 generatedStrings.setName("Ebony fly");
            else if (secondary == 3)
                 generatedStrings.setName("Golden lions");
            else if (secondary == 4)
                 generatedStrings.setName("Ivory goats");
            else if (secondary == 5)
                 generatedStrings.setName("Marble elephant");
            else if (secondary < 8)
                 generatedStrings.setName("Onyx dog");
            else if (secondary == 8)
                 generatedStrings.setName("Serpentine owl");
        } else if (number == 15) {
             generatedStrings.setName("Adamantine armor (breastplate)");
        } else if (number == 16) {
             generatedStrings.setName("Adamantine armor (splint)");
        } else if (number == 17) {
             generatedStrings.setName("Amulet of health");
        } else if (number == 18) {
             generatedStrings.setName("Armor of vulnerability");
        } else if (number == 19) {
             generatedStrings.setName("Arrow-catching shield");
        } else if (number == 20) {
             generatedStrings.setName("Belt of dwarvenkind");
        } else if (number == 21) {
             generatedStrings.setName("Belt of hill giant strength");
        } else if (number == 22) {
             generatedStrings.setName("Berserker axe");
        } else if (number == 23) {
             generatedStrings.setName("Boots of levitation");
        } else if (number == 24) {
             generatedStrings.setName("Boots of speed");
        } else if (number == 25) {
             generatedStrings.setName("Bowl of commanding water elementals");
        } else if (number == 26) {
             generatedStrings.setName("Bracers of defense");
        } else if (number == 27) {
             generatedStrings.setName("Brazier of commanding fire elementals");
        } else if (number == 28) {
             generatedStrings.setName("Cape of the mountebank");
        } else if (number == 29) {
             generatedStrings.setName("Censer of controlling air elementals");
        } else if (number == 30) {
             generatedStrings.setName("Armor, +1 chain mail");
        } else if (number == 31) {
             generatedStrings.setName("Armor of resistance (chain mail)");
        } else if (number == 32) {
             generatedStrings.setName("Armor,+1 chain shirt");
        } else if (number == 33) {
             generatedStrings.setName("Armor of resistance (chain shirt)");
        } else if (number == 34) {
             generatedStrings.setName("Cloak of displacement");
        } else if (number == 35) {
             generatedStrings.setName("Cloak of the bat");
        } else if (number == 36) {
             generatedStrings.setName("Cube of force");
        } else if (number == 37) {
             generatedStrings.setName("Daern's instant fortress");
        } else if (number == 38) {
             generatedStrings.setName("Dagger of venom");
        } else if (number == 39) {
             generatedStrings.setName("Dimensional shackles");
        } else if (number == 40) {
             generatedStrings.setName("Dragon slayer");
        } else if (number == 41) {
             generatedStrings.setName("Elven chain");
        } else if (number == 42) {
             generatedStrings.setName("Flame tongue");
        } else if (number == 43) {
             generatedStrings.setName("Gem of seeing");
        } else if (number == 44) {
             generatedStrings.setName("Giant slayer");
        } else if (number == 45) {
             generatedStrings.setName("Clamoured studded leather");
        } else if (number == 46) {
             generatedStrings.setName("Helm of teleportation");
        } else if (number == 47) {
             generatedStrings.setName("Horn of blasting");
        } else if (number == 48) {
            secondary = d.roll(2);
                    if (secondary == 1)
                         generatedStrings.setName("Horn of Valhalla (silver)");
                    else
                         generatedStrings.setName("Horn of Valhalla (brass)");
        } else if (number == 49) {
             generatedStrings.setName("Instrument of the bards (Canaith mandolin)");
        } else if (number == 50) {
             generatedStrings.setName("Instrument of the bards (Cii lyre)");
        } else if (number == 51) {
             generatedStrings.setName("loun stone (awareness)");
        } else if (number == 52) {
             generatedStrings.setName("loun stone (protection)");
        } else if (number == 53) {
             generatedStrings.setName("loun stone (reserve)");
        } else if (number == 54) {
             generatedStrings.setName("loun stone (sustenance)");
        } else if (number == 55) {
             generatedStrings.setName("Iron bands of Bilarro");
        } else if (number == 56) {
             generatedStrings.setName("Armor, +1 leather");
        } else if (number == 57) {
             generatedStrings.setName("Armor of " + damageType.getDamageType() + " resistance (leather)");
        } else if (number == 58) {
             generatedStrings.setName("Mace of disruption");
        } else if (number == 59) {
             generatedStrings.setName("Mace of smiting");
        } else if (number == 60) {
             generatedStrings.setName("Mace of terror");
        } else if (number == 61) {
             generatedStrings.setName("Mantle of spell resistance");
        } else if (number == 62) {
             generatedStrings.setName("Necklace of prayer beads");
        } else if (number == 63) {
             generatedStrings.setName("Periapt of proof against poison");
        } else if (number == 64) {
             generatedStrings.setName("Ring of animal influence");
        } else if (number == 65) {
             generatedStrings.setName("Ring of evasion");
        } else if (number == 66) {
             generatedStrings.setName("Ring of feather falling");
        } else if (number == 67) {
             generatedStrings.setName("Ring of free action");
        } else if (number == 68) {
             generatedStrings.setName("Ring of protection");
        } else if (number == 69) {
             generatedStrings.setName("Ring of " + damageType.getDamageType() + " resistance");
        } else if (number == 70) {
             generatedStrings.setName("Ring of spell storing");
        } else if (number == 71) {
             generatedStrings.setName("Ring of the ram");
        } else if (number == 72) {
             generatedStrings.setName("Ring of X-ray vision");
        } else if (number == 73) {
             generatedStrings.setName("Robe of eyes");
        } else if (number == 74) {
             generatedStrings.setName("Rod of rulership");
        } else if (number == 75) {
             generatedStrings.setName("Rod of the pact keeper, +2");
        } else if (number == 76) {
             generatedStrings.setName("Rope of entanglement");
        } else if (number == 77) {
             generatedStrings.setName("Armor, +1 scale mail");
        } else if (number == 78) {
             generatedStrings.setName("Armor of " + damageType.getDamageType() + " resistance (scale mail)");
        } else if (number == 79) {
             generatedStrings.setName("Shield, +2");
        } else if (number == 80) {
             generatedStrings.setName("Shield of missile attraction");
        } else if (number == 81) {
             generatedStrings.setName("Staff of charming");
        } else if (number == 82) {
             generatedStrings.setName("Staff of healing");
        } else if (number == 83) {
             generatedStrings.setName("Staff of swarming insects");
        } else if (number == 84) {
             generatedStrings.setName("Staff of the woodlands");
        } else if (number == 85) {
             generatedStrings.setName("Staff of withering");
        } else if (number == 86) {
             generatedStrings.setName("Stone of controlling earth elementals");
        } else if (number == 87) {
             generatedStrings.setName("Sun blade");
        } else if (number == 88) {
             generatedStrings.setName("Sword of life stealing");
        } else if (number == 89) {
             generatedStrings.setName("Sword of life stealing");
        } else if (number == 90) {
             generatedStrings.setName("Tentacle rod");
        } else if (number == 91) {
             generatedStrings.setName("Vicious weapon (Any type)");
        } else if (number == 92) {
             generatedStrings.setName("Wand of binding");
        } else if (number == 93) {
             generatedStrings.setName("Wand of enemy detection");
        } else if (number == 94) {
             generatedStrings.setName("Wand of fear");
        } else if (number == 95) {
             generatedStrings.setName("Wand of fireballs");
        } else if (number == 96) {
             generatedStrings.setName("Wand of lightning bolts");
        } else if (number == 97) {
             generatedStrings.setName("Wand of paralysis");
        } else if (number == 98) {
             generatedStrings.setName("Wand of the war mage, +2");
        } else if (number == 99) {
             generatedStrings.setName("Wand of wonder");
        } else {
             generatedStrings.setName("Wings of flying");
        }
        generatedStrings.setMagicItemtable("(Table G)");
        magicItemTableObject.generatedStrings=generatedStrings;
        return magicItemTableObject;
    }*/
}