import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Actor
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //int image = 1;
    public void act() 
    {
        /*if ( image==1 && Greenfoot.mouseClicked(this) ) {
            image=2;
            StartWorld.level=1;
            setImage ("1pressed.png");
        }
        if ( image==2 && Greenfoot.mouseClicked(this) ) {
            image=1;
            StartWorld.level=0;
            setImage ("1.png");
        }*/
        
        if(Greenfoot.mouseClicked(this)){
            StartWorld.level=1;
        }
        
    }
    
}
