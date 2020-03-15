public class Pile 
{
   private int initialNumberOfMarbles; // Initial number of marbles in a round
   private int currentNumberOfMarbles; // Current number of marbles in a round

   public Pile(int numberOfMarbles) 
     {
	   currentNumberOfMarbles = numberOfMarbles;
	   initialNumberOfMarbles = numberOfMarbles;
     }


   public int getInitialNumberOfMarbles() 
     {
	   return initialNumberOfMarbles;
     }
                                                                                                    //getters and setters
   public void setInitialNumberOfMarbles(int numberOfMarbles) 
     {
	   initialNumberOfMarbles = numberOfMarbles;
     }
 
   public int getCurrentNumberOfMarbles() 
   {
	   return currentNumberOfMarbles;
   }


   private void setCurrentNumberOfMarbles(int numberOfMarbles) 
   {
	   currentNumberOfMarbles = currentNumberOfMarbles - numberOfMarbles;
   }
 
   public boolean takeMarbles(int number) 
   {
	   if(number > 0 && number <= currentNumberOfMarbles/2) 
	   {
		   setCurrentNumberOfMarbles(number);
		   return true;                                                  //removing marbles
	   }
	   else
		   return false;		   
   }
 
   public String showPile() 
   {
	   int num_of_Marbles = getCurrentNumberOfMarbles() ;
	   int count = 0;
	   
	   String result = "";
	   while(num_of_Marbles !=0)
	   {
		   result = result + "*";
	       num_of_Marbles--;
	       count++;
	       if (count == 10) 
	       {
	    	   count = 0;
	    	   result = result + "\n";
	       }
	   }
	   
	   return result;
	   
   }
 
   public String toString() 
   {
	   return "Intial number of piles: " + getInitialNumberOfMarbles()  + ".\nCurrent number of piles: "+  getCurrentNumberOfMarbles() + "." ;
   }
}