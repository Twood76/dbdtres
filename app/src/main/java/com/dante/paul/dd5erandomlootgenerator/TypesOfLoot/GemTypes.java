package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;

/**
 * Created by PaulD on 2015-11-23.
 */
public class GemTypes extends ValueableItems {
    Dice d = new Dice();
    int number;
    @Override
    public String getItem(int value) {
        int option;
        switch (value) {
            case 10:
                number = d.roll(12);
                switch (number) {
                    case 1:
                        return "1 Azurite (opaque mottled deep blue). Value 10 GP";
                    
                    case 2:
                        option = d.roll(4);
                        if (option == 1)
                            return "1 Banded agate (translucent striped brown). Value 10 GP.";
                        if (option == 2)
                            return "1 Banded agate (translucent striped blue). Value 10 GP.";
                        if (option == 3)
                            return "1 Banded agate (translucent striped white). Value 10 GP.";
                        return "1 Banded agate (translucent striped red). Value 10 GP.";
                    
                    case 3:
                        return "1 Blue quartz (transparent pale blue). Value 10 GP.";
                    
                    case 4:
                        option = d.roll(5);
                        if (option == 1)
                            return "1 Eye agate (translucent circles of brown). Value 10 GP.";
                        if (option == 2)
                            return "1 Eye agate (translucent circles of blue). Value 10 GP.";
                        if (option == 3)
                            return "1 Eye agate (translucent circles of white). Value 10 GP.";
                        if (option == 4)
                            return "1 Eye agate (translucent circles of red). Value 10 GP.";
                        return "1 Eye agate (translucent circles of grey). Value 10 GP.";
                    
                    case 5:
                        return "1 Hematite (opaque grey-black). Value 10 GP.";
                    
                    case 6:
                        return "1 Lapis lazuli (opaque light and dark blue with yellow flecks). Value 10 GP.";
                    
                    case 7:
                        return "1 Malachite (opaque striated light and dark green). Value 10 GP.";
                    
                    case 8:
                        option = d.roll(4);
                        if (option == 1)
                            return "1 Moss agate (translucent pink with mossy gray markings). Value 10 GP.";
                        if (option == 2)
                            return "1 Moss agate (translucent pink with green markings). Value 10 GP.";
                        if (option == 3)
                            return "1 Moss agate (translucent yellow-white with mossy gray markings). Value 10 GP.";
                        return "1 Moss agate (translucent yellow-white with green markings). Value 10 GP.";
                    
                    case 9:
                        return "1 Obsidian (opaque black). Value 10 GP.";
                    
                    case 10:
                        return "1 Rhodochrosite (opaque light pink). Value 10 GP.";
                    
                    case 11:
                        return "1 Tiger eye (translucent brown with golden center). Value 10 GP.";
                    
                    default:
                        return "1 Turquoise (opaque light blue-green). Value 10 GP.";
                }
            case 50:
                number = d.roll(12);
                switch (number) {
                    case 1:
                        return "1 Bloodstone (opaque dark gray with red flecks). Value 50 GP";
                    
                    case 2:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Carnelian (opaque orange). Value 50 GP.";
                        return "1 Carnelian (opaque red-brown). Value 50 GP.";
                    
                    case 3:
                        return "1 Chalcedony (opaque white). Value 50 GP.";
                    
                    case 4:
                        return "1 Chrysoprase (translucent green). Value 50 GP.";
                    
                    case 5:
                        return "1 Citrine (transparent pale yellow-brown). Value 50 GP.";
                    
                    case 6:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Jasper (opaque blue). Value 50 GP.";
                        if (option == 2)
                            return "1 Jasper (opaque black). Value 50 GP.";
                        return "1 Jasper (opaque brown). Value 50 GP.";
                    
                    case 7:
                        return "1 Moonstone (translucent white with pale blue glow). Value 50 GP.";
                    
                    case 8:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Onyx (opaque bands of black and white). Value 50 GP.";
                        if (option == 2)
                            return "1 Onyx (pure black). Value 50 GP.";
                        return "1 Onyx (pure white). Value 50 GP.";
                    
                    case 9:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Quartz (transparent white). Value 50 GP.";
                        if (option == 2)
                            return "1 Quartz (transparent smokey gray). Value 50 GP.";
                        return "1 Quartz (transparent yellow). Value 50 GP.";
                    
                    case 10:
                        return "1 Sardonyx (opaque bands of red and white). Value 50 GP";
                    
                    case 11:
                        return "1 Star rose quartz (translucent rosy stone with white star-shaped center). Value 50 GP.";
                    
                    default:
                        return "1 Zircon (transparent pale blue-green). Value 50 GP.";
                    
                }
                
            case 100:
                number = d.roll(10);
                switch (number) {
                    case 1:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Amber (transparent watery gold). Value 100 GP.";
                        return "1 Amber (transparent rich gold). Value 100 GP.";
                    
                    case 2:
                        return "1 Amethyst (transparent deep purple). Value 100 GP.";
                    
                    case 3:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Chrysoberyl (transparent yellow-green). Value 100 GP.";
                        return "1 Chrysoberyl (transparent pale green). Value 100 GP.";
                    
                    case 4:
                        return "1 Coral (opaque crimson). Value 100 GP.";
                    
                    case 5:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Garnet (transparent red). Value 100 GP.";
                        if (option == 2)
                            return "1 Garnet (transparent brown-green). Value 100 GP.";
                        return "1 Garnet (transparent violet). Value 100 GP.";
                    
                    case 6:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Jade (translucent light green). Value 100 GP.";
                        if (option == 2)
                            return "1 Jade (translucent deep green). Value 100 GP.";
                        return "1 Jade (translucent white). Value 100 GP.";
                    
                    case 7:
                        return "1 Jet (opaque deep black). Value 100 GP.";
                    
                    case 8:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Pearl (opaque lustrous white). Value 100 GP.";
                        if (option == 2)
                            return "1 Pearl (opaque lustrous yellow). Value 100 GP.";
                        return "1 Pearl (opaque lustrous pink). Value 100 GP.";
                    
                    case 9:
                        option = d.roll(3);
                        if (option == 1)
                            return "1 Spinel (transparent red). Value 100 GP.";
                        if (option == 2)
                            return "1 Spinel (transparent red-brown). Value 100 GP.";
                        return "1 Spinel (transparent deep green). Value 100 GP.";
                    
                    default:
                        option = d.roll(4);
                        if (option == 1)
                            return "1 Tourmaline (transparent pale green). Value 100 GP.";
                        if (option == 2)
                            return "1 Tourmaline (transparent blue). Value 100 GP.";
                        if (option == 3)
                            return "1 Tourmaline (transparent brown). Value 100 GP.";
                        return "1 Tourmaline (transparent red). Value 100 GP.";
                    
                }
                
            case 500:
                number = d.roll(6);
                switch (number) {
                    case 1:
                        return "1 Alexandrite (transparent dark green). Value 500 GP.";
                    
                    case 2:
                        return "1 Aquamarine (transparent pale blue-green). Value 500 GP.";
                    
                    case 3:
                        return "1 Black pearl (opaque pure black). Value 500 GP.";
                    
                    case 4:
                        return "1 Blue spinel (transparent deep blue). Value 500 GP.";
                    
                    case 5:
                        return "1 Peridot (transparent rich olive green). Value 500 GP.";
                    
                    default:
                        return "1 Topaz (transparent golden yellow). Value 500 GP.";
                    
                }
                
            case 1000:
                number = d.roll(8);
                switch (number) {
                    case 1:
                        return "Black opal (translucent dark green with black mottling and golden flecks). Value 1000 GP.";
                    
                    case 2:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Blue sapphire (transparent blue-white). Value 1000 GP.";
                        return "1 Blue sapphire (transparent medium blue). Value 1000 GP.";
                    
                    case 3:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Chrysoberyl (transparent yellow-green). Value 1000 GP.";
                        return "1 Emerald (transparent deep bright green). Value 1000 GP.";
                    
                    case 4:
                        return "1 Fire opal (translucent fiery red). Value 1000 GP.";
                    
                    case 5:
                        return "1 Opal (translucent pale blue with green and golden mottling). Value 1000 GP.";
                    
                    case 6:
                        return "1 Star ruby (translucent ruby with white star-shaped center). Value 1000 GP.";
                    
                    case 7:
                        return "1 Star sapphire (translucent blue sapphire with white star-shaped center). Value 1000 GP.";
                    
                    case 8:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Yellow sapphire (transparent fiery yellow). Value 1000 GP.";
                        return "1 Yellow sapphire (transparent yellow-green). Value 1000 GP.";
                    
                }
                
            default: //5000
                number = d.roll(4);
                switch (number) {
                    case 1:
                        return "1 Black sapphire (translucent lustrous black with glowing highlights). Value 5000 GP.";
                    
                    case 2:
                        option = d.roll(5);
                        if (option == 1)
                            return "1 Diamond (transparent blue-white). Value 5000 GP.";
                        if (option == 2)
                            return "1 Diamond (transparent canary). Value 5000 GP.";
                        if (option == 3)
                            return "1 Diamond (transparent pink). Value 5000 GP.";
                        if (option == 4)
                            return "1 Diamond (transparent brown). Value 5000 GP.";
                        return "1 Diamond (transparent blue). Value 5000 GP.";
                    
                    case 3:
                        return "1 Jacinth (transparent fiery orange). Value 5000 GP.";
                    
                    default:
                        option = d.roll(2);
                        if (option == 1)
                            return "1 Ruby (transparent clear red). Value 5000 GP.";
                        return "1 Ruby (transparent deep crimson). Value 5000 GP.";
                    
                }
                
        }
    }
}
