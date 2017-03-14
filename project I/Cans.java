import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cans extends FloatObjects
{
    /**
     * Act - do whatever the Cans wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timeFloat;
    public void act() 
    {
        timeFloat++;
        moving();
        eaten();
    }    
    
    public Cans(){
        GreenfootImage can1 = new GreenfootImage("can.png");
        setImage(can1);
    }
    
    public void moving(){
        if(StartWorld.level==1){
            move(-2);
        } else if (StartWorld.level==2){
            move(-3);
        } else if (StartWorld.level==3){
            move(-4);
        } 
        
        if(timeFloat%30==0){
            setLocation(getX(), getY()+3);
        } else if (timeFloat%59==0){
            setLocation(getX(), getY()-3);
            timeFloat=0;
        }
    }
    
    public void eaten(){
        if(Shark.isDown & isTouching(Shark.class)){
            Burst b1 = new Burst("poisonSmoke2.png");
            getWorld().addObject(b1, getX(), getY());
            MyWorld.eatGarbage++;
            MyWorld.score-=5;
            Greenfoot.playSound("Ouch.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
