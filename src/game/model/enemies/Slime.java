package model.enemies;

public class Slime extends Enemy
{
    public Slime()
    {
        this.species = "Slime";
        this.maxHealth = 10;
        this.currHealth = maxHealth;
        this.minDamage = 3;
        this.maxDamage = 5;
        this.minDefence = 0;
        this.maxDefence = 2;
        this.goldAward = 10;
        this.initialProb = 0.5f;
    }

}