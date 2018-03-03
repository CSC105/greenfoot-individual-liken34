import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GradeF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GradeF extends Grade
{
    /**
     * Act - do whatever the GradeF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GradeF(){
        super();
    }
    public void act() 
    {
        move(5);
        score(0);
        autoRemove();
    }    
}
