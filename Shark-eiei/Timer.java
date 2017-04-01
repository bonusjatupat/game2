import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    static int playtime;
    private static final Color transparent = new Color(0,0,0,0);
    public Timer(){
      playtime = 0;
    }
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
    
        setImage(new GreenfootImage("Time :  "+((playtime/60)), 18, Color.BLACK, transparent));
    }     
}
