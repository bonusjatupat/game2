import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trees extends Objects
{
    /**
     * Act - do whatever the Trees wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moving(-2);
    }    
    
    public Trees(){
        int randomTree = Greenfoot.getRandomNumber(10);
        if(randomTree == 0){
            GreenfootImage tree1 = new GreenfootImage("1tree.png");
            setImage(tree1);
        } else if(randomTree == 1){
            GreenfootImage tree2 = new GreenfootImage("2tree.png");
            setImage(tree2);
        } else {
            GreenfootImage tree3 = new GreenfootImage("notree.png");
            setImage(tree3);
        }
    }
}
