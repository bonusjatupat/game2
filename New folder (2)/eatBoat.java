import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class eatBoat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eatBoat extends ScoreBoard
{
    /**
     * Act - do whatever the eatBoat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public eatBoat(){
        setImage(new GreenfootImage(""+MyWorld.eatBoat, 35, Color.white, null)); 
    }
}
