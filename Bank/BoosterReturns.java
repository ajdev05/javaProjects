import static java.lang.System.out;
import java.util.Random;

public class BoosterReturns
{
    //declare instance data 

	String name;
	int boxesSold;
	
    //constructor
    public BoosterReturns(String boosterName)
    {
    
    name = boosterName;
    boxesSold = 0;
    
    }


	public String getName()
  	{
  	
  	return name;
  	
  	}

    public void updateSales(int nbrOfBoxes)
    {
    
    boxesSold += nbrOfBoxes;
    
    }

	public String toString()
  	{
  	
    String Message =("" + name + ":   " + boxesSold + " box(es).\n");
  	
  	return Message;
  	
  	}

	public int boxes()
	{
	
	return boxesSold;	
		
	}	
		


}