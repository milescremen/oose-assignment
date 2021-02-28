

public abstract class Enemy()
{
    protected String species;
    protected int maxHealth;
    protected int currHealth;
    protected int minDamage;
    protected int maxDamage;
    protected int minDefence;
    protected int maxDefence;
    protected int goldAward;
    protected float initialProb;

    public Enemy()
    {
        
    }

    public abstract String getSpecies();
    public abstract int getMaxHealth();
    public abstract int getMinDamage();
    public abstract int getMaxDamage();
    public abstract int getMinDefence();
    public abstract int getGoldAward();
    public abstract float getInitialProb();
}