package model.enemies;

public class Dragon extends Enemy
{
    public Dragon()
    {
        this.species = "Dragon";
        this.maxHealth = 100;
        this.currHealth = maxHealth;
        this.minDamage = 15;
        this.maxDamage = 30;
        this.minDefence = 15;
        this.maxDefence = 20;
        this.goldAward = 100;
    }

    @Override
    public void specialAbility()
    {
        // 35 chance of one of the following,
        // a) damge inflicted will double (25% chance)
        // b) it will recover 10 health (10% chance)
    }
}