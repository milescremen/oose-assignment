package controller;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Validation 
{
    public static int validateInteger(String prompt, int min, int max)
    {
        Scanner input = new Scanner(System.in);

        int value = min - 1;
        String strOut = prompt;
        String error;

        do
        {
            try
            {
                System.out.println(strOut);
                value = input.nextInt();
                error = "ERROR, please enter a value between " + min + " and " + max;
                strOut = error + "\n" + prompt;

            }
            catch(InputMismatchException e)
            {
                input.nextLine();
                error = "ERROR, Input must be an integer";
                strOut = error + "\n" + prompt;
            }
        }
        while(value < min || value > max);

        return value;
    }

    public static boolean validateString(String name)
    {
        boolean valid = true;
        
        if(name.equals("") || name == null)
        {
            valid = false;
        }
        return valid;
    }

    public static boolean validateFileInt(String number)
    {
        int num = Integer.parseInt(number);
        boolean valid = true;

        if(num < 0)
        {
            valid = false;
        }
        return valid;
    }

    public static boolean weaponIsValid(String[] lineArray)
    {
        boolean valid = true; 

        if(!validateString(lineArray[0]) && 
            !validateFileInt(lineArray[1]) &&
            !validateFileInt(lineArray[2]) &&
            !validateFileInt(lineArray[3]) &&
            !validateString(lineArray[4]) &&
            !validateString(lineArray[5])
        )
        { 
            valid = false;
        }

        return valid;
    }

    public static boolean armourIsValid(String[] lineArray)
    {
        boolean valid = true;

        if(!validateString(lineArray[0]) && 
            !validateFileInt(lineArray[1]) &&
            !validateFileInt(lineArray[2]) &&
            !validateFileInt(lineArray[3]) &&
            !validateString(lineArray[4])
        )
        {
            valid = false;
        }

        return valid; 
    }

    public static boolean potionIsValid(String[] lineArray)
    {
        boolean valid = true;

        if(!validateString(lineArray[0]) && 
            !validateFileInt(lineArray[1]) &&
            !validateFileInt(lineArray[2]) &&
            !validateFileInt(lineArray[3]) &&
            !validateFileInt(lineArray[4])
            && lineArray[4].length() == 1
        )
        {
            valid = false;
        }

        return valid; 

    }

}