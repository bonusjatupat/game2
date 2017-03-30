import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Deathcount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorepoint extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    /**
     * Act - do whatever the Deathcount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Scorepoint(){
        
    }
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
    
        setImage(new GreenfootImage("Score :  "+Game.score, 18, Color.BLACK, transparent));
    }      
}
