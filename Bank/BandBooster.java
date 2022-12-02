import java.util.Scanner;

public class BandBooster
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
       
        String Name1, Name2;
        int boxesSold = 0;
       
       

        System.out.print("Please enter the band booster's name: ");
        Name1 = input.nextLine();
       
        System.out.print("Please enter another band booster's name: ");
        Name2 = input.nextLine();
       
       
        BoosterReturns Person2 = new BoosterReturns (Name2);
        BoosterReturns Person1 = new BoosterReturns (Name1);

        System.out.print("Enter the number of boxes sold by " +Person1.getName()+ " this week: ");
        boxesSold = input.nextInt();
        Person1.updateSales (boxesSold);
       
        System.out.print("Enter the number of boxes sold by " +Person2.getName()+ "this week: ");
        boxesSold = input.nextInt();
        Person2.updateSales (boxesSold);
       
       
       
        System.out.println ("SECOND WEEK");
        System.out.print("How many has " +Person1.getName()+" sold: ");
        boxesSold = input.nextInt();
        Person1.updateSales (boxesSold);
       
        System.out.print("How many has " +Person2.getName()+" sold: ");
        boxesSold = input.nextInt();
        Person2.updateSales (boxesSold);
       
       
        System.out.println ("THIRD WEEK");
        System.out.print("How many has " +Person1.getName()+" sold: ");
        boxesSold = input.nextInt();
        Person1.updateSales (boxesSold);
       
        System.out.print("How many has " +Person2.getName()+" sold: ");
        boxesSold = input.nextInt();
        Person2.updateSales (boxesSold);
       
        System.out.println (Person1);
        System.out.println (Person2);
    }
}