import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static GreenfootSound sound;
    public static int timeCounter;
    public static int score;
    public static int eatBoat;
    public static int eatPeople;
    public static int eatGarbage;
    static int i = 0;
    
    public static Health HP = new Health("Shark", "HP", 0, 1500);
    
    public Game()
    {    
        super(670, 500, 1);
        sound = new GreenfootSound("theme_sound.mp3");
        if(i!=0){
            sound.stop();
        }else{
            sound.play();
        }
        i++;
        addObject(HP,250,50);
        HP.add(1500);
        timeCounter=120000;
        eatBoat=0;
        eatPeople=0;
        eatGarbage=0;
        score=0;
        addOb();
        setPaintOrder(Buttons.class, ScoreBoard.class, LightWater.class, Bomb.class, FloatObjects.class, Burst.class, Shark.class, 
                      DarkWater.class, Ground.class, Trees.class, Building.class, Clouds.class);
    }
    
    public void addOb(){
        addObject(new Clouds(), 90, 100);
        addObject(new Clouds(), 350, 80);
        addObject(new Clouds(), 630, 20);
        addObject(new Building("houses.png"), getWidth()/2, 200);
        addObject(new TreeSet(), 335, 315);
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
    int time;
    public void act(){
        movingObject();
        HP.subtract(1);
        if(HP.value==0){
            Greenfoot.stop();
        }
        if(Start.level == 1){
            time++;
            if(time % 270 == 0){
                int randomOb = Greenfoot.getRandomNumber(4);
                int timeplus = Greenfoot.getRandomNumber(6);
                if(timeplus == 5) addObject(new Goldfish(), 500, 400);
                if(randomOb == 0) addObject(new Boats(), 670, 330);
                if(randomOb == 1) addObject(new Swim(), 670, 365);
                if(randomOb == 2) addObject(new Garbage(), 670, 375);
                if(randomOb == 3) addObject(new Cans(), 670, 470);
                time = 0;
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
            time++;
            if(time % 250 == 0){
                int randomOb = Greenfoot.getRandomNumber(4);
                int timeplus = Greenfoot.getRandomNumber(8);
                if(timeplus == 5) addObject(new Goldfish(), 500, 400);
                if(randomOb == 0) addObject(new Boats(), 670, 330);
                if(randomOb == 1) addObject(new Swim(), 670, 365);
                if(randomOb == 2) addObject(new Garbage(), 670, 375);
                if(randomOb == 3) addObject(new Cans(), 670, 470);
                time = 0;
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
            time++;
            if(time % 170 == 0){
                int randomOb = Greenfoot.getRandomNumber(4);
                int timeplus = Greenfoot.getRandomNumber(10);
                if(timeplus == 5) addObject(new Goldfish(), 500, 400);
                if(randomOb == 0) addObject(new Boats(), 670, 330);
                if(randomOb == 1) addObject(new Swim(), 670, 365);
                if(randomOb == 2) addObject(new Garbage(), 670, 375);
                if(randomOb == 3) addObject(new Cans(), 670, 470);
                time = 0;
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
        
        for(int i = 30 ; i > 0; i--){
            if(timeCounter > 0){
                showText("time : " + (int)(timeCounter/2000),100,50);
                timeCounter--;
            } else if(timeCounter == 0){
                showText("time : 0",100,50);
            }
        }
            
        if(timeCounter==0){
             addObject(new ScoreBoard(), getWidth()/2, getHeight()/2);
             addObject(new Score(), getWidth()/2, 230);
             addObject(new eatPeople(), 318, 287);
             addObject(new eatBoat(), 285, 321);
             addObject(new eatGarbage(), 340, 360);
             addObject(new Buttons("replayBut.png","MyWorld"),430,340);
             addObject(new Buttons("homeBut.png","StartWorld"),515,340);
        }         
        
         if(timeCounter<=80000 && timeCounter > 30000){
            setBackground("bg2.png");
        } else if (timeCounter <= 30000){
            setBackground("bg3.png");
        }
        
        showText("score = "+score,getWidth()/2,50);
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
        //timeBuilding++;
        //if(timeBuilding % 300 == 0){
        //    addObject(new Building(), 670, 205);
        //    timeBuilding=0;
        //}
    }
}
