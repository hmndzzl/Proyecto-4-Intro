import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class EsqueletoElite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EsqueletoElite extends Actor
{
    MyWorld world;
    public int vida = 10;
    
    public EsqueletoElite(){
        getImage().scale(60, 60);
    }
    public void act()
    {
       moverEnCamino();
       hitByProyectile();
    }
    public void moverEnCamino()
    {
       move(2);
        List <Road> road90 = getObjectsAtOffset(-30, 0, Road.class);
        for(Road roads: road90)
        {
            if(roads.recto == false && getRotation() == 0)
            {
                setRotation(roads.giro);
            }
        }
        List <Road> road0 = getObjectsAtOffset(0, -30, Road.class);
        for(Road roads: road0)
        {
            if(roads.recto == false && getRotation() == 90)
            {
                setRotation(roads.giro);
            }
        }
        List <Road> road180 = getObjectsAtOffset(0, 30, Road.class);
        for(Road roads: road180)
        {
            if(roads.recto == false && getRotation() == 270)
            {
                setRotation(roads.giro);
            }
        }
        List <Road> road270 = getObjectsAtOffset(30, 0, Road.class);
        for(Road roads: road270)
        {
            if(roads.recto == false && getRotation() == 180)
            {
                setRotation(roads.giro);
            }
        }  
    }
    public void hitByProyectile()
    {
        Actor proyectil = getOneIntersectingObject(Proyectil.class);
        if(proyectil != null)
        {
            vida --;
            getWorld().removeObject(proyectil); 
        }
        if(vida < 1)
        {
            world.dinero += 10;
            getWorld().removeObject(this);
        }
        else if(isAtEdge())
        {
            world.vidaJugador -= 10;
            getWorld().removeObject(this);
        }
    }
}
