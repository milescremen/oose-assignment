package model.items.enchantments;
import model.items.Item;


public class PowerUp extends Enchantment 
{
    public PowerUp(Item newItem)
    {
        super(newItem);

        System.out.println("Adding Power-Up enchantment");
    }

    public String getName()
    {
        return newItem.getName() + " With Power-Up Enchantment";
    }

    public int getCost()
    {
        /* Enchantment costs 10 gold, therefore add 5 to the items cost */
        return newItem.getCost() + 10;
    }

    public int getEffect()
    {
        return (int)((double)newItem.getEffect() * 1.1);
    }
}