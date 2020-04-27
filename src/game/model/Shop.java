package model;

import java.util.*;

import model.items.Item;

public class Shop 
{   
    private Map<String, Item> inventory;

    public Shop()
    {
        inventory = new HashMap<String,Item>();
    }

    public void addItem(Item item)
    {
        inventory.put(item.getName(), item);
    }

    public void sellItem(Item item, PlayerChar character)
    {
        int sellPrice;

        if(item.equals(character.getChosenWep()) || item.equals(character.getChosenArmour()))
        {
            //Throw exception
        }

        sellPrice = item.getCost() / 2;
        character.setGold(character.getGold() + sellPrice);

        character.removeItem(item.getName());
    }

    public void buyItem(String itemName, PlayerChar character)
    {
        Item item = inventory.get(itemName);
        /* Checks if the character has the right amount of gold */
        if(character.getGold() < item.getCost())
        {
            System.out.println("ERROR: Character doesn't have enough gold");
            //Exception
        }
       
        // Minus characters gold by the price of the item
        character.setGold(character.getGold() - item.getCost());

        // Add the item to the characters inventory
        character.addItem(item.getName(), item);
    }
}