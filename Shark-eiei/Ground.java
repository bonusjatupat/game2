import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Ground extends Objects
{
    public void act() 
    {
        moving(-1);
    }    
    public Ground(String fileName){
        setImage(fileName);
    }
    public Ground(){
        int randomGround = Greenfoot.getRandomNumber(4);
        if(randomGround == 0){
            GreenfootImage ground1 = new GreenfootImage("gound1.png");
            setImage(ground1);
        } else {
            GreenfootImage ground2 = new GreenfootImage("gound2.png");
            setImage(ground2);
        }
    }
}
