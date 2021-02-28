package controller;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Validation 
{
    public static int getIntegerInput(String prompt, int min, int max)
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
        } while(value < min || value > max);

        return value;
    }

    public static String getStringInput(String prompt)
    {
        Scanner input = new Scanner(System.in);
        String str = null;

        String strOut = prompt;
        String error;
        
        do
        {
            try
            {
                System.out.println(strOut);
                str = input.nextLine();
                error = "ERROR: Please enter a string";
                strOut = error + "\n" + prompt;

            }
            catch(InputMismatchException e)
            {
                /* Clear buffer */
                input.nextLine();
                error = "ERROR: Input must be of type String";
                strOut = error + "\n" + prompt;
            }
        } while("".equals(str) || input == null);
        
        return str;
    }

    public static boolean validateFileString(String name)
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

        if(!validateFileString(lineArray[0]) && 
            !validateFileInt(lineArray[1]) &&
            !validateFileInt(lineArray[2]) &&
            !validateFileInt(lineArray[3]) &&
            !validateFileString(lineArray[4]) &&
            !validateFileString(lineArray[5])
        )
        { 
            valid = false;
        }

        return valid;
    }

    public static boolean armourIsValid(String[] lineArray)
    {
        boolean valid = true;

        if(!validateFileString(lineArray[0]) && 
            !validateFileInt(lineArray[1]) &&
            !validateFileInt(lineArray[2]) &&
            !validateFileInt(lineArray[3]) &&
            !validateFileString(lineArray[4])
        )
        {
            valid = false;
        }

        return valid; 
    }

    public static boolean potionIsValid(String[] lineArray)
    {
        boolean valid = true;

        if(!validateFileString(lineArray[0]) && 
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