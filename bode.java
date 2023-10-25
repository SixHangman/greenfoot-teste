import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bode extends Actor
{
     GifImage myGif = new GifImage("bode.gif");
    /**
     * Act - do whatever the bode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        // Add your action code here.
    }
}
