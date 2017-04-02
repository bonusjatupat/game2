import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Scorepoint extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    public Scorepoint(){
        
    }
     public void act() {
    
        setImage(new GreenfootImage("Score :  "+Game.score, 18, Color.BLACK, transparent));
    }      
}
