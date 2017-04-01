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
    int time=0;
    private GreenfootImage img;
    private GreenfootImage img2;
    public void act() 
    {
        moving();
        eaten();
        flying();
        time++;
    } 
    
    public Bird(){
        img = new GreenfootImage("bird1.png");
        img2 = new GreenfootImage("bird2.png");
        setImage(img);
    }
    
    public void flying(){
       if(time%10==0){
           if(getImage() == img){
               setImage(img2);
           } else {
                setImage(img);
           }
           if(time == 100){
               time=0;
           }
        }
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
            if(Game.HP.value>0){
                Game.HP.add(150);
            }
            Greenfoot.playSound("bite_sound.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
