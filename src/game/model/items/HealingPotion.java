package model.items;

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