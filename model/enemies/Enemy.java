package model.enemies;

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
}