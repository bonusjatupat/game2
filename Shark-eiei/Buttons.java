import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Buttons extends Actor
{
    GreenfootImage img;
    String world;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && world.equals("MyWorld")){
            if(Start.level > 0){
                Greenfoot.setWorld(new Game());
            } else if(Start.level == 0){
                getWorld().addObject(new chooseStage(),getWorld().getWidth()/2, 285);
            }
        } else if(Greenfoot.mouseClicked(this) && world.equals("StartWorld")){
            Greenfoot.setWorld(new Start());
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
