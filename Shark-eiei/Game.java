import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*; // import java swing for using user input
public class Game extends World
{
    public static GreenfootSound sound; // create variable that contain sound
    public static int timeCounter; // timeCounter that control of duration of day like a morning,evening,night
    public static int score; // create variable that keep score
    public static int eatStuff; // create variable that keep score of eating good thing
    public static int eatGarbage; // create variable that keep score of eating bad thing
    public static boolean isPlaying; // boolean that check we are play or not
    static int i = 0; // variable that we use for control theme_sound
    
    public static Health HP = new Health("Shark", "HP", 0, 2000); // create object Health that us Shark's health bar contain name,type of hp,minimum hp,maximum hp
    
    public Game() // default constructor
    {    
        super(670, 500, 1); // Create a new world with 670x500 cells with a cell size of 1x1 pixels.
        sound = new GreenfootSound("theme_sound.mp3"); // add theme sound
        if(i!=0){
            sound.stop();
        }else{
            sound.play();
        }
        i++;
        addObject(HP,105,20); // add HP bar to the game
        addObject(new PlayerName(),105,80); // add user input to the game
        HP.value = 2000; //initial value of HP = 2000
        Shark.stopMover = false; //Shark can move
        isPlaying = true; //We are playing the game
        timeCounter=3000; // Start with morning -> evening -> night
        eatStuff=0; // initial value of eating good thing = 0
        eatGarbage=0; // initial value of eating bad thing = 0
        score=0; // initial value of score = 0
        addOb(); // call method to create object in world
        setPaintOrder(Buttons.class, ScoreBoard.class, LightWater.class, Bomb.class, FloatObjects.class, Burst.class, Shark.class, 
                      DarkWater.class, Ground.class, Trees.class, Building.class, PlayerName.class, Scorepoint.class, Health.class, 
                      Timer.class, Clouds.class); // กูไม่รู้ มึงมาเเก้ด้วย
    }
    
    public void addOb(){
        addObject(new Clouds(), 90, 100);
        addObject(new Clouds(), 350, 80);
        addObject(new Clouds(), 630, 20);
        addObject(new Building("houses.png"), getWidth()/2, 200);
        addObject(new TreeSet(), 335, 315);
        addObject(new Scorepoint(),105,40);
        addObject(new Timer(),105,60);
        for(int i=0; i<15; i++){
            addObject(new Leaves(), Greenfoot.getRandomNumber(670), Greenfoot.getRandomNumber(200));
        }
        int xTree=0;
        for(int i=0; i<4; i++){ 
            addObject(new Trees(), xTree, 280);
            xTree+=210;
        }
        addObject(new GroundSet(), 335, 342);
        int xGround=0;
        for(int i=0; i<8; i++){
            addObject(new Ground(), xGround, 320);
            xGround+=90;
        }
        int xDarkWater=0;
        for(int i=0; i<16; i++){
            addObject(new DarkWater(), xDarkWater, 380);
            xDarkWater+=43;
        }
        addObject(new Shark(), 100, 450);
        int xLightWater=0;
        for(int i=0; i<16; i++){
            addObject(new LightWater(), xLightWater, 445);
            xLightWater+=44;
        }
        addObject(new Buttons("home3.png","StartWorld"),640,30);
        addObject(new Buttons("play.png","MyWorld"),590,30);
    }
    int timeBomb; 
    int timeFloat;
    int timeFly;
    public void act(){
        movingObject();
        if(HP.value>0/* && Timer.playtime>0*/){
        HP.subtract(1);  
       }else{
           HP.value = 0;
           Shark.stopMover = true;
       }
       if(Start.level == 1){
            timeFly++;
            int randomBird = Greenfoot.getRandomNumber(120)+100;
            int randomObject = Greenfoot.getRandomNumber(80)+370;
            if(timeFly % 200 == 0){
                addObject(new Bird(), 670, randomBird);
                timeFly=0;
            }
            timeFloat++;
            if(timeFloat % 150 == 0){
                int randomOb = Greenfoot.getRandomNumber(4);
                int timeplus = Greenfoot.getRandomNumber(6);
                if(timeplus == 0) addObject(new Puffers(), 520, randomObject);
                if(timeplus == 5) addObject(new Goldfish(), 500, randomObject);
                if(randomOb == 0) addObject(new Boats(), 670, 330);
                if(randomOb == 1) addObject(new Swim(), 670, 365);
                if(randomOb == 2) addObject(new Garbage(), 670, randomObject);
                if(randomOb == 3) addObject(new Cans(), 670, randomObject);
                timeFloat = 0;
            }
            timeBomb++;
            if(timeBomb % 300 == 0){
                int position = Greenfoot.getRandomNumber(570)+50;
                addObject(new Sign(), position, 40);
                if(timeBomb == 1000){
                    timeBomb=0;
                }
            }
        }
        else if(Start.level == 2){
            timeFly++;
            int randomBird = Greenfoot.getRandomNumber(120)+100;
            int randomObject = Greenfoot.getRandomNumber(80)+370;
            if(timeFly % 200 == 0){
                addObject(new Bird(), 670, randomBird);
                timeFly=0;
            }
            timeFloat++;
            if(timeFloat % 150 == 0){
                int randomOb = Greenfoot.getRandomNumber(4);
                int timeplus = Greenfoot.getRandomNumber(8);
                if(timeplus == 0) addObject(new Puffers(), 520, randomObject);
                if(timeplus == 5) addObject(new Goldfish(), 500, randomObject);
                if(randomOb == 0) addObject(new Boats(), 670, 330);
                if(randomOb == 1) addObject(new Swim(), 670, 365);
                if(randomOb == 2) addObject(new Garbage(), 670, randomObject);
                if(randomOb == 3) addObject(new Cans(), 670, randomObject);
                timeFloat = 0;
            }
            timeBomb++;
            if(timeBomb % 200 == 0){
                int position = Greenfoot.getRandomNumber(570)+50;
                addObject(new Sign(), position, 40);
                if(timeBomb == 1000){
                    timeBomb=0;
                }
            }
        }
        else if(Start.level == 3){
            timeFly++;
            int randomBird = Greenfoot.getRandomNumber(120)+100;
            int randomObject = Greenfoot.getRandomNumber(80)+370;
            if(timeFly % 200 == 0){
                addObject(new Bird(), 670, randomBird);
                timeFly=0;
            }
            timeFloat++;
            if(timeFloat % 150 == 0){
                int randomOb = Greenfoot.getRandomNumber(4);
                int timeplus = Greenfoot.getRandomNumber(10);
                if(timeplus == 0) addObject(new Puffers(), 520, randomObject);
                if(timeplus == 5) addObject(new Goldfish(), 500, randomObject);
                if(randomOb == 0) addObject(new Boats(), 670, 330);
                if(randomOb == 1) addObject(new Swim(), 670, 365);
                if(randomOb == 2) addObject(new Garbage(), 670, randomObject);
                if(randomOb == 3) addObject(new Cans(), 670, randomObject);
                timeFloat = 0;
            }
        
            timeBomb++;
            if(timeBomb % 100==0){
                int position = Greenfoot.getRandomNumber(570)+50;
                addObject(new Sign(), position, 40);
                if(timeBomb == 1000){
                    timeBomb=0;
                }
            }
        }
       if(isPlaying){
           Timer.playtime++;
           score = Timer.playtime/5;
       }
       timeCounter--; // keep subtract this duration of the day
       if(timeCounter == 0){ // if equal to 0 start morning
            timeCounter = 3000;
        }
       if(timeCounter==3000 ){ // Start with morning
            setBackground("bg.png"); 
        } else if (timeCounter==2000){ // then evening
            setBackground("bg2.png");
        }else if(timeCounter==1000){ // then night
            setBackground("bg3.png");
        }
       if(HP.value==0 && isPlaying == true){
             Shark.stopMover = true;
             isPlaying = false;
             addObject(new ScoreBoard(), getWidth()/2, getHeight()/2);
             addObject(new Score(), getWidth()/2, 230);
             addObject(new PlayTime(), 315, 287);
             addObject(new EatStuff(), 300, 321);
             addObject(new eatGarbage(), 340, 360);
             addObject(new Buttons("replayBut.png","MyWorld"),430,340);
             addObject(new Buttons("homeBut.png","StartWorld"),515,340);
        }
        }
    int timeGround=-70;
    int timeDarkWater=-21;
    int timeLightWater=4;
    int timeTree;
    int timeBuilding;
    int timePlane;
    int timeCloud;
    public void movingObject(){
        timeGround++;
        if(timeGround % 85 == 0){
            addObject(new Ground(), 670, 320);
            timeGround=0;
        }
        timeDarkWater++;
        if(timeDarkWater % 14 == 0){
            addObject(new DarkWater(), 670, 380);
        }
        timeLightWater++;
        if(timeLightWater % 22 == 0){
            addObject(new LightWater(), 670, 445);
            timeLightWater=0;
        }
        timeCloud++;
        if(timeCloud % 250 == 0){
            addObject(new Clouds(), 670, Greenfoot.getRandomNumber(90)+10);
            timeCloud=0;
        }
        timeTree++;
        if(timeTree % 150 == 0){
            addObject(new Trees(), 670, 280);
            timeTree=0;
         }
    }
}
