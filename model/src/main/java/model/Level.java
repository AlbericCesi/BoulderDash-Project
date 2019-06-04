package model;

import model.element.Element;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 * The Level
 */
public class Level extends Observable {
    private int width;
    private int height;
    private Element[][] content;
    int time;// second / 5
    private boolean lost = false;
    private boolean win = false;

    TimerTask task = new TimerTask() {
        public void run() {
            updateLevel();
        }
    };
    Timer timer;

    /**
     * Default map to counter outOfBoundException
     */
    public Level()
    {
        timer = new Timer();
        width = 1;
        height = 1;
        time = 150 *5;
        content = new Element[width][height];
    }

    /**
     * Level constructor
     *
     * @param height_
     * 		height
     * @param width_
     * 		width
     */
    public Level(int height_, int width_)
    {
        timer = new Timer();
        timer.schedule(task,200, 200);
        width = width_;
        height = height_;
        time = 150 *5;
        content = new Element[height][width];
    }

    /**
     * Return map's width
     *
     * @return width
     * 		width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Return map's height
     *
     * @return height
     * 		height
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * Return the level's content
     * Should never be use
     *
     * @return content
     * 		Element[][]
     */
    public Element[][] getContent() {
        return content;
    }

    /**
     * set the level's width
     *
     * @param width
     * 		future width of the map
     */
    public void setWidth(int width){
        if (width >= 0)
        {
            width = getWidth();
        }
        else
        {
            System.out.println("error : width < 0");
        }
    }

    /**
     * set the level's height
     *
     * @param height
     * 		future height of the map
     */
    public void setHeight(int height){
        if (height >= 0)
        {
            height = getHeight();
        }
        else
        {
            System.out.println("error : height < 0");
        }
    }

    /**
     * Return the Element on the map relative to a given position
     *
     * @param x
     * 		x
     * @param y
     * 		y
     * @return Element
     * 		Element
     */
    public Element getElement(int x, int y) {
        if( (x <= height) && (y <= width) )
        {
            return this.content[x][y];
        }
        else
        {
            return null;
        }
    }

    /**
     * Set an element on the map at a specific location
     *
     * @param x_
     * 		x
     * @param y_
     * 		y
     * @param element_
     * 		Element
     */
    public void setElementOnTheLevel(int x_, int y_, Element element_) {
        content[x_][y_] = element_;
    }

    /**
     * Update the level (called every 200 mill by task)
     */
    public void updateLevel() {
        for(int y=height-1; y >= 0; y--)
        {
            for(int x=width-1; x >= 0; x--)
            {
                getElement(y, x);
            }
        }

        if(time < 0)
        {
            System.out.println("Time out !");
        }
        else
        {
            time--;
        }

        setChanged();
        notifyObservers();

    }

    /**
     * Get remaining time in second
     *
     * @return time
     * 		time in second
     *
     */
    public int getTime() {
        return time/5;
    }

    /**
     * Set remaining time in second
     *
     * @param sec_
     * 		time in second
     *
     */
    public void setTime(int sec_) {
        time = sec_ *5;
    }

    /**
     * Return true if the game is loose
     *
     * @return loose
     * 		return true if game is loose
     */
    public boolean isLost() {
        return lost;
    }

    /**
     * Return true if the game is win
     *
     * @return win
     * 		return true if game is win
     */
    public boolean isWin() {
        return win;
    }
}