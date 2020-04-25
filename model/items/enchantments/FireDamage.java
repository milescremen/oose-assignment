package model.items.enchantments;

import java.util.Random;
import model.items.Item;

public class FireDamage extends Enchantment 
{
    public FireDamage(Item newItem)
    {
        super(newItem);

        System.out.println("Adding Fire Damage enchanment");
    }

    @Override
    public String getName()
    {
        return newItem.getName() + " With Fire Damage Enchantment";
    }

    @Override
    public int getCost()
    {
        /* Enchantment costs 20 gold, therefore add 5 to the items cost */
        return newItem.getCost() + 20;
    }

    @Override
    public int getEffect()
    {
        // Generates a random number between 5 and 10
        Random rand = new Random();
        int randomDamage;
        
        randomDamage = rand.nextInt((5 - 10) + 1) + 5;

        return newItem.getEffect() + randomDamage;
    }

}