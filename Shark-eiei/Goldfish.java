import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cans here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goldfish extends FloatObjects
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
    
    public Goldfish(){
       GreenfootImage can1 = new GreenfootImage("goldfish.png");
       setImage(can1);
    }
    
    public void moving(){
        if(Start.level==1){
            move(-2);
        } else if (Start.level==2){
            move(-3);
        } else if (Start.level==3){
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
            Burst b1 = new Burst("blood.png");
            getWorld().addObject(b1, getX(), getY()+70);
<<<<<<< HEAD
=======
            //Game.eatGarbage++;
            Timer.playtime+=600;
        if(Game.HP.value>0){
>>>>>>> origin/master
            Game.HP.add(200);
        }
            Greenfoot.playSound("powerup_sound.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
