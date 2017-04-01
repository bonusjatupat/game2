import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean isDown;
    public static boolean stopMover = false;
    public void act() 
    {
        // Add your action code here.
        checkKey();
        pressA();
        jump();
    }  
    
    public void checkKey(){
        if(getX()>=60) move(-3);
        
        if(/*Timer.playtime<=3600 && Timer.playtime>0*/ Game.HP.value>0 && stopMover==false){
            if(Greenfoot.isKeyDown("left")) move(-5);
            if(Greenfoot.isKeyDown("right")) move(5);
            if(Greenfoot.isKeyDown("down")) setLocation(getX(), getY()+2);
            if(Greenfoot.isKeyDown("up")){
                if(getY() >= 390){
                    setLocation(getX(), getY()-2); 
                }
            }
        } 
    }
    
    public void pressA(){
        if(Timer.playtime<=4000 && Timer.playtime>0 && stopMover==false){
            if ( !isDown && Greenfoot.isKeyDown("space") ) {
                setImage ("shark2.png");
                isDown = true;
            }
            if ( isDown && !Greenfoot.isKeyDown("space") ) {
                setImage ("shark.png");
                isDown = false;
            }
        }
    }
   
    public int goUp;
    public int groundLevel=450;
    boolean isJump = false;
    public void jump()
    {
        if(stopMover==true){
            setLocation(getX(),groundLevel);
        }
        boolean onGround = (getY() == groundLevel);
        //boolean checkFly = false;
        if (!onGround && isJump && stopMover==false)
        {
           goUp++;
           setLocation(getX()+3, getY()+goUp);
            if(getY()<=335 & getY()>=120){ //120-335
                    setImage(new GreenfootImage("sharkup.png"));
                   //setImage(new GreenfootImage("sharkdown.png"));
                
            }
           //setImage(new GreenfootImage("sharkdown.png"));
           if (getY()>=groundLevel)
           {
                setLocation(getX(), groundLevel);
                isJump = false;
                setImage(new GreenfootImage("shark.png"));
           }
        }
        else
        {
            if (Greenfoot.isKeyDown("control") && !isJump)
            {
                goUp = -23;
                setLocation(getX()+3, getY()+goUp);
 
                
                //turn(45);
                isJump=true;
                //setImage(new GreenfootImage("sharkup.png"));
            }
        }
    }
}
