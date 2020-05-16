package model.items;

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

    @Override
    public String getName()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getCost()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEffect()
    {
        // TODO Auto-generated method stub
        return 0;
    }
}