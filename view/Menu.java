package view;
import model.Character;

public class Menu 
{

    public static void main(String args[])
    {

    }

    public static void mainMenu()
    {
        String prompt = "1. Go to shop\n" + 
                        "2. Choose Character Name\n" +
                        "3. Choose Weapon\n" +
                        "4. Choose Armour\n" +
                        "5. Start Battle\n" + 
                        "6. Exit game\n";

        

        
    }

    public static displayCharAttributes(Character character)
    {
        System.out.println(
            "Name: " + character.getName() + "\n" + 
            "Health: " character.getCurrHealth() + "/" + character.getMaxHealth() + 
            "Inventory: ///////////NEED TO IMPLEMENT THIS LATER??????\n" + 
            "Gold: " + character.getGold()
        );

        
    }


}

