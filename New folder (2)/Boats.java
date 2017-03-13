import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boats extends FloatObjects
{
    /**
     * Act - do whatever the Boats wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moving();
        eaten();
     
    }    
    
    public Boats(){
        int randomHouse = Greenfoot.getRandomNumber(3);
        if(randomHouse == 0){
            GreenfootImage boat1 = new GreenfootImage("boat1.png");
            setImage(boat1);
        } else if(randomHouse == 1){
            GreenfootImage boat2 = new GreenfootImage("boat2.png");
            setImage(boat2);
        } else if(randomHouse == 2){
            GreenfootImage boat3 = new GreenfootImage("boat3.png");
            setImage(boat3);
        } else if(randomHouse == 3){
            GreenfootImage boat4 = new GreenfootImage("boat4.png");
            setImage(boat4);
        }
    }
    
    public void moving(){
        move(-2);
    }
    
    public void eaten(){
        if(Shark.isDown & isTouching(Shark.class)){
            Burst b1 = new Burst();
            getWorld().addObject(b1, getX(), getY());
            MyWorld.eatBoat++;
            MyWorld.score+=5;
            Greenfoot.playSound("Crunch Bite sound effect.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
  
}
