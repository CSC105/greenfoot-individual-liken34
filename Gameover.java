import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    private static int score;
    
    RestartButton re = new RestartButton();
    
    protected static GreenfootSound myMusic = new GreenfootSound("4-26 - Game Over.mp3");
    boolean thisWorld = true;
    public boolean end = false;
    
    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //DecimalFormat df = new DecimalFormat("0.00"); 
        
        
        addObject(re, 315, 202);
        
        ScoreBoard s = new ScoreBoard();
        addObject(s, 447, 31);
        //showText("Score : " + , 298, 211);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(re)){
            Greenfoot.setWorld(new Playground());
            end = true;
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
}
