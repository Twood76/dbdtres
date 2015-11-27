package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;

/**
 * Created by PaulD on 2015-11-26.
 */
public class MagicItemTable_G implements MagicItemTable {
    Dice d;

    public String getItem(int number) {
        String magicItem;

        if (number < 12) {
            //TODO determine what type
            magicItem = "Weapon, +2";
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
            magicItem = "Sentinel shield";
        } else if (number == 55) {
            magicItem = "Sentinel shield";
        } else if (number == 56) {
            magicItem = "Sentinel shield";
        } else if (number == 57) {
            magicItem = "Sentinel shield";
        } else if (number == 58) {
            magicItem = "Sentinel shield";
        } else if (number == 59) {
            magicItem = "Sentinel shield";
        } else if (number == 60) {
            magicItem = "Sentinel shield";
        } else if (number == 61) {
            magicItem = "Sentinel shield";
        } else if (number == 62) {
            magicItem = "Sentinel shield";
        } else if (number == 63) {
            magicItem = "Sentinel shield";
        } else if (number == 64) {
            magicItem = "Sentinel shield";
        } else if (number == 65) {
            magicItem = "Sentinel shield";
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