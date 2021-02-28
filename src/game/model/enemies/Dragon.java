package model.enemies;

public class Dragon implements Enemy
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
        this.initialProb = 0.0f;
    }

}