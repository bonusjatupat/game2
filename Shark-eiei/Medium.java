import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Medium extends Actor
{
    boolean mouseOver;
    public void act() 
    {
     if(Greenfoot.mouseClicked(this)){
            setImage("button_2_press.png");
            Start.level=2;
     }
     if(Start.level!=2){
         setImage("button_2.png");
     }
    }    
}
