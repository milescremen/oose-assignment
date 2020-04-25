package model.items;

public abstract class Potion implements Item
{

    private String name; 
    private int cost;

    public Potion(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }
}

public class HealingPotion extends Potion 
{
    private int minHeal;
    private int maxHeal;

    public HealingPotion(String name, int cost, int minHeal, int maxHeal)
    {
        super(name, cost);
        this.minHeal = minHeal;
        this.maxHeal = maxHeal;
    }

}
 
public class DamagePotion extends Potion
{
    private int minDamage;
    private int maxDamage;

    public DamagePotion(String name, int cost, int minDamage, int maxDamage)
    {
        super(name, cost);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
}