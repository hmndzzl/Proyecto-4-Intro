import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Actor
{
    /**
     * Act - do whatever the Road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int giro;
    public boolean recto;
    public Road (boolean recto) {
        getImage().scale(60,60);
        this.recto = recto;
    }
    public Road (int girar) {
        getImage().scale(60,60);
        this.giro = girar; 
    }
    public void act()
    {
        
    }
}
