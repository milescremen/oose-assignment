package model.items;

public abstract class Potion implements Item
{

    private String name; 
    private int cost;

    public Potion(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }
}

 