package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;

/**
 * Created by PaulD on 2015-11-23.
 */
public class ArtTypes extends ValueableItems {
    Dice d = new Dice();
    int number;

    @Override
    public String getItem(int value) {
        String artwork;
        switch (value) {
            case 25:
                artwork = " Value 25 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Silver ewer." + artwork;
                        return artwork;
                    case 2:
                        artwork = "Carved bone statuette." + artwork;
                        return artwork;
                    case 3:
                        artwork = "Small gold bracelet." + artwork;
                        return artwork;
                    case 4:
                        artwork = "Cloth-of-gold vestments." + artwork;
                        return artwork;
                    case 5:
                        artwork = "Black velvet mask stitched with silver thread." + artwork;
                        return artwork;
                    case 6:
                        artwork = "Copper chalice with silver filigree." + artwork;
                        return artwork;
                    case 7:
                        artwork = "Pair of engraved bone dice." + artwork;
                        return artwork;
                    case 8:
                        artwork = "Small mirror set in a painted wooden frame." + artwork;
                        return artwork;
                    case 9:
                        artwork = "Embroidered silk handkerchief." + artwork;
                        return artwork;
                    default:
                        artwork = "Gold locket with a painted portrait inside." + artwork;
                        return artwork;
                }
            case 250:
                artwork = " Value 250 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Gold ring set with bloodstones." + artwork;
                        return artwork;
                    case 2:
                        artwork = "Carved ivory statuette." + artwork;
                        return artwork;
                    case 3:
                        artwork = "Large gold bracelet." + artwork;
                        return artwork;
                    case 4:
                        artwork = "Silver necklace with a gemstone pendant." + artwork;
                        return artwork;
                    case 5:
                        artwork = "Bronze crown." + artwork;
                        return artwork;
                    case 6:
                        artwork = "Silk robe with gold embroidery." + artwork;
                        return artwork;
                    case 7:
                        artwork = "Large well-made tapestry." + artwork;
                        return artwork;
                    case 8:
                        artwork = "Brass mug with jade inlay." + artwork;
                        return artwork;
                    case 9:
                        artwork = "Box of turquoise animal figurines." + artwork;
                        return artwork;
                    default:
                        artwork = "Gold bird cage with electrum filigree." + artwork;
                        return artwork;
                }
            case 750:
                artwork = " Value 750 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Silver chalice set with moonstones." + artwork;
                        return artwork;
                    case 2:
                        artwork = "Silver-plated steellongsword with jet set in hilt." + artwork;
                        return artwork;
                    case 3:
                        artwork = "Carved harp ofexotic wood with ivory inlay and zircon gems." + artwork;
                        return artwork;
                    case 4:
                        artwork = "Small gold idol." + artwork;
                        return artwork;
                    case 5:
                        artwork = "Gold dragon comb set with red garnets as eyes." + artwork;
                        return artwork;
                    case 6:
                        artwork = "Bottle stopper cork embossed with gold leaf and set with amethysts." + artwork;
                        return artwork;
                    case 7:
                        artwork = "Ceremonialelectrumdaggerwit~ablackpearlin the pommel." + artwork;
                        return artwork;
                    case 8:
                        artwork = "Silver and gold brooch." + artwork;
                        return artwork;
                    case 9:
                        artwork = "Obsidian statuette with gold fittings and inlay." + artwork;
                        return artwork;
                    default:
                        artwork = "Painted gold war mask." + artwork;
                        return artwork;
                }
            case 2500:
                artwork = " Value 2500 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Fine gold chain set with a fire opal." + artwork;
                        return artwork;
                    case 2:
                        artwork = "Old masterpiece painting." + artwork;
                        return artwork;
                    case 3:
                        artwork = "Embroidered silk and velvet mantle set with numerous moonstones." + artwork;
                        return artwork;
                    case 4:
                        artwork = "Platinum bracelet set with a sapphire." + artwork;
                        return artwork;
                    case 5:
                        artwork = "Embroidered glove set with jewel chips." + artwork;
                        return artwork;
                    case 6:
                        artwork = "Jeweled anklet." + artwork;
                        return artwork;
                    case 7:
                        artwork = "Gold music box." + artwork;
                        return artwork;
                    case 8:
                        artwork = "Gold circlet set with four aquamarines." + artwork;
                        return artwork;
                    case 9:
                        artwork = "Eye patch with a mock eye set in blue sapphire and moonstone." + artwork;
                        return artwork;
                    default:
                        artwork = "A necklace string of small pink pearls." + artwork;
                        return artwork;
                }
            default: //7500 GP
                artwork = " Value 7500 GP.";
                number = d.roll(8);
                switch (number) {
                    case 1:
                        artwork = "Jeweled gold crown." + artwork;
                        return artwork;
                    case 2:
                        artwork = "Jeweled platinum ring." + artwork;
                        return artwork;
                    case 3:
                        artwork = "Small gold statuette set with rubies." + artwork;
                        return artwork;
                    case 4:
                        artwork = "Gold cup set with emeralds." + artwork;
                        return artwork;
                    case 5:
                        artwork = "Gold jewelry box with platinum filigree." + artwork;
                        return artwork;
                    case 6:
                        artwork = "Painted gold child's sarcophagus." + artwork;
                        return artwork;
                    case 7:
                        artwork = "Jade game board with solid gold playing pieces." + artwork;
                        return artwork;
                    default:
                        artwork = "Bejeweled ivory drinking horn with gold filigree." + artwork;
                        return artwork;
                }
        }
    }
}