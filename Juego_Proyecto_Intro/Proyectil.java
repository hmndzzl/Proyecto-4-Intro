import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectil extends Actor
{
    /**
     * Act - do whatever the Proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        eliminarProyectil();
    }
    public void eliminarProyectil()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
