package model.enemies;

public class Ogre extends Enemy
{
    public Ogre()
    {
        this.species = "Ogre";
        this.maxHealth = 40;
        this.currHealth = maxHealth;
        this.minDamage = 5;
        this.maxDamage = 10;
        this.minDefence = 6;
        this.maxDefence = 12;
        this.goldAward = 40;
    }

    @Override
    public void specialAbility()
    {
        // 20% chance it will attack twice in a row, without the player having a turn in between
    }
}