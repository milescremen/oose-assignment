package model.items;
import model.items.Item;

import java.util.Random;

public class Weapon implements Item
{
    private String name;
    private int cost;
    private int minDamage;
    private int maxDamage;
    private String type;
    private String damageType;

    public Weapon(String name, int cost, int minDamage, int maxDamage, String type, String damageType)
    {
        this.name = name;
        this.cost = cost;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.type = type;
        this.damageType = damageType;
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
        return type;
    }

    public String getDamageType()
    {
        return damageType;
    }
    
}