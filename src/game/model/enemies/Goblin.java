package model.enemies;

public class Goblin extends Enemy
{
    public Goblin()
    {
        this.species = "Goblin";
        this.maxHealth = 30;
        this.currHealth = maxHealth;
        this.minDamage = 3;
        this.maxDamage = 8;
        this.minDefence = 4;
        this.maxDefence = 8;
        this.goldAward = 20;
    }

    @Override
    public void specialAbility()
    {
        // 50% chance that its attack will have 3 extra damage
    }
}