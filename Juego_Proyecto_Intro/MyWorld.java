import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    //Dinero
    public static int dinero = 125;
    public static int vidaJugador = 50;
    int precioTorreBase = 100;
    int tiempo;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int map[][]={{0,0,0,0,0,0,3,1,1,2},
            {1,1,2,0,0,0,1,0,0,1},
            {0,0,1,0,0,0,4,5,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {0,0,1,0,0,0,3,4,0,1},
            {0,0,3,1,2,0,1,0,0,1},
            {0,0,0,0,3,1,4,0,0,1},
            {0,0,0,0,0,0,0,0,0,1},
        };

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
        Menu menu = new Menu();
        addObject(menu,720,300);
        addObject(new DineroDisplay(), 710, 70);
        addObject(new VidaDisplay(), 690, 30);
        Level();
        prepare();
    }

    public void act()
    {
        addInTorres();
        generarEnemigos();
        tiempo++;
        terminarJuego();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void Level()
    {
        for (int i=0; i < 10; i++)
            for (int j=0; j < 10; j++)
            {
                if (map[j][i]==1)
                {
                    addObject(new Road(true), 30 + i * 60,30+j* 60);
                }
                if (map[j][i]==2)
                {
                    addObject(new Road(90), 30 + i * 60,30+j* 60);
                }
                if (map[j][i]==3)
                {
                    addObject(new Road(0), 30 + i * 60,30+j* 60);
                }
                if (map[j][i]==4)
                {
                    addObject(new Road(270), 30 + i * 60,30+j* 60);
                }
                if (map[j][i]==5)
                {
                    addObject(new Road(180), 30 + i * 60,30+j* 60);
                }
            }

    }
    public void addInTorres()
    {
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && dinero >= precioTorreBase)
        {
            addObject(new Torre(), (Greenfoot.getMouseInfo().getX() / 60) * 60 + 30, (Greenfoot.getMouseInfo().getY()/60) * 60 + 30);
            dinero -= precioTorreBase;
        }

    } 

    public void generarEnemigos() {

        if(tiempo % 20 == 0 && tiempo > 20)
        {
            addObject(new EsqueletoBase(), 1, 90);
        }
        if(tiempo % 100 == 0 && tiempo > 1250)
        {
            addObject(new EsqueletoAvanzado(), 1, 90);
        }
        if(tiempo %  200 == 0 & tiempo > 2500)
        {
            addObject(new EsqueletoElite(), 1, 90);
        }
    }

    public void terminarJuego()
    {
        if(vidaJugador < 1)
        {
            showText("Game Over", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dinero = 125;
        vidaJugador = 50;
        tiempo = 0;
    }
}

