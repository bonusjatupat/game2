import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Timer extends Actor
{
    static int playtime;
    private static final Color transparent = new Color(0,0,0,0);
    public Timer(){
      playtime = 0;
    }
     public void act() {
    
        setImage(new GreenfootImage("Time :  "+((playtime/60)), 18, Color.BLACK, transparent));
        //setImage(new GreenfootImage("Time :  "+(Shark.poweruptime), 18, Color.BLACK, transparent));
       
    }     
}
