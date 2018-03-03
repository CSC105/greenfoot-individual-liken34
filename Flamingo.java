import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("Flamingo15.png");
    
    int cnt = 0;
    
    public Flamingo(){ //constructor
        //image.scale(80, 80);
        setImage(image);
    }
    
    public void act() 
    {
       if(Greenfoot.isKeyDown("right")){
           move(10);// Add your action code here.
           animateRight();
        }
        if(Greenfoot.isKeyDown("left")){
           move(-10);// Add your action code here.
           animateLeft();
        }
        
    }    
    
    public void animateRight(){
    
    
        String[] str = new String[36];
        int i = 1;
        while(i < str.length){
             str[i] = "Flamingo" + i + ".png";
             cnt++;
             if(cnt == 36){
                setImage(str[i]);
                cnt = 0;    
             }
             i++;
        }
    }
    
    public void animateLeft(){
    
    
        String[] str = new String[36];
        int i = 1;
        while(i < str.length){
             str[i] = "FlamingoL" + i + ".png";
             cnt++;
             if(cnt == 36){
                setImage(str[i]);
                cnt = 0;    
             }
             i++;
        }
    }
    
}
