import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Sign extends Actor
{
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
