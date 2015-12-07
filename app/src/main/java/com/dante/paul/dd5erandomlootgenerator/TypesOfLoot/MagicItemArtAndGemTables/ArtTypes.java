package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemArtAndGemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.AbstractGeneratedStrings;
import com.dante.paul.dd5erandomlootgenerator.TreasureCreationClasses.GenerateArtorGemString;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.ArtTableObject;

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
        String valueString;
        switch (value) {
            case 25:
                valueString = " Value 25 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Silver ewer.";
                        break;
                    case 2:
                        artwork = "Carved bone statuette.";
                        break;
                    case 3:
                        artwork = "Small gold bracelet.";
                        break;
                    case 4:
                        artwork = "Cloth-of-gold vestments.";
                        break;
                    case 5:
                        artwork = "Black velvet mask stitched with silver thread.";
                        break;
                    case 6:
                        artwork = "Copper chalice with silver filigree.";
                        break;
                    case 7:
                        artwork = "Pair of engraved bone dice.";
                        break;
                    case 8:
                        artwork = "Small mirror set in a painted wooden frame.";
                        break;
                    case 9:
                        artwork = "Embroidered silk handkerchief.";
                        break;
                    default:
                        artwork = "Gold locket with a painted portrait inside.";
                        break;
                }
                break;
            case 250:
                valueString = " Value 250 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Gold ring set with bloodstones.";
                        break;
                    case 2:
                        artwork = "Carved ivory statuette.";
                        break;
                    case 3:
                        artwork = "Large gold bracelet.";
                        break;
                    case 4:
                        artwork = "Silver necklace with a gemstone pendant.";
                        break;
                    case 5:
                        artwork = "Bronze crown.";
                        break;
                    case 6:
                        artwork = "Silk robe with gold embroidery.";
                        break;
                    case 7:
                        artwork = "Large well-made tapestry.";
                        break;
                    case 8:
                        artwork = "Brass mug with jade inlay.";
                        break;
                    case 9:
                        artwork = "Box of turquoise animal figurines.";
                        break;
                    default:
                        artwork = "Gold bird cage with electrum filigree.";
                        break;
                }
                break;
            case 750:
                valueString = " Value 750 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Silver chalice set with moonstones.";
                        break;
                    case 2:
                        artwork = "Silver-plated steellongsword with jet set in hilt.";
                        break;
                    case 3:
                        artwork = "Carved harp ofexotic wood with ivory inlay and zircon gems.";
                        break;
                    case 4:
                        artwork = "Small gold idol.";
                        break;
                    case 5:
                        artwork = "Gold dragon comb set with red garnets as eyes.";
                        break;
                    case 6:
                        artwork = "Bottle stopper cork embossed with gold leaf and set with amethysts.";
                        break;
                    case 7:
                        artwork = "Ceremonialelectrumdaggerwit~ablackpearlin the pommel.";
                        break;
                    case 8:
                        artwork = "Silver and gold brooch.";
                        break;
                    case 9:
                        artwork = "Obsidian statuette with gold fittings and inlay.";
                        break;
                    default:
                        artwork = "Painted gold war mask.";
                        break;
                }
                break;
            case 2500:
                valueString = " Value 2500 GP.";
                number = d.roll(10);
                switch (number) {
                    case 1:
                        artwork = "Fine gold chain set with a fire opal.";
                        break;
                    case 2:
                        artwork = "Old masterpiece painting.";
                        break;
                    case 3:
                        artwork = "Embroidered silk and velvet mantle set with numerous moonstones.";
                        break;
                    case 4:
                        artwork = "Platinum bracelet set with a sapphire.";
                        break;
                    case 5:
                        artwork = "Embroidered glove set with jewel chips.";
                        break;
                    case 6:
                        artwork = "Jeweled anklet.";
                        break;
                    case 7:
                        artwork = "Gold music box.";
                        break;
                    case 8:
                        artwork = "Gold circlet set with four aquamarines.";
                        break;
                    case 9:
                        artwork = "Eye patch with a mock eye set in blue sapphire and moonstone.";
                        break;
                    default:
                        artwork = "A necklace string of small pink pearls.";
                        break;
                }
                break;
            default: //7500 GP
                valueString = " Value 7500 GP.";
                number = d.roll(8);
                switch (number) {
                    case 1:
                        artwork = "Jeweled gold crown.";
                        break;
                    case 2:
                        artwork = "Jeweled platinum ring.";
                        break;
                    case 3:
                        artwork = "Small gold statuette set with rubies.";
                        break;
                    case 4:
                        artwork = "Gold cup set with emeralds.";
                        break;
                    case 5:
                        artwork = "Gold jewelry box with platinum filigree.";
                        break;
                    case 6:
                        artwork = "Painted gold child's sarcophagus.";
                        break;
                    case 7:
                        artwork = "Jade game board with solid gold playing pieces.";
                        break;
                    default:
                        artwork = "Bejeweled ivory drinking horn with gold filigree.";
                        break;
                }
                break;
        }
        AbstractGeneratedStrings generatedStrings = new GenerateArtorGemString();
        generatedStrings.setName(artwork);
        generatedStrings.setMagicItemtable(valueString);
        artTableObject.generatedStrings = generatedStrings;
        return artTableObject;
    }
}