import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElectricPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricPost extends Building
{
    /**
     * Act - do whatever the ElectricPost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public ElectricPost(){
        GreenfootImage post1 = new GreenfootImage("electricPost.png");
        setImage(post1);
    }
    
    public ElectricPost(String fn){
        GreenfootImage post1 = new GreenfootImage(fn);
        setImage(fn);
    }
}
