import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GradeB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GradeB extends Grade
{
    /**
     * Act - do whatever the GradeB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GradeB(){
        super();
    }
    
    public void act() 
    {
        move(5);
        score(3);
        autoRemove();
    }    
}
