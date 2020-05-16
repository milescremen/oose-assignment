package model.items.enchantments;

import model.items.Item;

public class DamageAddFive extends Enchantment
{
    public DamageAddFive(Item newItem)
    {
        super(newItem);

        System.out.println("Adding Damage +5 Enchantment");
    }

    @Override
    public String getName()
    {
        return newItem.getName() + " With Damage +5 Enchantment";
    }

    @Override
    public int getCost()
    {
        /* Enchantment costs 10 gold, therefore add 5 to the items cost */
        return newItem.getCost() + 10;
    }

    @Override
    public int getEffect()
    {
        return newItem.getEffect() + 5;
    }
}