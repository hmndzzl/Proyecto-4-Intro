import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int map[][]={{0,0,0,0,0,0,1,1,1,1},
                 {1,1,1,0,0,0,1,0,0,1},
                 {0,0,1,0,0,0,1,1,0,1},
                 {0,0,1,0,0,0,0,1,0,1},
                 {0,0,1,0,0,0,0,1,0,1},
                 {0,0,1,0,0,0,0,1,0,1},
                 {0,0,1,0,0,0,1,1,0,1},
                 {0,0,1,1,1,0,1,0,0,1},
                 {0,0,0,0,1,1,1,0,0,1},
                 {0,0,0,0,0,0,0,0,0,1},
                };
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
        Menu menu = new Menu();
        addObject(menu,720,300);
        Level();
    
    }
    
    public void act()
    {
        addInTorres();
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
                   addObject(new Road(), 30 + i * 60,30+j* 60);
                }
            }

    }
    public void addInTorres()
    {
    if(Greenfoot.mouseClicked(null))
        {
        addObject(new Torre(), (Greenfoot.getMouseInfo().getX() / 60) * 60 + 30, (Greenfoot.getMouseInfo().getY()/60) * 60 + 30);
        }

    }   }
