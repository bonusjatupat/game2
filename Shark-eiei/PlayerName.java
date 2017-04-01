import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerName extends Actor
{
    static String playername;
    private static final Color transparent = new Color(0,0,0,0);
    boolean check1;
    int check;
    String inputValue;
    public PlayerName(){
        //String inputValue = JOptionPane.showInputDialog("Please input your name..(1-8 characters)");
        //check = inputValue.length();
        check1 = false;
        while(check1!=true){
<<<<<<< HEAD
            if(check==0 || check>8){
                inputValue = JOptionPane.showInputDialog("Please input your name..(1-8 characters)");
                check = inputValue.length();
            }
            else {
                check1 = true;
            }
        }
        playername = inputValue;
    }
    
=======
        if(check==0 || check>8){
          inputValue = JOptionPane.showInputDialog("Please input your name..(1-8 characters)");
          check = inputValue.length();
          if(check==0){
              inputValue = "Untitled";
              check = inputValue.length();
            }
          
    }
     else{
            check1 = true;
        }
        playername = inputValue;
    }
}
>>>>>>> origin/master
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
        setImage(new GreenfootImage("Player name :  "+playername, 18, Color.BLACK, transparent));
    }     
}
