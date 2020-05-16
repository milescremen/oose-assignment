package controller;
import model.enemies.*;
import java.util.Random;

public class SelectEnemy 
{
    private float slimeProb;
    private float goblinProb;
    private float ogreProb;
    private float dragonProb;

    public SelectEnemy()
    {
        slimeProb = 0.5f;
        goblinProb = 0.3f;
        ogreProb = 0.2f;
        dragonProb = 0.0f;
    }

    public void selectEnemy()
    {
        Random random = new Random();
        float randomNum = random.nextFloat();

        if(randomNum < slimeProb)
        {
            //Create slime
        }
        else if(slimeProb < randomNum && 
                randomNum < (slimeProb + goblinProb))
        {
            //Create goblin
        }
        else if((slimeProb + goblinProb) < randomNum && 
                randomNum < (slimeProb + goblinProb + ogreProb))
        {
            //Create ogre
        }
        else if((slimeProb + goblinProb + ogreProb) < randomNum &&
                randomNum < (slimeProb + goblinProb + ogreProb + dragonProb))
        {
            //Create dragon
        }

        // Need some sort of error checking (i.e slimeProb cant be less than zero)
        slimeProb -= 0.05f;
        goblinProb -= 0.05f;
        ogreProb -= 0.05f;
        dragonProb += 0.15f;


    }




}