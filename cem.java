import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cem extends World
{
    GifImage myCen = new GifImage("cenario.gif");
    /**
     * Constructor for objects of class cenario.
     * 
     */
    public void act()
    {    
        setBackground(myCen.getCurrentImage());
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

    }

    /**
     * Constructor for objects of class cem.
     * 
     */
    public cem()
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
        bardo bardo = new bardo();
        addObject(bardo,92,270);
        bode bode = new bode();
        addObject(bode,453,256);
        Counter counter = new Counter();
        addObject(counter,508,91);
        Counter2 counter2 = new Counter2();
        addObject(counter2,86,96);
        counter2.setLocation(99,44);
        counter.setLocation(499,35);
    }
}
