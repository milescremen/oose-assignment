package model.items.enchantments;
import model.items.*;

public class DamageAddTwo extends Enchantment
{
    public DamageAddTwo(Item newItem)
    {
        super(newItem);

        System.out.println("Adding Damage +2 enchantment");
    }

    @Override
    public String getName()
    {
        return newItem.getName() + " With Damage +2 Enchantment";
    }

    @Override
    public int getCost()
    {
        /* Enchantment costs 5 gold, therefore add 5 to the items cost */
        return newItem.getCost() + 5;
    }

    @Override
    public int getEffect()
    {
        return newItem.getEffect() + 2;
    }
}
