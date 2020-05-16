package model.items;
import model.items.Item;

import java.util.Random;

public class Weapon implements Item
{
    private String name;
    private int cost;
    private int minDamage;
    private int maxDamage;
    private String weaponType;
    private String damageType;

    public Weapon(String name, int cost, int minDamage, int maxDamage, String damageType, String weaponType)
    {
        this.name = name;
        this.cost = cost;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.damageType = damageType;
        this.weaponType = weaponType;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getCost()
    {
        return cost;
    }

    @Override
    public int getEffect()
    {
        Random rand = new Random();
        int randomDamage;
        
        randomDamage = rand.nextInt((minDamage - maxDamage) + 1) + minDamage;
        return randomDamage;
    }

    public String getType()
    {
        return weaponType;
    }

    public String getDamageType()
    {
        return damageType;
    }

    public String toString()
    {
        return "Name: " + name + " Cost: " + cost + " Min Damage: " + minDamage +
                " Max Damage: " + maxDamage + " Weapon Type: " + weaponType + " Damage type: " + damageType;
    }
    
}