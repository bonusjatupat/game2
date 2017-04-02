import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Trees extends Objects
{
    public void act() 
    {
        moving(-2);
    }    
    public Trees(){
        int randomTree = Greenfoot.getRandomNumber(3);
        if(randomTree == 0){
            GreenfootImage tree1 = new GreenfootImage("1tree.png");
            setImage(tree1);
        } else if(randomTree == 1){
            GreenfootImage tree2 = new GreenfootImage("2tree.png");
            setImage(tree2);
        } else if(randomTree == 2){
            GreenfootImage tree3 = new GreenfootImage("2tree2.png");
            setImage(tree3);
        }
    }
}
