import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 
/**
 * Write a description of class Torre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torre extends Actor
{
    /**
     * Act - do whatever the Torre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int fireRate = 0;
    public Torre(){
        getImage().scale(60,60);
    }
    public void act()
    {
        detectarEnemigo();
    }
    public void detectarEnemigo()
    {
        fireRate++;
        List<EsqueletoBase> enemigos = getObjectsInRange(100, EsqueletoBase.class);
        for(EsqueletoBase enemigo : enemigos)
        {
            if(fireRate > 9)
            {
                Proyectil proyectil = new Proyectil();
                getWorld().addObject(proyectil, getX(), getY());
                proyectil.turnTowards(enemigo.getX(), enemigo.getY());
                fireRate = 0;
            }
        }
        List<EsqueletoAvanzado> enemigos2 = getObjectsInRange(100, EsqueletoAvanzado.class);
        for(EsqueletoAvanzado enemigo : enemigos2)
        {
            if(fireRate > 9)
            {
                Proyectil proyectil = new Proyectil();
                getWorld().addObject(proyectil, getX(), getY());
                proyectil.turnTowards(enemigo.getX(), enemigo.getY());
                fireRate = 0;
            }
        }
        List<EsqueletoElite> enemigos3 = getObjectsInRange(100, EsqueletoElite.class);
        for(EsqueletoElite enemigo : enemigos3)
        {
            if(fireRate > 9)
            {
                Proyectil proyectil = new Proyectil();
                getWorld().addObject(proyectil, getX(), getY());
                proyectil.turnTowards(enemigo.getX(), enemigo.getY());
                fireRate = 0;
            }
        }
    }
}
