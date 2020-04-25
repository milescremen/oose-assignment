package model.items.enchantments;
import model.items.Item;

public abstract class Enchantment implements Item
{
    protected Item newItem;
    public Enchantment(Item newItem)
    {
        this.newItem = newItem;
        System.out.println("Basic Enchantment");
    }

    @Override
    public String getName()
    {
        return newItem.getName();
    }

    @Override
    public int getCost()
    {
        return newItem.getCost();
    }

    @Override
    public int getEffect()
    {
        return newItem.getEffect();
    }
}