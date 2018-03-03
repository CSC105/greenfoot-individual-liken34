import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    GreenfootImage image = new GreenfootImage(100, 50);
    
    public void act() 
    {
        makeScoreBoard();
        
    }    
    
    public void makeScoreBoard(){
        //image.setFont(image.getFont().deriveFont(12f));
        String score = Playground.getScore();
        image.clear();
        image.setColor(Color.BLACK);
        getWorld().showText("Score : " + score, 447, 27);
        
        
        //image.drawString(score, 50, 25);
        setImage(image);
        
        
    }   
}
