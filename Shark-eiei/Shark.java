import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isDown;
    public void act() 
    {
        // Add your action code here.
        checkKey();
        pressA();
    }    
    
    
    public void checkKey(){
        if(getX()>=60) move(-1);
        
        if(Game.timeCounter > 0){
            if(Greenfoot.isKeyDown("left")) move(-5);
            if(Greenfoot.isKeyDown("right")) move(5);
            if(Greenfoot.isKeyDown("down")) setLocation(getX(), getY()+2);
            if(Greenfoot.isKeyDown("up")){
                if(getY() >= 390){
                    setLocation(getX(), getY()-2); 
                }
            }
        } 
    }
    
    public void pressA(){
        if(Game.timeCounter > 0){
            if ( !isDown && Greenfoot.isKeyDown("space") ) {
                setImage ("shark2.png");
                isDown = true;
            }
            if ( isDown && !Greenfoot.isKeyDown("space") ) {
                setImage ("shark.png");
                isDown = false;
            }
        }
    }
    
}
