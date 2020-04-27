package model.enemies;
import java.util.Random;

public abstract class Enemy
{
    protected String species;
    protected int maxHealth;
    protected int currHealth;
    protected int minDamage;
    protected int maxDamage;
    protected int minDefence;
    protected int maxDefence;
    protected int goldAward;


    public abstract void specialAbility();
    
    public int getDamage()
    {
        Random rand = new Random();
        int randomDamage;
        
        randomDamage = rand.nextInt((minDamage - maxDamage) + 1) + minDamage;
        return randomDamage;
    }

    public int getDefence()
    {
        Random rand = new Random();
        int randomDefence;
        
        randomDefence = rand.nextInt((minDefence - maxDefence) + 1) + minDefence;
        return randomDefence;
    }
}