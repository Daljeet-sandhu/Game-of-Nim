//Daljeet Singh 105165075
//Assignment 3 Problem 7

import java.util.Scanner;

public class HumanPlayer extends Player
{
    Scanner in = new Scanner(System.in);
    int age;
    String name;                                        //declaring variables
    
    public HumanPlayer(String name, int age)
    {
        this.name = name;
        this.age = age;                                      //constructor
    }
    
    @Override
    public int play(Pile pile)
    {
        int choice = in.nextInt();
        
        pile.getCurrentNumberOfMarbles() -= choice;
    }
}