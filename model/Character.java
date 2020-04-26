package model;
import model.items.Item;
import java.util.HashMap;
import java.util.Map;
import model.items.*;

public class Character 
{
    private String name;
    private int maxHealth;
    private int currHealth;
    private Map<String, Item> inventory;
    private Weapon chosenWep;
    private Armour chosenArmour;
    private int gold;

    public Character(String name, int currHealth, Weapon cheapestWep,
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

    public void setCurrHealth(int damage, int defence)
    {
        currHealth = currHealth - Math.max(0, damage - defence);
    }



}