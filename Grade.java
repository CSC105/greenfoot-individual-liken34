import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grade extends Actor
{
    /**
     * Act - do whatever the Grade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Grade(){
        setRotation(90);
    }
    public void act() 
    {
        move(5);
        //score(10);
    }    
    
    public void score(int score){
        if(isTouching(Flamingo.class)){
            MyWorld.score = (MyWorld.score);
            Playground.updateScore(score);
            Greenfoot.playSound("ding.mp3");
            //String count = Playground.getScore();
            getWorld().removeObject(this);
        }
    }
    
    public void autoRemove(){
        if(getWorld() != null && isAtEdge()){
            getWorld().removeObject(this);
            return;
        }
    }
}
