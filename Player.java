//Daljeet Singh 105165075
//Assignment 3 Problem 7

public abstract class Player 
{
    protected String name;
    private int numberOfPlays;                        //declaring variables
    private int score;
    public Player() {}

    public Player(String name)
    {
        this.name = name;                          
    }

    public String getName() 
    {
        return name;                                   //returns name
    }
 
    public void setName(String name) 
    {
        this.name = name;                                   //sets name
    }
 
    public int getNumberOfPlays() 
    {
        return numberOfPlays;                                  //returns numberOfPlays
    }
 
    public int getScore() 
    {
        return score;                                  //returns score
    }
 
    public void setNumberOfPlays(int number) 
    {
        this.numberOfPlays = number;
    }
    
    public void setScore(int number) 
    {
        this.score = number;
    }
    
    public abstract int play(Pile pile);
    
    @Override
    public String toString() 
    {
        return "Player Name: " + this.name + ", Number of Plays: " + this.getNumberOfPlays() +  ", Score: " + this.getScore();
    }
}