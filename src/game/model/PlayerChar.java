package model;
import model.items.Item;
import java.util.HashMap;
import java.util.Map;
import model.items.*;

public class PlayerChar 
{
    private String name;
    private int maxHealth;
    private int currHealth;
    private Map<String, Item> inventory;
    private Weapon chosenWep;
    private Armour chosenArmour;
    private int gold;

    public PlayerChar(String name, Weapon cheapestWep,
            Armour cheapestArmour)
    {
        this.name = name;
        this.maxHealth = 30;
        this.currHealth = maxHealth;
        this.inventory = new HashMap<String, Item>();
        this.chosenWep = cheapestWep;
        this.chosenArmour = cheapestArmour;
        /* Default gold is 100 */
        this.gold = 100;
    }

    public String getName()
    {
        return name;
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }

    public int getCurrHealth()
    {
        return currHealth;
    }

    public Map<String, Item> getInventory()
    {
        return inventory;
    }

    public int getDamage()
    {
        return chosenWep.getEffect();
    }

    public int getDefence()
    {
        return chosenArmour.getEffect();
    }

    public int getGold()
    {
        return gold;
    }

    public Item getChosenWep()
    {
        return chosenWep;
    }

    public Item getChosenArmour()
    {
        return chosenArmour;
    }

    public void setCurrHealth(int damage, int defence)
    {
        currHealth = currHealth - Math.max(0, damage - defence);
    }

    public String getCharAttributes()
    {
        return "Name: " + getName() + "\n" + 
        "Health: " + getCurrHealth() + "/" + getMaxHealth() + 
        "Inventory: ///////////NEED TO IMPLEMENT THIS LATER??????\n" + 
        "Gold: " + getGold();
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public void addItem(String name, Item item)
    {
        inventory.put(name, item);
    }

    public void removeItem(String name)
    {
        inventory.remove(name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

}