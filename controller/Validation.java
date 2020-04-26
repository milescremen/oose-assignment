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
}