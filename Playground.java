import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;

/**
 * Write a description of class Playground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playground extends World
{

    /**
     * Constructor for objects of class Playground.
     * 
     */
    
    int clock = 3600; // 60 milsec = 1 sec
    int timer = 50;
    DecimalFormat df = new DecimalFormat("0.00");
    private static int score;
    
    /*
     * Add sound into the world
     */
    protected static GreenfootSound myMusic = new GreenfootSound("213 theme of al de baran.mp3");
    boolean thisWorld = true;
    public boolean end = false;
    
    public Playground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(630, 600, 1); 
        MyWorld.score = 0;
        Flamingo flamingo = new Flamingo();
        addObject(flamingo, 314, 520);
        
        score = 0;
        
        ScoreBoard s = new ScoreBoard();
        addObject(s, 447, 27);
        //showText("Score : " + score, 581, 27);
    }
    
    public void act(){
        
        //getWorld().showText("Time left: " + timer/55 + "seconds");
        //showText(MyWorld.score+"", 550, 50);
        //showText(df.format(Scoreboard.score)+"", 550, 50);
        showText("time : "+((int)(clock/60)) + "", 581, 27);
        if(clock == 0) {
            
            Greenfoot.setWorld(new Gameover());
            end = true;
            this.stopped();
            clock = 0;
        }
        clock--;
        
        if(timer > 0){
            timer--;
        }
        if(timer == 0){
            int rand = Greenfoot.getRandomNumber(5);
            if(rand == 0){
                addObject(new GradeA(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            if(rand == 1){
                addObject(new GradeB(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            if(rand == 2){
                addObject(new GradeC(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            if(rand == 3){
                addObject(new GradeD(),Greenfoot.getRandomNumber(getWidth()),0);
            }
            if(rand == 4){
                addObject(new GradeF(),Greenfoot.getRandomNumber(getWidth()),0);
            }

            timer = 50;
        }
        
        
        if(thisWorld)
        {
            myMusic.playLoop();
            thisWorld = false;
        }

        if(end == true){
            stopped();
        }else {
            myMusic.playLoop();
        }
        
    }
    
    public void stopped(){
        myMusic.stop();
    }
    
    public static void updateScore(int s){
        score += s;
    }

    public static String getScore(){
        return score + "";
    }
    
    public boolean isTimeUp(){
        return clock <= 0;
    }
}

