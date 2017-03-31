import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chooseStage extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    public chooseStage(){
        
    }
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
        setImage(new GreenfootImage("Please select the level!", 18, Color.BLACK, transparent));
    }     
}
