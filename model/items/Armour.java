package model.items;
import java.util.Random;

public class Armour implements Item
{
    private String name; 
    private int cost;
    private int minDefence;
    private int maxDefence;
    private String material;

    public Armour(String name, int cost, int minDefence, int maxDefence, String material)
    {
        this.name = name;
        this.cost = cost;
        this.minDefence = minDefence;
        this.maxDefence = maxDefence;
        this.material = material;
    }
    

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getCost()
    {
        return cost;
    }

    @Override
    public int getEffect()
    {
        Random rand = new Random();
        int randomDefence;
        
        randomDefence = rand.nextInt((minDefence - maxDefence) + 1) + minDefence;
        return randomDefence;
    }

}