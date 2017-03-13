import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sign extends Actor
{
    /**
     * Act - do whatever the Sign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootImage img; 
    public GreenfootImage img2; 
    int time=0;
    public void act() 
    {
        warning();
    }    
    
    public Sign(){
        img = new GreenfootImage("sign.png");
        img2 = new GreenfootImage("sign2.png");
        setImage(img);
    }
    
    public void warning(){
       int tempX = getX();
       int tempY = getY();
       time++;
       if(time%7==0){
           if(getImage() == img){
               setImage(img2);
           } else {
                setImage(img);
           }
       }
       
       if(time%200==0){
           getWorld().addObject(new Bomb(), getX(), 0);
           getWorld().removeObject(this);
           time=0;
        }
        
       
    }
}
