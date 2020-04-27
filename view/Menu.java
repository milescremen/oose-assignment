package view;
import model.Character;
import controller.Validation;

public class Menu 
{

    public static void main(String args[])
    {
        Menu.mainMenu();
    }

    public static void mainMenu()
    {
        int selection;
        String prompt = "1. Go to shop\n" + 
                        "2. Choose Character Name\n" +
                        "3. Choose Weapon\n" +
                        "4. Choose Armour\n" +
                        "5. Start Battle\n" + 
                        "6. Exit game\n";

        selection = Validation.validateInteger(prompt, 1, 6);
        while(selection != 6) 
        {
            switch(selection) 
            {
                case 1:
                    shopMenu();
                    break;
        
                case 2:
                    nameMenu();
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
        }

        
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

    private static void nameMenu()
    {
    }

    private static void shopMenu()
    {
    }

}

