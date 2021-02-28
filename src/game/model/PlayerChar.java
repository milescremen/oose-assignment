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
    private Item chosenWep;
    private Item chosenArmour;
    private int gold;
    private List<Observer> observers;

    public PlayerChar(String name, Item cheapestWep,
            Item cheapestArmour)
    {
        this.name = name;
        this.maxHealth = 30;
        this.currHealth = maxHealth;
        this.inventory = new HashMap<String, Item>();
        this.chosenWep = cheapestWep;
        this.chosenArmour = cheapestArmour;
        /* Default gold is 100 */
        this.gold = 100;
        this.observers = new ArrayList<Observer>();
    }

    public PlayerChar(String name, int maxHealth, int currHealth, 
        Item chosenWep, Item chosenArmour, int gold)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currHealth = currHealth;
        this.chosenWep = chosenWep;
        this.chosenArmour = chosenArmour;
        this.gold = gold;
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
        return 
        "---------------------------------------\n" +
        "Name: " + getName() + "\n" + 
        "Health: " + getCurrHealth() + "/" + getMaxHealth() + "\n" +
        "Inventory: " + inventory.keySet() + "\n" +
        "Current Weapon: " + chosenWep.getName() + "\n" +
        "Current Armour: " + chosenArmour.getName() + "\n" +
        "Gold: " + getGold() + "\n" +
        "---------------------------------------\n";
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public void addItem(String name, Item item)
    {
        inventory.put(name, item);
        notifyObservers();
    }

    public void removeItem(String name)
    {
        inventory.remove(name);
        notifyObservers();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeapon(Weapon weapon)
    {
        this.chosenWep = weapon;
    }

    public void setArmour(Armour armour)
    {
        this.chosenArmour = armour;
    }

    public Item getWeapon(String weaponName)
    {
        return inventory.get(weaponName);
    }

    public void addObserver(Observer obs)
    {
        observers.add(obs);
    }

    public void removeObserver(Observer obs)
    {
        observers.remove(obs);
    }

    public void notifyObservers()
    {
        for(Observer obs: observers)
        {
            obs.viewUpdated;
        }
    }
}