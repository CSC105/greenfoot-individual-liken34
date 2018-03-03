import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GradeA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GradeA extends Grade
{
    /**
     * Act - do whatever the GradeA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GradeA(){
        super();
    }
    
    public void act() 
    {
        move(5);
        score(4);
        autoRemove();
    }    
}
