import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Objects
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moving(-1);
    }    
    
    public Ground(String fileName){
        setImage(fileName);
    }
    
    public Ground(){
        int randomGround = Greenfoot.getRandomNumber(4);
        if(randomGround == 0){
            GreenfootImage ground1 = new GreenfootImage("gound1.png");
            setImage(ground1);
        } else {
            GreenfootImage ground2 = new GreenfootImage("gound2.png");
            setImage(ground2);
        }
    }
    
    
    
}
