package model.enemies;

public class Ogre extends SpecialAbility
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
        this.initialProb = 0.2f
    }
}