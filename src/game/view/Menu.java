package view;
import model.*;
import model.items.*;
import controller.Validation;
import model.Shop;
import model.items.Armour;
import model.items.Weapon;
import java.util.*;
import controller.*;


public class Menu 
{
    public static void main(String args[])
    {
        Shop shop = new Shop();
        Weapon cheapestWep = new Weapon("cheapWep", 30, 5, 10, "damageType", "weaponType");
        Armour cheapestArmour = new Armour("cheapArm", 30, 5, 10, "material");
        PlayerChar character = new PlayerChar("Merles", cheapestWep, cheapestArmour);
        ShopFileManager.importFile("resources/shop_data.txt", shop);
        System.out.println(shop.getInventory().keySet());

        character.addItem("cheapArm", cheapestArmour);
        Menu.mainMenu(shop, character);

    }

    public static void mainMenu(Shop shop, PlayerChar character)
    {
        int selection;
        String prompt = "Player Attributes\n" + character.getCharAttributes() + "\n" +
                        "1. Go to shop\n" + 
                        "2. Choose Character Name\n" +
                        "3. Choose Weapon\n" +
                        "4. Choose Armour\n" +
                        "5. Start Battle\n" + 
                        "6. Exit game\n";
        do
        {
            selection = Validation.getIntegerInput(prompt, 1, 6);
            switch(selection) 
            {
                case 1:
                    ShopMenu.shopMenu(shop, character);
                    break;
        
                case 2:
                    nameMenu(character);
                    break;
                case 3:
                    weaponMenu(character); 
                    break;
        
                case 4:
                    armourMenu(character); 
                    break;

                case 5:
                    battleMenu();
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    break;
            }
        } while(selection != 6);

        
    }


    private static void weaponMenu(PlayerChar character)
    {
        int selection;
        String input;

        String prompt = "Weapons available to equip\n" + " ITEMS ????\n" +
                        "1. Enter item name\n" + 
                        "2. Go to previous menu\n";
        do
        {
            selection = Validation.getIntegerInput(prompt, 1, 2);
            switch(selection) 
            {
                case 1:
                    input = Validation.getStringInput("Please enter the name of the weapon you wish to equip");

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


    private static void armourMenu(PlayerChar character)
    {
        int selection;
        String input;

        String prompt = "Armour available to equip\n" + " ITEMS ????\n" +
                        "1. Enter item name\n" + 
                        "2. Go to previous menu\n";
        do
        {
            selection = Validation.getIntegerInput(prompt, 1, 2);
            switch(selection) 
            {
                case 1:
                    input = Validation.getStringInput("Please enter the name of the armour you wish to equip");

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

    private static void battleMenu()
    {
    }

    private static void nameMenu(PlayerChar character)
    {
        int selection;
        String prompt = "Current name: " + character.getName() + "\n" +
                        "1. Change character name\n" +
                        "2. Return to previous menu\n";

        selection = Validation.getIntegerInput(prompt, 1, 2);
        switch(selection) 
        {
            case 1:
                String input;
                
                input = Validation.getStringInput("Please enter a new character name");
                character.setName(input);

                System.out.println("Your new character name is " + character.getName());
                break;
            case 2:
                System.out.println("Returning to previous menu...");
                break;
            default:
                break;
        }
    }
}

