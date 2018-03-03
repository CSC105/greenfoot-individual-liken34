import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How2play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How2play extends World

{

    
    BackButton b = new BackButton();
    
    /**
     * Constructor for objects of class How2play.
     * 
     */
    public How2play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(b,546,36);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(b)){
            Greenfoot.setWorld(new MyWorld());
        }

    }
}
