import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Score extends ScoreBoard
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score(){
        setImage(new GreenfootImage(""+Game.score, 58, Color.WHITE, new Color(0,0,0,0))); 
    }
}
