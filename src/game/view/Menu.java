package view;
import model.*;
import model.items.*;
import controller.Validation;
import model.Shop;
import model.items.Armour;
import model.items.Weapon;
import java.util.*;


public class Menu 
{
    public static void main(String args[])
    {
        Shop shop = new Shop();
        Weapon cheapestWep = new Weapon("cheapWep", 30, 5, 10, "damageType", "weaponType");
        Armour cheapestArmour = new Armour("cheapArm", 30, 5, 10, "material");
        PlayerChar character = new PlayerChar("Merles", cheapestWep, cheapestArmour);
        Menu.mainMenu(shop, character);

    }

    public static void mainMenu(Shop shop, PlayerChar character)
    {
        int selection;
        String prompt = "1. Go to shop\n" + 
                        "2. Choose Character Name\n" +
                        "3. Choose Weapon\n" +
                        "4. Choose Armour\n" +
                        "5. Start Battle\n" + 
                        "6. Exit game\n";
        do
        {
            selection = Validation.validateInteger(prompt, 1, 6);
            switch(selection) 
            {
                case 1:
                    ShopMenu.shopMenu(shop, character);
                    break;
        
                case 2:
                    nameMenu(character);
                    break;
                    
                case 3:
                    weaponMenu(); 
                    break;
        
                case 4:
                    armourMenu(); 
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




    private static void armourMenu()
    {
    }

    private static void battleMenu()
    {
    }

    private static void weaponMenu()
    {
    }

    private static void nameMenu(PlayerChar character)
    {
        int selection;
        String prompt = "Current name: " + character.getName() + "\n" +
                        "1. Change character name\n" +
                        "2. Return to previous menu\n";
        selection = Validation.validateInteger(prompt, 1, 2);
        switch(selection) 
        {
            case 1:
                Scanner sc = new Scanner(System.in);
                String input;
                Item item;
                System.out.println("Please enter a new character name");
                            
                input = sc.nextLine(); 

                if(!Validation.validateString(input))
                {
                    //throw exception 
                    System.out.println("Invalid String");
                }

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

