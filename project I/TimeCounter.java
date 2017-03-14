import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimeCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeCounter extends ScoreBoard
{
    /**
     * Act - do whatever the TimeCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int timeCounter;
    public void act() 
    {
        for(int i = 30 ; i > 0; i--){
            setImage(new GreenfootImage(""+(timeCounter/2000), 22, Color.BLACK, new Color(0,0,0,0))); 
            timeCounter--;
        }
        
        if(timeCounter == 0){
            setImage(new GreenfootImage("0", 22, Color.BLACK, new Color(0,0,0,0))); 
        }
    }    
    
    public TimeCounter(){
        timeCounter = 60000;
    }
}
