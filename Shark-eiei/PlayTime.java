import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eatPeople here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayTime extends ScoreBoard
{
    /**
     * Act - do whatever the eatPeople wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public PlayTime(){
        setImage(new GreenfootImage(""+(Timer.playtime/60), 35, Color.WHITE,  new Color(0,0,0,0))); 
    }
}
