
/**
 *  class SoftDrinkTest 
 *
 * @author (https://github.com/ajdev05)
 * @version (a version )
 */

import java.util.*;
public class SoftDrinkTest
{
    public static void main(String[] args){
        SoftDrink drink = new SoftDrink();
        Scanner input = new Scanner(System.in);
        System.out.println("                    =====================================");
        System.out.println("                     Welcome to APCS Soft Dink Company");
        System.out.println("                    =====================================");
        System.out.println("                       Visit our website :   https://acps.com");
        System.out.println();

        double amount;

        while (true){
            System.out.println("1 = Menu | 2 = Order | 3 = Price List | 4 = Exit");
            System.out.print("");
            System.out.print("Enter Option ~>> ");
            int opt = input.nextInt();
        if (opt == 1){
            System.out.println(drink.drinkLs());
        }
        else if (opt == 3) {
            System.out.println(drink.priceLs());
        }
        else if (opt == 2) {
            System.out.println();
            System.out.println("Temperature is  "+ drink.getTemp() +", You total is $"+drink.getMoney());
            System.out.println();
            System.out.print("Enter Money: $");
            amount = input.nextDouble();
            if (amount < drink.getMoney()){
                System.out.println("Not enough money!");
                main(args);
            }
            else{
                System.out.println();
                System.out.println(drink.orderChange(amount));
                System.out.println();
                System.out.println(drink.returnChange());
            }


        }
        else if (opt == 4){
            System.out.println("Bye!");
            break;

        }


        }
    }
}
