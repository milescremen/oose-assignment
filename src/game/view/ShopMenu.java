package view;

import controller.ShopController;
import controller.Validation;
import model.*;
import java.util.*;
import model.items.*;
import model.items.enchantments.*;

public class ShopMenu 
{
    public static void shopMenu(Shop shop, PlayerChar character)
    {
        int selection;
        String prompt;
        do
        {
            prompt = "Player Attributes\n" + character.getCharAttributes() + "\n" + 
                        "1. Purchase Item\n" + 
                        "2. Purchase enchantment\n" +
                        "3. Sell Item\n" +
                        "4. Exit shop\n";
            selection = Validation.getIntegerInput(prompt, 1, 4);
            switch(selection) 
            {
                case 1:
                    purchaseItemMenu(shop, character);
                    break;
        
                case 2:
                    purchaseEnchantmentMenu(character);
                    break;
                    
                case 3:
                    sellItemMenu(shop, character);
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
        String items = ShopController.formatShopInventory(shop);

        String input;

        String prompt = "Items Available\n" + items + "\n" +
                        "1. Enter item name\n" + 
                        "2. Go to previous menu\n";
        do
        {
            selection = Validation.getIntegerInput(prompt, 1, 2);
            switch(selection) 
            {
                case 1:
                    input = Validation.getStringInput("Please enter the name of the item you wish to purchase");

                    ShopController.buyItem(input, character, shop);
                    break;
        
                case 2:
                    System.out.println("Returning to previous menu...");
                    break;
                    
                default:
                    break;
            }
        } while(selection != 2);
    }

    private static void purchaseEnchantmentMenu(PlayerChar character)
    {
        int selection;
        String weaponName;

        Item enchantedItem = null;

        String prompt = "ENCHANTMENTS\n" +
                        "1. Purchase Damage +2 Enchantment (5 gold)\n" + 
                        "2. Purchase Damage +5 Enchantment (10 gold)\n" +
                        "3. Purchase Fire Damage Enchantment (20 gold)\n" +
                        "4. Purchase Power-Up Enchantment (10 gold)\n" + 
                        "5. Return to previous menu";
        do
        {
            weaponName = Validation.getStringInput("Please enter the name of the weapon you wish to enchant");
            selection = Validation.getIntegerInput(prompt, 1, 5);
            switch(selection) 
            {
                case 1:

                    enchantedItem = new DamageAddTwo(character.getWeapon(weaponName));
                    break;

                case 2:
                    enchantedItem = new DamageAddFive(character.getWeapon(weaponName));
                    break;

                case 3:
                    enchantedItem = new FireDamage(character.getWeapon(weaponName));
                    break;

                case 4:
                    enchantedItem = new PowerUp(character.getWeapon(weaponName));
                    break;
        
                case 5:
                    System.out.println("Returning to previous menu...");
                    break;
                    
                default:
                    break;


            }

            character.removeItem(weaponName);
            character.addItem(enchantedItem.getName(), enchantedItem);
        } while(selection != 5);
    }


    private static void sellItemMenu(Shop shop, PlayerChar character)
    {
        int selection;
        String input;

        String prompt = "Items available to sell\n" + " ITEMS ????\n" +
                        "1. Enter item name\n" + 
                        "2. Go to previous menu\n";
        do
        {
            selection = Validation.getIntegerInput(prompt, 1, 2);
            switch(selection) 
            {
                case 1:
                    input = Validation.getStringInput("Please enter the name of the item you wish to sell");

                    System.out.println("NOT IMPLEMENTED YET");
                    break;
        
                case 2:
                    System.out.println("Returning to previous menu...");
                    break;
                    
                default:
                    break;
            }
        } while(selection != 2);
    }



}