import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Swim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swim extends FloatObjects
{
    /**
     * Act - do whatever the Swim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-2);
        eaten();
    }    
    
    public Swim(){
        GreenfootImage swim1 = new GreenfootImage("swimming.png");
        setImage(swim1);
    }
    
    public void eaten(){
        if(Shark.isDown & isTouching(Shark.class)){
            Burst b1 = new Burst();
            getWorld().addObject(b1, getX(), getY());
            MyWorld.eatPeople++;
            MyWorld.score+=10;
            Greenfoot.playSound("Crunch Bite sound effect.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
  
}
