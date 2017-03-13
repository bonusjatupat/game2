import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building extends Objects
{
    /**
     * Act - do whatever the Building wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // moving(-1);
    }    
    
    public Building(){
        int randomHouse = Greenfoot.getRandomNumber(3);
        if(randomHouse == 0){
            GreenfootImage house1 = new GreenfootImage("house1edited.png");
            setImage(house1);
        } else if(randomHouse == 1){
            GreenfootImage house2 = new GreenfootImage("house2edited.png");
            setImage(house2);
        } else if(randomHouse == 2){
            GreenfootImage house3 = new GreenfootImage("house3edited.png");
            setImage(house3);
        }
    }
    
    public Building(String fileName){
        setImage(fileName);
    }
    
   
}
