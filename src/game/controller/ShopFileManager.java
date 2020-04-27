package controller;

import java.io.*;

import model.items.Armour;
import model.items.DamagePotion;
import model.items.HealingPotion;
import model.items.Item;
import model.items.Weapon;

public class ShopFileManager 
{
    public static void importFile(String fileName)
    {
        BufferedReader fileStream = null;
        String line;

        try
        {
            fileStream = new BufferedReader(new FileReader(fileName));
            line = fileStream.readLine();

            while(line != null)
            {
                processLine(line);
                line = fileStream.readLine();
            }
        }
        catch(IOException ex)
        {

        }
        
    }

    public static void processLine(String line)
    {
        String[] lineArray;
        lineArray = line.split(",");
        Item newItem = null;

        if(lineArray[0].equals("W") && lineArray.length == 7)
        {
            processWeapon(lineArray);
        }
        else if(lineArray[0].equals("A") && lineArray.length == 6)
        {
            processArmour(lineArray);
        }
        else if(lineArray[0].equals("P"))
        {
            processArmour(lineArray);
        }

        if(newItem == null)
        {
            //Exception
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
                name = lineArray[1];
                cost = Integer.parseInt(lineArray[2]);
                minDamage = Integer.parseInt(lineArray[3]);
                maxDamage = Integer.parseInt(lineArray[4]);
                damageType = lineArray[5];
                weaponType = lineArray[6];

                newItem = new Weapon(name, cost, minDamage, maxDamage, damageType, weaponType);

            }
            catch(NumberFormatException e)
            {
                //Invalid number
            }

        }
        else
        {
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
                name = lineArray[1];
                cost = Integer.parseInt(lineArray[2]);
                minDefence = Integer.parseInt(lineArray[3]);
                maxDefence = Integer.parseInt(lineArray[4]);
                material = lineArray[5];

                newItem = new Armour(name, cost, minDefence, maxDefence, material);
            }
            catch(NumberFormatException e)
            {
                //Invalid number
            }
        }
        else
        {
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
                name = lineArray[1];
                cost = Integer.parseInt(lineArray[2]);
                minEffect = Integer.parseInt(lineArray[3]);
                maxEffect = Integer.parseInt(lineArray[4]);

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
                //Invalid number
            }

        }
        else
        {
            //throw exception
        }
        return newItem;
    }
}