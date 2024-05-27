import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dinero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class DineroDisplay extends Actor
{
    /**
     * Act - do whatever the Dinero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld game;
    public DineroDisplay()
    {
        setImage(new GreenfootImage("Dinero: " + game.dinero, 40, Color.BLACK, new Color(0,0,0,0)));
    }
    
    public void act()
    {
        setImage(new GreenfootImage("Dinero: " + game.dinero, 40, Color.BLACK, new Color(0,0,0,0)));
    }
}
