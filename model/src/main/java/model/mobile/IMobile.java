package model.mobile;

import fr.exia.showboard.*;

public interface IMobile extends IPawn {

	/**
	 * Gets the x.
	 * 
	 * @return the x
	 */
	int getX();

	/**
	 * Gets the y.
	 * 
	 * @return the y
	 */
	int getY();

	Point getPosition();

	/**
	 * Move up.
	 */
	void moveUp();

	/**
	 * Move left.
	 */
	void moveLeft();

	/**
	 * Move down.
	 */
	void moveDown();

	/**
	 * Move right.
	 */
	void moveRight();

	/**
	 * Do nothing.
	 */
	void doNothing();

	/**
	 * Checks if is alive.
	 * @return the alive
	 */
	Boolean isAlive();

	/**
	 * Checks if the human has been killed.
	 * @return the boolean
	 */
	Boolean hasBeenKilled();

}