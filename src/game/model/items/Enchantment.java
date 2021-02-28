package model.items;
import model.items.Item;

public abstract class Enchantment implements Item
{
    protected Item next;
    
    public Enchantment(Item next)
    {    
        this.next = next;
        System.out.println("Basic Enchantment");
    }

    @Override
    public String getName()
    {
        return next.getName();
    }

    @Override
    public int getCost()
    {
        return next.getCost();
    }

    @Override
    public int getEffect()
    {
        return next.getEffect();
    }
}