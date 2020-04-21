//Daljeet Singh 105165075
//Assignment 3 Problem 7

public class Pile 
{
    private int initialNumberOfMarbles;
    private int currentNumberOfMarbles;                         //declaring variables

    public Pile(int numberOfMarbles)
    {
        this.initialNumberOfMarbles = numberOfMarbles;
        this.currentNumberOfMarbles = numberOfMarbles;
    }

    public int getInitialNumberOfMarbles()
    {
        return initialNumberOfMarbles;
    }

    public void setInitialNumberOfMarbles(int initialNumberOfMarbles) 
    {
        this.initialNumberOfMarbles = initialNumberOfMarbles;
    }
 
    public int getCurrentNumberOfMarbles()
    {
        return currentNumberOfMarbles;
    }
 
    public void setCurrentNumberOfMarbles(int numberOfMarbles) 
    {
        this.currentNumberOfMarbles = numberOfMarbles;
    }

    public boolean takeMarbles(int number) 
    {
        if ((number < 1) || (number > this.currentNumberOfMarbles/2))
            return false;
        else 
        {
            setCurrentNumberOfMarbles(this.currentNumberOfMarbles - number);
            return true;
        }
    }
    
    public String showPile() 
    {
        String piles = "";
        
        for (int i=0; i<this.currentNumberOfMarbles; i++) 
        {
            if ((i != 0) && (i % 10 == 0))
                piles += "\n";
            
            piles += "⊗ ";
        }
        
        return piles;
    }
    
    @Override
    public String toString() 
    {
        return "Number of Marbles in the pile: " + this.currentNumberOfMarbles;
    }
    
}