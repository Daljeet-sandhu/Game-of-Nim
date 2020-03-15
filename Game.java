import java.util.Scanner;
import java.util.Random;

public class Game
{
    public static void runOneGame(Player p1, Player p2, Pile pile, Player turn)                    //run one game
    {
    	int number_of_marbles = pile.getCurrentNumberOfMarbles();
    	Random rand = new Random();                                                                // intializers
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("It is " + turn.getName() + "'s turn to play.");
    	
    	while(number_of_marbles != 1) 
    	{
    		number_of_marbles = pile.getCurrentNumberOfMarbles();
    		if (number_of_marbles == 1)
    			break;
    		
    		if (turn.getName() == "Novice Computer") 
    		{
    			int choice = rand.nextInt(number_of_marbles/2)+1;                                       //against novice computer
    			System.out.println(turn.getName() + " takes " + choice + " marbles.");
    			if(!pile.takeMarbles(choice))
    				System.out.println("Number of marbles shoud be less than " + number_of_marbles/2);
    			
    			turn = p2;
    			
    		}
    			
    		else
    		{
    			System.out.print(turn.getName() + ", how many marbles do you take? (min = 1, max=" + number_of_marbles/2 + ")");
    		    int choice = in.nextInt();                                                                                        //human part
    		    if(!pile.takeMarbles(choice))
    				System.out.println("Number of marbles shoud be less than " + number_of_marbles/2);
    		    turn = p1;
    		}
    		System.out.println(pile.showPile());
    		System.out.println("There are " + pile.getCurrentNumberOfMarbles() + " marbles left");
    		    
    	}
    	
    	if(turn == p1)
    	{
    		System.out.println("*** " + p2.getName() + " is the Winner! ***");
    		p2.setNumberOfPlays(1);                                                              //winnnning part
    		p1.setNumberOfPlays(1);
    		p2.setScore(1);
    	}   
    	else
    	{
    		System.out.println("*** " + p1.getName() + " is the Winner! ***");
    		p1.setNumberOfPlays(1);
    		p2.setNumberOfPlays(1);
    		p1.setScore(1);
    	}
    	   

    }


    public static String gameStatus(Player p1, Player p2, Pile pile, Player turn)
    {
	   return p1.toString() + "\n" + p2.toString();
    }
   
    public static void main(String[] args) 
    {
    	System.out.println("Welcome to the game of Nim!");
    	System.out.println("---------------------------");
    	
    	Player p1 = new Player();
    	Player p2 = new Player();
    	
    	char choice3 = 0;
    	
    	Scanner input = new Scanner(System.in);
    	Random rand = new Random();
    	
    	while(true)
    	{
    		System.out.println("H)Human-Human   C)Computer-Human");
    		
    		char choice = input.next().charAt(0);                             //prompting user
    		   	
    		if(choice == 'C') 
    		{
    			System.out.println("Name of the player:");
    			
                String Sample = input.next();
    			p2.setName(Sample);
    			
    			p1.setName("Novice Computer");
    			
    			 
    			
    			do {
    				System.out.println("This is a game between "+ p1.getName() +" and " + p2.getName());
    				
    				Player play_turn = new Player();
    				Pile main_pile = new Pile(rand.nextInt(91)+10);
    				
    				System.out.println(main_pile);
    				System.out.println(main_pile.showPile());
    				
    				if(rand.nextInt(2) == 1)
    					play_turn = p1;                                                                                       //computer vs human
    				else
    					play_turn = p2;
    					
    				runOneGame(p1,p2,main_pile,play_turn);
    				
    				System.out.println(gameStatus(p1,p2,main_pile,play_turn));  				
    				
    				System.out.println("P)lay again   Q)uit");
    				
    				char choice2 = input.next().charAt(0);
    				
    				
    				if(choice2 == 'Q')
    					break;
    				
    			}while(true);
    			
    			System.out.println("N)ew play set   E)xit");
				choice3 = input.next().charAt(0);
    			
    		}
    		
    		if(choice == 'H') 
    		{
    			System.out.println("Name of the First player:");
    			String Sample = input.nextLine();
    			p1.setName(Sample);
    			                                                                                         //human vs human
    			System.out.println("Name of the Second player:");
    			Sample = input.nextLine();
    			p2.setName(Sample);
    			
                char choice2;
    			
    			do {
    				System.out.println("This is a game between "+ p1.getName() +" and " + p2.getName());
    				
    				Player play_turn = new Player();
    				Pile main_pile = new Pile(rand.nextInt(91)+10);
    				
    				System.out.println(main_pile);
    				System.out.println(main_pile.showPile());
    				
    				if(rand.nextInt(2) == 1)
    					play_turn = p1;
    				else
    					play_turn = p2;
    					
                    runOneGame(p1,p2,main_pile,play_turn);
    				
    				System.out.println(gameStatus(p1,p2,main_pile,play_turn));  				
    							
    				System.out.println("P)lay again   Q)uit");
    				choice2 = input.next().charAt(0);
    				
    			}while(choice2 != 'Q');
    			
    			System.out.println("N)ew play set   E)xit");
				choice3 = input.next().charAt(0);
    		}
    		
    		if(choice3 == 'E') 
    			{System.out.println("\nBye!");break;}
    		
    			
    	  }
    	input.close();
      }
}