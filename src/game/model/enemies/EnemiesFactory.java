package model.enemies;

public class EnemiesFactory
{
    public static Enemy createEnemy(String name)
    {
        Enemy newEnemy = null;
        if(name.equalsIgnoreCase("Slime"))
        {
            newEnemy = new Slime();
        }
        else if(name.equalsIgnoreCase("Goblin"))
        {
            newEnemy = new Goblin();
        }
        else if(name.equalsIgnoreCase("Ogre"))
        {
            newEnemy = new Ogre();
        }
        else if(name.equalsIgnoreCase("Dragon"))
        {
            newEnemy = new Dragon();
        }
        return newEnemy;
    }
}
