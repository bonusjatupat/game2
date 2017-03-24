import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends Actor
{
    /**
     * Act - do whatever the Medium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean mouseOver;
    public void act() 
    {
        // Add your action code here.
     if(Greenfoot.mouseClicked(this)){
            setImage("button_2_press.png");
            Start.level=2;
     }
     if(Start.level!=2){
         setImage("button_2.png");
     }
    }    
}
