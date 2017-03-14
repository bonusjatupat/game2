import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{

    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public static int level;
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(670, 500, 1); 
        //Greenfoot.playSound("Hawaii Five-O.mp3");
        level=0;
        addObject(new Buttons("startBut.png", "MyWorld"), getWidth()/2, 390);
        addObject(new Buttons("ttrBut.png", "ttr"), getWidth()/2, 460);
        addObject(new Easy(), 258, 322);
        addObject(new Medium(), getWidth()/2, 322);
        addObject(new Hard(), 410, 322);
    }
}
