import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bomb extends Actor
{
    public void act() 
    {
        // Add your action code here.
        if(Start.level == 1){
            setLocation(getX(), getY()+2);
            setRotation(getRotation()+5);
        } else if (Start.level == 2){
            setLocation(getX(), getY()+3);
            setRotation(getRotation()+6);
        } else if (Start.level == 3){
            setLocation(getX(), getY()+4);
            setRotation(getRotation()+7);
        }
        sharkTouch();
    }    
    int randomBomb = Greenfoot.getRandomNumber(80)+370;
    public void sharkTouch(){
        if(isTouching(Shark.class)){
            Burst b1 = new Burst("bursttt.png");
            getWorld().addObject(b1, getX(), getY());
            Greenfoot.playSound("bomb_sound.mp3");
            Game.HP.subtract(Game.HP.value); 
            Game.HP.value = 0;
            Shark.stopMover = true;
            if(Game.isPlaying == true){
                getWorld().addObject(new ScoreBoard(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().addObject(new Score(), getWorld().getWidth()/2, 230);
                getWorld().addObject(new PlayTime(), 315, 287);
                getWorld().addObject(new EatStuff(), 300, 321);
                getWorld().addObject(new eatGarbage(),  340, 360);
                getWorld().addObject(new Buttons("replayBut.png","MyWorld"),430,340);
                getWorld().addObject(new Buttons("homeBut.png","StartWorld"),515,340);
                Game.isPlaying = false;
            }
             getWorld().removeObject(this);
        } else if(getY() >= randomBomb){
            Burst b1 = new Burst("burst.png");
            getWorld().addObject(b1, getX(), getY());
            Greenfoot.playSound("bomb_sound.mp3");
            getWorld().removeObject(this);
        }  
    }
    
    public int goUp;
    public int goLeft;
    public int groundLevel=340;
    boolean isJump = false;
    public void bounding()
    {
        setLocation(getX(), getY()+2);
        boolean onGround = (getY() == groundLevel);
        if (!onGround && isJump)
        {
           goUp++;
           goLeft++;
           setLocation(getX()-5, getY()+goUp);
           /*if (getY()>=groundLevel)
           {
                setLocation(getX(), groundLevel);
                isJump = false;
           }*/
           isJump = false;
        }
        else
        {
            if (isTouching(GroundSet.class))
            {
                goUp = -20;
                setLocation(getX()-50, getY()+goUp);
                isJump=true;
            }
        }
    }
}
