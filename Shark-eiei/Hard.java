import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hard extends Actor
{
    public void act() 
    {
     if(Greenfoot.mouseClicked(this)){
            setImage("button_3_press.png");
            Start.level=3;
     }
     if(Start.level!=3){
         setImage("button_3.png");
     }
    }    
}
