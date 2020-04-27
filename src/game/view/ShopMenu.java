package view;

import controller.Validation;
import model.*;
import java.util.*;
import model.items.*;


public class ShopMenu 
{

    public static void shopMenu(Shop shop, PlayerChar character)
    {
        int selection;
        String prompt = "1. Purchase Item\n" + 
                        "2. Purchase enchantment\n" +
                        "3. Sell Item\n" +
                        "4. Exit shop\n";
        do
        {
            selection = Validation.validateInteger(prompt, 1, 4);
            switch(selection) 
            {
                case 1:
                    purchaseItemMenu(shop, character);
                    break;
        
                case 2:
                    purchaseEnchantmentMenu();
                    break;
                    
                case 3:
                    sellItemMenu();
                    break;

                case 4:
                    System.out.println("Exiting shop...");
                    break;

                default:
                    break;
            }
        } while(selection != 4);
    }

    private static void purchaseItemMenu(Shop shop, PlayerChar character)
    {
        int selection;
        String prompt = "1. Enter item name\n" + 
                        "2. Go to previous menu\n";
        do
        {
            selection = Validation.validateInteger(prompt, 1, 2);
            switch(selection) 
            {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    String input;
                    Item item;
                    System.out.println("Please enter the name of the item you wish to purchase");
                                
                    input = sc.nextLine(); 

                    if(!Validation.validateString(input))
                    {
                        //throw exception 
                        System.out.println("Invalid String");
                    }

                    shop.buyItem(input, character);
                    break;
        
                case 2:
                    System.out.println("Returning to previous menu...");
                    break;
                    
                default:
                    break;
            }
        } while(selection != 2);
    }

    private static void purchaseEnchantmentMenu()
    {
        int selection;
        String prompt = "ENCHANTMENTS\n" +
                        "1. Purchase Damage +2 Enchantment (5 gold)\n" + 
                        "2. Purchase Damage +5 Enchantment (10 gold)\n" +
                        "3. Purchase Fire Damage Enchantment (20 gold)\n" +
                        "4. Purchase Power-Up Enchantment (10 gold)\n" + 
                        "5. Return to previous menu";
        do
        {
            selection = Validation.validateInteger(prompt, 1, 5);
            switch(selection) 
            {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
        
                case 5:
                    System.out.println("Returning to previous menu...");
                    break;
                    
                default:
                    break;
            }
        } while(selection != 5);
    }

    private static void sellItemMenu()
    {

    }

}