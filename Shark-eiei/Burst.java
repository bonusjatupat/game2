import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burst extends Actor
{
    /**
     * Act - do whatever the Burst wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //GifImage burst = new GifImage("burst2.gif");
    int timeBurst = 0;
    public void act(){
           timeBurst++;
           //setImage(burst.getCurrentImage());
       if(isTouching(Shark.class)){
       if(Game.HP.value>0){
            Game.HP.subtract(50);
            getWorld().removeObject(this);
       }
       }
       if(timeBurst==40){
               getWorld().removeObject(this);
       }
    }
    
    public Burst(String fileName){
        setImage(new GreenfootImage(fileName));
    }
    
}
