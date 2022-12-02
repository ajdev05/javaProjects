
/**
 * Write a description of class SoftDrink here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *
 *
 *
 */
import java.lang.Math;
import java.util.Random;

public class SoftDrink {

    Random rand = new Random();

    private double Drink;
    private int maxTemp = 130;
    private double actualTemp;
    private String drinkList;

    private String priceList;
    private double drinkPrice = 0;
    private double drinkPriceChange = 0;
    private int dollars, quarters, dimes, nickels, pennies;


    public double getTemp(){
        actualTemp=Math.random()  * maxTemp;
        return actualTemp;
    }

    public double getMoney(){

        if (actualTemp < 50){
            drinkPrice = 0.50;

        }
        else if (actualTemp >=50 && actualTemp <= 60) {
            drinkPrice = 0.55;

        }
        else if (actualTemp >=61 && actualTemp <= 65) {
            drinkPrice = 0.60;

        }

        else if (actualTemp >=66 && actualTemp <= 70) {
            drinkPrice = 0.65;

        }
        else if (actualTemp >=71 && actualTemp <= 75) {
            drinkPrice = 0.75;

        }
        else if (actualTemp >=76 && actualTemp <= 80) {
            drinkPrice = 0.80;

        }

        else if (actualTemp >=81 && actualTemp <= 85) {
            drinkPrice = 0.85;

        }
        else if (actualTemp >=86 && actualTemp <= 90) {
            drinkPrice = 0.90;

        }
        else if (actualTemp >= 91) {
            drinkPrice = 1;


        }



        return drinkPrice;
    }

    public String drinkLs(){
        drinkList = """
                        Coke (Diet or Regular)
                        --------------------------
                        Fanta
                        -------
                        Gatorade 
                        -----------
                        Pepsi
                        -------
                        Sprite
                        -------
                        7-Up
                        -------
                        Mountain Dew.
                        -------------------
                        Dr. Pepper
                        -------------
                        Coffee 
                        --------
                """;


        return drinkList;
    }
    public String priceLs(){
        priceList = """
        Prices are determined by the Temperature
                
                Temperature                      Price
               --------------------------------------
                Below 50 F                        $0.50
                50 – 60 F                           $0.55
                61 – 65 F                           $0.60
                66 – 70 F                           $0.65
                71 – 75 F                           $0.75
                76 – 80 F                           $0.80
                81 – 85 F                           $0.85
                86 – 90 F                           $0.90
                Over 90 F                           $1.00
                   
                
                """;
        return priceList;
    }

    public double orderChange(double enteredAmount){
         drinkPriceChange = (enteredAmount-drinkPrice);
        dollars = (int)drinkPriceChange;
        quarters = (int)((drinkPriceChange - dollars) * 100) / 25;
        dimes = (int)((drinkPriceChange - (dollars + (quarters * 0.25))) * 100) / 10;
        nickels = (int)((drinkPriceChange - (dollars + (quarters * 0.25) + (dimes * 0.10))) * 100) / 5;
        pennies = (int)((drinkPriceChange - (dollars + (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05))) * 100);

        return drinkPriceChange ;
    }

    public boolean returnChange(){
        System.out.println("Your change is "+drinkPriceChange);

        System.out.println("Dollars "+dollars);
        System.out.println("quarters "+quarters);
        System.out.println("dimes "+dimes);
        System.out.println("nickels "+nickels);
        System.out.println("pennies "+pennies);


        return false;
    }




}


