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

    public Map<String, Item> getInventory()
    {
        return inventory;
    }

    public Item getItem(String name)
    {
        return inventory.get(name);
    }
    
}