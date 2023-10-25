import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class notas2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class notas2 extends bardo
{
    /**
     * Act - do whatever the notas2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     GifImage myGif = new GifImage("notas2.gif");
    public void act()
    {
        setImage(myGif.getCurrentImage());
        // Add your action code here.
        moveAtaque();
        acertarAlvo();
    }
     private GreenfootSound bgMusic =new GreenfootSound("banjo.mp3");
     public void started()
    {
        bgMusic.playLoop();
    }
    public void stopped()
    {
        bgMusic.pause();
    }
     public void moveAtaque(){
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo() {
        Actor b = getOneIntersectingObject(bode.class);
        
        if (b != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(b);/////////
            getWorld().removeObject(this);
        }
}
}
