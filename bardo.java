import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bardo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bardo extends Actor
{
    public int speed = 3;
    /**
     * Act - do whatever the bardo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movimento();
    }
    public void movimento(){
        
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);    
        }
        if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
        }
         if (Greenfoot.isKeyDown("r")){
        getWorld().addObject(new notas2(), getX(), getY() +30);
        }
        else{}
    }
}
