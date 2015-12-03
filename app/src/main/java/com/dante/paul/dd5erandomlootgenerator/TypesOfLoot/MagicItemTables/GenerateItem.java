package com.dante.paul.dd5erandomlootgenerator.TypesOfLoot.MagicItemTables;

import com.dante.paul.dd5erandomlootgenerator.Dice.Dice;
import com.dante.paul.dd5erandomlootgenerator.EnumeratedClasses.ChallengeRating;

/**
 * Created by PaulD on 2015-12-03.
 */
public class GenerateItem {
    Dice d = new Dice();
    int d100;
    int numberOfItems;
    MagicItemTable table;
    public GenerateItem() {
        d100 = d.roll(100);
        numberOfItems = 1;
    }

    public void generateItem(ChallengeRating challengeRating){
        switch (challengeRating) {
            case ZERO:
                if (d100 < 45) {
                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                } else if (d100 < 53) {
                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <61){

                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <66){

                    table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <71){
                    table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <76){
                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 79){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <81){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 86){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 93){
                    table = new MagicItemTable_F();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 98){
                    table = new MagicItemTable_F();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 100){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else{
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }
                break;

            case FIVE:
                if (d100 < 33) {

                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <37){
                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <41){
                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <45){
                    table = new MagicItemTable_A();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <50){
                    table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 55){
                    table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <60){
                    table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 64){
                    table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 67){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 70){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 73){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 75){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 77){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 79){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 79){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 80){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 85){
                    table = new MagicItemTable_F();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 89){
                    table = new MagicItemTable_F();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 92){
                    table = new MagicItemTable_F();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 95){
                    table = new MagicItemTable_F();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 97){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 99){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 99){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else{
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }
                break;
            //TODO Not finished converting from FIVE and Still need to do SEVENTEEN
            case ELEVEN:
                if (d100 < 20) {
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_A();
                    else
                        table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 <24){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_A();
                    else
                        table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <27){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_A();
                    else
                        table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 <30){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_A();
                    else
                        table = new MagicItemTable_B();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 <36){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 41){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <46){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 51){
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 55){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 59){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 63){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 67){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 69){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 71){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 73){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 75){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 77){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_F();
                    else
                        table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 < 79){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_F();
                    else
                        table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 < 81){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_F();
                    else
                        table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 < 83){
                    int secondary = d.roll(2);
                    if (secondary == 1)
                        table = new MagicItemTable_F();
                    else
                        table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems,table);
                }else if (d100 < 86){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 89){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 91){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 93){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 95){
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 97){
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 99){
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }else{
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }
                break;

            default: //SEVENTEEN
                if (d100 < 2) {//no gems or art
                } else if (d100 <6) {
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                } else if (d100 < 9) {
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                } else if (d100 < 12) {
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                } else if (d100 < 15) {
                    table = new MagicItemTable_C();
                    generateMagicItems(numberOfItems, table);
                } else if (d100 < 23) {
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <31){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <39){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <47){
                    table = new MagicItemTable_D();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <53){
                    table = new MagicItemTable_E();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 59){
                    table = new MagicItemTable_E();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <64){
                    table = new MagicItemTable_E();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 < 69){
                    table = new MagicItemTable_E();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 69){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 70){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 71){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 == 72){
                    table = new MagicItemTable_G();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <75){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <77){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <78){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <81){
                    table = new MagicItemTable_H();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <86){
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <91){
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }else if (d100 <96){
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }else{
                    table = new MagicItemTable_I();
                    generateMagicItems(numberOfItems, table);
                }
                break;
        }
    }
    private void generateMagicItems(int numberOfItems, MagicItemTable table) {
        int random100;
        for (int counter = 0; counter < numberOfItems; counter++) {
            random100 = d.roll(100);
            String item = table.getItem(random100).itemName;
            //TODO print the item to the screen
        }
    }
}
