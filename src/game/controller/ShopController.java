package controller;

import java.util.Map;

import model.PlayerChar;
import model.Shop;
import model.items.Item;
import model.items.*;

public class ShopController
{
    public static void sellItem(Item item, PlayerChar character)
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

    public static void buyItem(String itemName, PlayerChar character, Shop shop)
    {
        Item item = shop.getInventory().get(itemName);
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

    public static void addEnchantment(String weaponName, Item enchantment, PlayerChar character, Shop shop)
    {
        Item weapon = character.getInventory().get(weaponName);

        if(character.getGold() < enchantment.getCost())
        {
            System.out.println("ERROR: Character doesn't have enough gold");
            //Exception
        }

        // Minus characters gold by the price of the item
        character.setGold(character.getGold() - enchantment.getCost());

    }

    public static String formatShopInventory(Shop shop)
    {

        Map<String, Item> map = shop.getInventory();
        String weapons = "";
        String armour = "";
        String potions = "";

        for(Map.Entry<String, Item> entry : map.entrySet())
        {
            if(entry.getValue() instanceof Weapon)
            {
                weapons += entry.getValue().toString() + "\n";
            }
            else if(entry.getValue() instanceof Armour)
            {
                armour += entry.getValue().toString() + "\n";
            }
            else if(entry.getValue() instanceof Potion)
            {
                potions += entry.getValue().toString() + "\n";
            }
        }

        return "Weapons\n" + weapons + "Armour\n" + armour + "Potions\n" + potions;
    }

}