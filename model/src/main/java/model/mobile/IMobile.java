package model.mobile;

import fr.exia.showboard.IPawn;
import java.awt.*;

public interface IMobile extends IPawn {

      //Move up.
    void moveUp();
     //Move left.
    void moveLeft();
     //Move down.
    void moveDown();
     //Move right.
    void moveRight();
     //Do nothing.
    void doNothing();

    /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    int getX();

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    int getY();

    /**
     * Checks if is alive.
     *
     * @return the alive
     */
    Boolean isAlive();

    /**
     * Checks if the human has been killed.
     *
     * @return the boolean
     */
    Boolean hasBeenKilled();

    @Override
    Point getPosition();
}