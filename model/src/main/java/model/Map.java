package model;

import java.util.*;
import model.element.*;

/**
 * The Map
 */
public class Map extends Observable {

	private int width;
	private int height;
	boolean open = false;
	/**
	 * [x][y]
	 */
	java.util.Random rand = new Random();
	int time;
	/**
	 * second / 5
	 */
	private boolean lost = false;
	private boolean win = false;
	java.util.Timer timer;
	private Element[][] content;

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isOpen() {
		return this.open;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isLost() {
		return this.lost;
	}

	public boolean isWin() {
		return this.win;
	}

	public Element[][] getContent() {
		return this.content;
	}

	/**
	 * Default map to counter outOfBoundException
	 */
	public Map() {
		// TODO - implement Map.Map
		throw new UnsupportedOperationException();
	}

	/**
	 * Map constructor
	 * @param height_ height
	 * @param width_ width
	 */
	public Map(int height_, int width_) {
		// TODO - implement Map.Map
		throw new UnsupportedOperationException();
	}

	/**
	 * Return the elements on the map relative to a given position
	 * @param x x
	 * @param y y
	 * @return Entity Entity
	 */
	public Element getElement(int x, int y) {
		// TODO - implement Map.getElement
		throw new UnsupportedOperationException();
	}

	/**
	 * Set an entity on the map at a specific location
	 * @param x_ x
	 * @param y_ y
	 * @param element_ Element
	 */
	public void setEntityOnTheMap(int x_, int y_, Element element_) {
		// TODO - implement Map.setEntityOnTheMap
		throw new UnsupportedOperationException();
	}

	/**
	 * Set the door open
	 */
	public void setOpen() {
		// TODO - implement Map.setOpen
		throw new UnsupportedOperationException();
	}

	/**
	 * Set the door close
	 */
	public void setClose() {
		// TODO - implement Map.setClose
		throw new UnsupportedOperationException();
	}

	/**
	 * by calling this function, make a lot of action if the player is killed
	 */
	public void killPlayer() {
		// TODO - implement Map.killPlayer
		throw new UnsupportedOperationException();
	}

	/**
	 * Make an explosion of diamond at a specific location.
	 * @param x_ x
	 * @param y_ y
	 */
	public void explodeDiamond(int x_, int y_) {
		// TODO - implement Map.explodeDiamond
		throw new UnsupportedOperationException();
	}

	/**
	 * Call explodeDiamond(int y_, int x_) but with Point
	 * @param pnt Point(x,y)
	 */
	public void explodeDiamond(java.awt.Point pnt) {
		// TODO - implement Map.explodeDiamond
		throw new UnsupportedOperationException();
	}

}