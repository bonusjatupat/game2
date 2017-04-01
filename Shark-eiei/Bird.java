import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends FloatObjects
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moving();
        eaten();
    } 
    
    public void moving(){
        if(Start.level==1){
            move(-2);
        } else if (Start.level==2){
            move(-3);
        } else if (Start.level==3){
            move(-4);
        } 
    }
    
    public void eaten(){
        if(Shark.isDown & isTouching(Shark.class)){
            //Burst b1 = new Burst("bursttt.png");
            //getWorld().addObject(b1, getX(), getY()+20);
            Game.eatStuff++;
            Game.HP.add(150);
            Greenfoot.playSound("bite_sound.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
