import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+2);
        setRotation(getRotation()+5);
        sharkTouch();
    }    
    
    
    
    public void sharkTouch(){
        if(isTouching(Shark.class)){
            Burst b1 = new Burst();
            getWorld().addObject(b1, getX(), getY());
            Greenfoot.playSound("Bomb Timer Sound Effect.mp3");
             
             getWorld().addObject(new ScoreBoard(), getWorld().getWidth()/2, getWorld().getHeight()/2);
             getWorld().addObject(new Score(), getWorld().getWidth()/2, 230);
             getWorld().addObject(new eatPeople(), 318, 287);
             getWorld().addObject(new eatBoat(), 285, 321);
             getWorld().addObject(new eatGarbage(), 340, 360);
             getWorld().addObject(new Buttons("replayBut.png","MyWorld"),430,340);
             getWorld().addObject(new Buttons("homeBut.png","StartWorld"),515,340);
        
             MyWorld.timeCounter = -20;
             getWorld().removeObject(this);
        } else if(getY() >= 450){
            getWorld().removeObject(this);
        }  
    }
}
