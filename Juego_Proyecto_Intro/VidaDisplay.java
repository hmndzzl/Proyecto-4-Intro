import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VidaDiplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidaDisplay extends Actor
{
    MyWorld game;
    public VidaDisplay()
    {
        setImage(new GreenfootImage("Vida: " + game.vidaJugador, 40, Color.BLACK, new Color(0,0,0,0)));
    }
    
    public void act()
    {
        setImage(new GreenfootImage("Vida: " + game.vidaJugador, 40, Color.BLACK, new Color(0,0,0,0)));
    }
}
