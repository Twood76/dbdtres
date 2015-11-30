package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.SpellTables;

/**
 * Created by PaulD on 2015-11-30.
 */
public abstract class AbstractSpells {
    private String[] level0;
    private String[] level1;
    private String[] level2;
    private String[] level3;
    private String[] level4;
    private String[] level5;
    private String[] level6;
    private String[] level7;
    private String[] level8;
    private String[] level9;
    protected int number;


    public String getSpell(int level) {
        switch (level) {
            case 0:
                number = level0.length - 1;
                return level0[number];
            case 1:
                number = level1.length - 1;
                return level1[number];
            case 2:
                number = level2.length - 1;
                return level2[number];
            case 3:
                number = level3.length - 1;
                return level3[number];
            case 4:
                number = level4.length - 1;
                return level4[number];
            case 5:
                number = level5.length - 1;
                return level5[number];
            case 6:
                number = level6.length - 1;
                return level6[number];
            case 7:
                number = level7.length - 1;
                return level7[number];
            case 8:
                number = level8.length - 1;
                return level8[number];
            default:
                number = level9.length - 1;
                return level9[number];
        }
    }
}
