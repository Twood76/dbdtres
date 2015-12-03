package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.TableObjects.GemTableObject;

/**
 * Created by PaulD on 2015-11-23.
 */
public class GemTypes extends ValuableItems {
    Dice d = new Dice();
    int number;
    GemTableObject tableObject = new GemTableObject();

    @Override
    public GemTableObject getItem(int value) {
        int option;
        switch (value) {
            case 10:
                number = d.roll(12);
                switch (number) {
                    case 1:
                        tableObject.itemName = "Azurite (opaque mottled deep blue). Value 10 GP";
                        break;
                    case 2:
                        option = d.roll(4);
                        if (option == 1)
                            tableObject.itemName = "Banded agate (translucent striped brown). Value 10 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Banded agate (translucent striped blue). Value 10 GP.";
                        else if (option == 3)
                            tableObject.itemName = "Banded agate (translucent striped white). Value 10 GP.";
                        else
                            tableObject.itemName = "Banded agate (translucent striped red). Value 10 GP.";
                        break;
                    case 3:
                        tableObject.itemName = "Blue quartz (transparent pale blue). Value 10 GP.";
                        break;
                    case 4:
                        option = d.roll(5);
                        if (option == 1)
                            tableObject.itemName = "Eye agate (translucent circles of brown). Value 10 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Eye agate (translucent circles of blue). Value 10 GP.";
                        else if (option == 3)
                            tableObject.itemName = "Eye agate (translucent circles of white). Value 10 GP.";
                        else if (option == 4)
                            tableObject.itemName = "Eye agate (translucent circles of red). Value 10 GP.";
                        else
                            tableObject.itemName = "Eye agate (translucent circles of grey). Value 10 GP.";
                        break;
                    case 5:
                        tableObject.itemName = "Hematite (opaque grey-black). Value 10 GP.";
                        break;
                    case 6:
                        tableObject.itemName = "Lapis lazuli (opaque light and dark blue with yellow flecks). Value 10 GP.";
                        break;
                    case 7:
                        tableObject.itemName = "Malachite (opaque striated light and dark green). Value 10 GP.";
                        break;
                    case 8:
                        option = d.roll(4);
                        if (option == 1)
                            tableObject.itemName = "Moss agate (translucent pink with mossy gray markings). Value 10 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Moss agate (translucent pink with green markings). Value 10 GP.";
                        else if (option == 3)
                            tableObject.itemName = "Moss agate (translucent yellow-white with mossy gray markings). Value 10 GP.";
                        else
                            tableObject.itemName = "Moss agate (translucent yellow-white with green markings). Value 10 GP.";
                        break;
                    case 9:
                        tableObject.itemName = "Obsidian (opaque black). Value 10 GP.";
                        break;
                    case 10:
                        tableObject.itemName = "Rhodochrosite (opaque light pink). Value 10 GP.";
                        break;
                    case 11:
                        tableObject.itemName = "Tiger eye (translucent brown with golden center). Value 10 GP.";
                        break;
                    default:
                        tableObject.itemName = "Turquoise (opaque light blue-green). Value 10 GP.";
                        break;
                }
                break;
            case 50:
                number = d.roll(12);
                switch (number) {
                    case 1:
                        tableObject.itemName = "Bloodstone (opaque dark gray with red flecks). Value 50 GP";
                        break;
                    case 2:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Carnelian (opaque orange). Value 50 GP.";
                        else
                            tableObject.itemName = "Carnelian (opaque red-brown). Value 50 GP.";
                        break;
                    case 3:
                        tableObject.itemName = "Chalcedony (opaque white). Value 50 GP.";
                        break;
                    case 4:
                        tableObject.itemName = "Chrysoprase (translucent green). Value 50 GP.";
                        break;
                    case 5:
                        tableObject.itemName = "Citrine (transparent pale yellow-brown). Value 50 GP.";
                        break;
                    case 6:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Jasper (opaque blue). Value 50 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Jasper (opaque black). Value 50 GP.";
                        else
                            tableObject.itemName = "Jasper (opaque brown). Value 50 GP.";
                        break;
                    case 7:
                        tableObject.itemName = "Moonstone (translucent white with pale blue glow). Value 50 GP.";
                        break;
                    case 8:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Onyx (opaque bands of black and white). Value 50 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Onyx (pure black). Value 50 GP.";
                        else
                            tableObject.itemName = "Onyx (pure white). Value 50 GP.";
                        break;
                    case 9:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Quartz (transparent white). Value 50 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Quartz (transparent smokey gray). Value 50 GP.";
                        else
                            tableObject.itemName = "Quartz (transparent yellow). Value 50 GP.";
                        break;
                    case 10:
                        tableObject.itemName = "Sardonyx (opaque bands of red and white). Value 50 GP";
                        break;
                    case 11:
                        tableObject.itemName = "Star rose quartz (translucent rosy stone with white star-shaped center). Value 50 GP.";
                        break;
                    default:
                        tableObject.itemName = "Zircon (transparent pale blue-green). Value 50 GP.";
                        break;
                }
                break;
            case 100:
                number = d.roll(10);
                switch (number) {
                    case 1:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Amber (transparent watery gold). Value 100 GP.";
                        else
                            tableObject.itemName = "Amber (transparent rich gold). Value 100 GP.";
                        break;
                    case 2:
                        tableObject.itemName = "Amethyst (transparent deep purple). Value 100 GP.";
                        break;
                    case 3:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Chrysoberyl (transparent yellow-green). Value 100 GP.";
                        else
                            tableObject.itemName = "Chrysoberyl (transparent pale green). Value 100 GP.";
                        break;
                    case 4:
                        tableObject.itemName = "Coral (opaque crimson). Value 100 GP.";
                        break;
                    case 5:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Garnet (transparent red). Value 100 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Garnet (transparent brown-green). Value 100 GP.";
                        else
                            tableObject.itemName = "Garnet (transparent violet). Value 100 GP.";
                        break;
                    case 6:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Jade (translucent light green). Value 100 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Jade (translucent deep green). Value 100 GP.";
                        else
                            tableObject.itemName = "Jade (translucent white). Value 100 GP.";
                        break;
                    case 7:
                        tableObject.itemName = "Jet (opaque deep black). Value 100 GP.";
                        break;
                    case 8:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Pearl (opaque lustrous white). Value 100 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Pearl (opaque lustrous yellow). Value 100 GP.";
                        else
                            tableObject.itemName = "Pearl (opaque lustrous pink). Value 100 GP.";
                        break;
                    case 9:
                        option = d.roll(3);
                        if (option == 1)
                            tableObject.itemName = "Spinel (transparent red). Value 100 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Spinel (transparent red-brown). Value 100 GP.";
                        else
                            tableObject.itemName = "Spinel (transparent deep green). Value 100 GP.";
                        break;
                    default:
                        option = d.roll(4);
                        if (option == 1)
                            tableObject.itemName = "Tourmaline (transparent pale green). Value 100 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Tourmaline (transparent blue). Value 100 GP.";
                        else if (option == 3)
                            tableObject.itemName = "Tourmaline (transparent brown). Value 100 GP.";
                        else
                            tableObject.itemName = "Tourmaline (transparent red). Value 100 GP.";
                        break;
                }
                break;
            case 500:
                number = d.roll(6);
                switch (number) {
                    case 1:
                        tableObject.itemName = "Alexandrite (transparent dark green). Value 500 GP.";
                        break;
                    case 2:
                        tableObject.itemName = "Aquamarine (transparent pale blue-green). Value 500 GP.";
                        break;
                    case 3:
                        tableObject.itemName = "Black pearl (opaque pure black). Value 500 GP.";
                        break;
                    case 4:
                        tableObject.itemName = "Blue spinel (transparent deep blue). Value 500 GP.";
                        break;
                    case 5:
                        tableObject.itemName = "Peridot (transparent rich olive green). Value 500 GP.";
                        break;
                    default:
                        tableObject.itemName = "Topaz (transparent golden yellow). Value 500 GP.";
                        break;
                }
                break;
            case 1000:
                number = d.roll(8);
                switch (number) {
                    case 1:
                        tableObject.itemName = "Black opal (translucent dark green with black mottling and golden flecks). Value 1000 GP.";
                        break;
                    case 2:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Blue sapphire (transparent blue-white). Value 1000 GP.";
                        else
                            tableObject.itemName = "Blue sapphire (transparent medium blue). Value 1000 GP.";
                        break;
                    case 3:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Chrysoberyl (transparent yellow-green). Value 1000 GP.";
                        else
                            tableObject.itemName = "Emerald (transparent deep bright green). Value 1000 GP.";
                        break;
                    case 4:
                        tableObject.itemName = "Fire opal (translucent fiery red). Value 1000 GP.";
                        break;
                    case 5:
                        tableObject.itemName = "Opal (translucent pale blue with green and golden mottling). Value 1000 GP.";
                        break;
                    case 6:
                        tableObject.itemName = "Star ruby (translucent ruby with white star-shaped center). Value 1000 GP.";
                        break;
                    case 7:
                        tableObject.itemName = "Star sapphire (translucent blue sapphire with white star-shaped center). Value 1000 GP.";
                        break;
                    case 8:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Yellow sapphire (transparent fiery yellow). Value 1000 GP.";
                        else
                            tableObject.itemName = "Yellow sapphire (transparent yellow-green). Value 1000 GP.";
                        break;
                }
                break;
            default: //5000
                number = d.roll(4);
                switch (number) {
                    case 1:
                        tableObject.itemName = "Black sapphire (translucent lustrous black with glowing highlights). Value 5000 GP.";
                        break;
                    case 2:
                        option = d.roll(5);
                        if (option == 1)
                            tableObject.itemName = "Diamond (transparent blue-white). Value 5000 GP.";
                        else if (option == 2)
                            tableObject.itemName = "Diamond (transparent canary). Value 5000 GP.";
                        else if (option == 3)
                            tableObject.itemName = "Diamond (transparent pink). Value 5000 GP.";
                        else if (option == 4)
                            tableObject.itemName = "Diamond (transparent brown). Value 5000 GP.";
                        else
                            tableObject.itemName = "Diamond (transparent blue). Value 5000 GP.";
                        break;
                    case 3:
                        tableObject.itemName = "Jacinth (transparent fiery orange). Value 5000 GP.";
                        break;
                    default:
                        option = d.roll(2);
                        if (option == 1)
                            tableObject.itemName = "Ruby (transparent clear red). Value 5000 GP.";
                        else
                            tableObject.itemName = "Ruby (transparent deep crimson). Value 5000 GP.";
                        break;
                }
                break;
        }
        return tableObject;
    }
}
