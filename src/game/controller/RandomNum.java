package controller;

import java.util.Random;


public class RandomNum
{
    public static int randomNum(int min, int max)
    {
        Random rand = new Random();
        int randomNum;
        
        randomNum = rand.nextInt((min - max) + 1) + min;
        return randomNum;
    }
}