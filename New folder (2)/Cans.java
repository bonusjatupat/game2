import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cans extends FloatObjects
{
    /**
     * Act - do whatever the Cans wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        eaten();
    }    
    
    public Cans(){
        GreenfootImage can1 = new GreenfootImage("can.png");
        setImage(can1);
    }
    
    public void eaten(){
        if(Shark.isDown & isTouching(Shark.class)){
            Burst b1 = new Burst();
            getWorld().addObject(b1, getX(), getY());
            MyWorld.eatGarbage++;
            MyWorld.score-=5;
            Greenfoot.playSound("Ouch.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
