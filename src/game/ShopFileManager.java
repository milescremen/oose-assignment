
import java.io.*;

import model.items.Armour;
import model.items.DamagePotion;
import model.items.HealingPotion;
import model.items.Item;
import model.items.Weapon;
import model.*;
import java.util.*;

public class ShopFileManager 
{
    public static void importFile(String fileName, Shop shop)
    {
        BufferedReader fileStream = null;
        String line;

        try
        {
            fileStream = new BufferedReader(new FileReader(fileName));
            line = fileStream.readLine();
            

            while(line != null)
            {

                System.out.println("LINE: " + line);
                processLine(line, shop);
                line = fileStream.readLine();
            }
        }
        catch(IOException ex)
        {
            System.out.println("IO EXCEPTION");
            System.out.println(ex.getMessage());
        }
    }

    public static void processLine(String line, Shop shop)
    {
        String[] lineArray;
        lineArray = line.split(",");
        Item newItem = null;

        if(lineArray[0].equals("W") && lineArray.length == 7)
        {
            newItem = processWeapon(lineArray);
        }
        else if(lineArray[0].equals("A") && lineArray.length == 6)
        {
            newItem = processArmour(lineArray);
        }
        else if(lineArray[0].equals("P"))
        {
            newItem = processArmour(lineArray);
        }

        if(newItem == null)
        {
           System.out.println("newItem is null"); //Exception
        }
        else
        {
            shop.addItem(newItem);
        }
    }
    
    public static Item processWeapon(String[] lineArray)
    {
        Item newItem = null;
        String name;
        int cost;
        int minDamage;
        int maxDamage;
        String damageType;
        String weaponType; 

        if(Validation.weaponIsValid(lineArray))
        {
            try
            {
                name = lineArray[1].trim();
                cost = Integer.parseInt(lineArray[2].trim());
                minDamage = Integer.parseInt(lineArray[3].trim());
                maxDamage = Integer.parseInt(lineArray[4].trim());
                damageType = lineArray[5].trim();
                weaponType = lineArray[6].trim();

                newItem = new Weapon(name, cost, minDamage, maxDamage, damageType, weaponType);

            }
            catch(NumberFormatException e)
            {
                System.out.println("Weapon invalid parse");
                //Invalid number
            }
        }
        else
        {
            System.out.println("Invalid Weapon");
            //throw exception
        }
        return newItem;
    }

    public static Item processArmour(String[] lineArray)
    {

        Item newItem = null;
        String name;
        int cost;
        int minDefence;
        int maxDefence;
        String material;

        if(Validation.armourIsValid(lineArray))
        {
            try
            {
                name = lineArray[1].trim();
                cost = Integer.parseInt(lineArray[2].trim());
                minDefence = Integer.parseInt(lineArray[3].trim());
                maxDefence = Integer.parseInt(lineArray[4].trim());
                material = lineArray[5].trim();

                newItem = new Armour(name, cost, minDefence, maxDefence, material);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Armour invalid parse");
                //Invalid number
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Invalid armour");
            //throw exception
        }
        return newItem;
    }

    public static Item processPotion(String[] lineArray)
    {

        Item newItem = null;
        String name;
        int cost;
        int minEffect;
        int maxEffect;


        if(Validation.potionIsValid(lineArray))
        {
            try
            {
                name = lineArray[1].trim();
                cost = Integer.parseInt(lineArray[2].trim());
                minEffect = Integer.parseInt(lineArray[3].trim());
                maxEffect = Integer.parseInt(lineArray[4].trim());

                if(lineArray[4].equals("H")) 
                {
                    newItem = new HealingPotion(name, cost, minEffect, maxEffect);
                }
                else if(lineArray[4].equals("D"))
                {
                    newItem = new DamagePotion(name, cost, minEffect, maxEffect);
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Potion invalid parse");
                //Invalid number
            }

        }
        else
        {
            System.out.println("Invalid Potion");
            //throw exception
        }
        return newItem;
    }
}