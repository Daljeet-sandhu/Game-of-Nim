//Daljeet Singh 105165075
//Assignment 3 Problem 7

import java.util.Random;

public class Utilities
{
    static Random r = new Random(System.currentTimeMillis());                                   //declaring

    static int randomInteger(int start, int end)
    {
        return r.nextInt((end-start)+1) + start;           //returns randomInteger
    }

    static boolean isPowerOfTwo(int x)                   //checks if it is Power Of Two
    {
        double p = Math.pow(2,Math.round(Math.log(x)/Math.log(2)));           
        
        if (p == x)
            return true;
        else
            return false;
    }
}