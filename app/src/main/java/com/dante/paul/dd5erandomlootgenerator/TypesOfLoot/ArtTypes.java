package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables.ArtTableObject;

/**
 * Created by PaulD on 2015-11-23.
 */
public class ArtTypes extends ValuableItems {
    Dice d = new Dice();
    int number;
    ArtTableObject artTableObject = new ArtTableObject();

    @Override
    public ArtTableObject getItem(int value) {
        String artwork;
        switch (value) {
            case 25:
                artwork = " Value 25 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Silver ewer." + artwork;
                        break;
                    case 2:
                        artwork = "Carved bone statuette." + artwork;
                        break;
                    case 3:
                        artwork = "Small gold bracelet." + artwork;
                        break;
                    case 4:
                        artwork = "Cloth-of-gold vestments." + artwork;
                        break;
                    case 5:
                        artwork = "Black velvet mask stitched with silver thread." + artwork;
                        break;
                    case 6:
                        artwork = "Copper chalice with silver filigree." + artwork;
                        break;
                    case 7:
                        artwork = "Pair of engraved bone dice." + artwork;
                        break;
                    case 8:
                        artwork = "Small mirror set in a painted wooden frame." + artwork;
                        break;
                    case 9:
                        artwork = "Embroidered silk handkerchief." + artwork;
                        break;
                    default:
                        artwork = "Gold locket with a painted portrait inside." + artwork;
                        break;
                }
                break;
            case 250:
                artwork = " Value 250 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Gold ring set with bloodstones." + artwork;
                        break;
                    case 2:
                        artwork = "Carved ivory statuette." + artwork;
                        break;
                    case 3:
                        artwork = "Large gold bracelet." + artwork;
                        break;
                    case 4:
                        artwork = "Silver necklace with a gemstone pendant." + artwork;
                        break;
                    case 5:
                        artwork = "Bronze crown." + artwork;
                        break;
                    case 6:
                        artwork = "Silk robe with gold embroidery." + artwork;
                        break;
                    case 7:
                        artwork = "Large well-made tapestry." + artwork;
                        break;
                    case 8:
                        artwork = "Brass mug with jade inlay." + artwork;
                        break;
                    case 9:
                        artwork = "Box of turquoise animal figurines." + artwork;
                        break;
                    default:
                        artwork = "Gold bird cage with electrum filigree." + artwork;
                        break;
                }
                break;
            case 750:
                artwork = " Value 750 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Silver chalice set with moonstones." + artwork;
                        break;
                    case 2:
                        artwork = "Silver-plated steellongsword with jet set in hilt." + artwork;
                        break;
                    case 3:
                        artwork = "Carved harp ofexotic wood with ivory inlay and zircon gems." + artwork;
                        break;
                    case 4:
                        artwork = "Small gold idol." + artwork;
                        break;
                    case 5:
                        artwork = "Gold dragon comb set with red garnets as eyes." + artwork;
                        break;
                    case 6:
                        artwork = "Bottle stopper cork embossed with gold leaf and set with amethysts." + artwork;
                        break;
                    case 7:
                        artwork = "Ceremonialelectrumdaggerwit~ablackpearlin the pommel." + artwork;
                        break;
                    case 8:
                        artwork = "Silver and gold brooch." + artwork;
                        break;
                    case 9:
                        artwork = "Obsidian statuette with gold fittings and inlay." + artwork;
                        break;
                    default:
                        artwork = "Painted gold war mask." + artwork;
                        break;
                }
                break;
            case 2500:
                artwork = " Value 2500 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Fine gold chain set with a fire opal." + artwork;
                        break;
                    case 2:
                        artwork = "Old masterpiece painting." + artwork;
                        break;
                    case 3:
                        artwork = "Embroidered silk and velvet mantle set with numerous moonstones." + artwork;
                        break;
                    case 4:
                        artwork = "Platinum bracelet set with a sapphire." + artwork;
                        break;
                    case 5:
                        artwork = "Embroidered glove set with jewel chips." + artwork;
                        break;
                    case 6:
                        artwork = "Jeweled anklet." + artwork;
                        break;
                    case 7:
                        artwork = "Gold music box." + artwork;
                        break;
                    case 8:
                        artwork = "Gold circlet set with four aquamarines." + artwork;
                        break;
                    case 9:
                        artwork = "Eye patch with a mock eye set in blue sapphire and moonstone." + artwork;
                        break;
                    default:
                        artwork = "A necklace string of small pink pearls." + artwork;
                        break;
                }
                break;
            default: //7500 GP
                artwork = " Value 7500 GP.";
                number = d.roll(8);
                switch (number) {
                    case 1:
                        artwork = "Jeweled gold crown." + artwork;
                        break;
                    case 2:
                        artwork = "Jeweled platinum ring." + artwork;
                        break;
                    case 3:
                        artwork = "Small gold statuette set with rubies." + artwork;
                        break;
                    case 4:
                        artwork = "Gold cup set with emeralds." + artwork;
                        break;
                    case 5:
                        artwork = "Gold jewelry box with platinum filigree." + artwork;
                        break;
                    case 6:
                        artwork = "Painted gold child's sarcophagus." + artwork;
                        break;
                    case 7:
                        artwork = "Jade game board with solid gold playing pieces." + artwork;
                        break;
                    default:
                        artwork = "Bejeweled ivory drinking horn with gold filigree." + artwork;
                        break;
                }
                break;
        }

        artTableObject.itemName = artwork;
        return artTableObject;
    }
}