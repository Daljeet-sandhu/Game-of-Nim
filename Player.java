public abstract class Player 
{
    protected String name;       // Name of the player
    private int numberOfPlays;      // Number of plays the player has played so far
    private int score;                    // Current score of the player
 
    public Player() {}

    public Player(String name)
    {
    	this.name = name;
    }
   

    public String getName() 
    {
    	return name;
    }

    public void setName(String name) 
    {
    	this.name = name;
    }
    	                                                     //getters and setters

    public int getNumberOfPlays() 
    {
    	return numberOfPlays;
    }


    public int getScore() 
    {
    	return score;
    }


    public void setNumberOfPlays(int number) 
    {
    	numberOfPlays = numberOfPlays + number;
    }


    public void setScore(int number) 
    {
    	score = score + number;
    }

 
    /* At this level, ignore the body of the following method. We
 will learn the reason we need this method later on and how to
 develop it.
 */
    
    public abstract int play(Pile pile);


    public String toString() 
    {
      return "Player Name: " + getName() + ", Number of Plays: " + getNumberOfPlays() + ", Score: " + getScore(); 
    }
}