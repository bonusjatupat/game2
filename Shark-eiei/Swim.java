import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Swim extends FloatObjects
{
    int timeFloat;
    public void act() 
    {
        // Add your action code here.
        timeFloat++;
        moving();
        eaten();
    }    
    public Swim(){
        int randomSwim = Greenfoot.getRandomNumber(3);
        if(randomSwim == 0){
            GreenfootImage swim1 = new GreenfootImage("swimming.png");
            setImage(swim1);
        } else if(randomSwim == 1){
            GreenfootImage swim2 = new GreenfootImage("jetskii.png");
            setImage(swim2);
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
        
        if(timeFloat%30==0){
            setLocation(getX(), getY()+3);
        } else if (timeFloat%59==0){
            setLocation(getX(), getY()-3);
            timeFloat=0;
        }
    }
    public void eaten(){
        if(Shark.isDown & isTouching(Shark.class)){
            Burst b1 = new Burst("blood_splash.png");
            getWorld().addObject(b1, getX(), getY());
            Game.eatStuff++;
            if(Game.HP.value>0){
                Game.HP.add(300);
            }
            Greenfoot.playSound("bite_sound.mp3");
            getWorld().removeObject(this);
        } else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
  
}
