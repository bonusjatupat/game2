import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    String world;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && world.equals("MyWorld")){
            if(StartWorld.level > 0){
                Greenfoot.setWorld(new MyWorld());
            } else if(StartWorld.level == 0){
                getWorld().showText("Please select the level!", getWorld().getWidth()/2, 280);
            }
        } else if(Greenfoot.mouseClicked(this) && world.equals("StartWorld")){
            Greenfoot.setWorld(new StartWorld());
        } else if(Greenfoot.mouseClicked(this) && world.equals("ttr")){
            getWorld().addObject(new Tutorial(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
    }    
    
    public Buttons(String fileName, String world){
        img = new GreenfootImage(fileName);
        setImage(img);
        this.world = world;
    }
}
