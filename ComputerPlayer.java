//Daljeet Singh 105165075
//Assignment 3 Problem 7

public class ComputerPlayer extends Player
{
    boolean smart;
    Utilities x = new Utilities();                        //declaring variables
    
    public ComputerPlayer(){};
    
    public ComputerPlayer(boolean smart)
    {
        
    }
    
    @Override
    public int play(Pile pile)
    {
        if(smart==false)
        {
            pile.setCurrentNumberOfMarbles(pile.getCurrentNumberOfMarbles() - x.randomInteger(1,pile.getCurrentNumberOfMarbles()/2));
        }
        else
        {
            int a=pile.getCurrentNumberOfMarbles()/2, found=1;
            
            for(int i=a;i>0;i--)
            {
                if(x.isPowerOfTwo(i))
                {
                    a=i;
                    found=1;
                    break;
                }
                else
                {
                    found=0;
                }
            }
            
            if(found==1)
                pile.setCurrentNumberOfMarbles(a-1);
            else
                pile.setCurrentNumberOfMarbles(pile.getCurrentNumberOfMarbles() - x.randomInteger(1,pile.getCurrentNumberOfMarbles()/2));
            
        }
    }
}