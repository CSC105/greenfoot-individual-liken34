import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GradeD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GradeD extends Grade
{
    /**
     * Act - do whatever the GradeD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GradeD(){
        super();
    }
    public void act() 
    {
        move(5);
        score(1);
        autoRemove();
    }    
}
