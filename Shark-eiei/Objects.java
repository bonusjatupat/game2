import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Objects extends SmoothMover
{
    public void act() 
    {
       
    } 
    public void moving(int speed){
        move(speed);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
