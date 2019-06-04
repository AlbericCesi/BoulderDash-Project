package model;

import java.util.*;
import model.mobile.*;
import model.element.*;

public class Level extends Observable {

	/**
	 * The id.
	 */
	private int id;
	/**
	 * The level.
	 */
	private int level;
	/**
	 * The level data.
	 */
	private String levelFromDB;
	private IMobile butterfly;
	/**
	 * The map which will stock every character with their X Y
	 * coordinates.
	 */
	private Element[][] onTheLevel;

	public int getId() {
		return this.id;
	}

	public String getLevelFromDB() {
		return this.levelFromDB;
	}

	public IMobile getButterfly() {
		return this.butterfly;
	}

	/**
	 * 
	 * @param id
	 * @param levelFromDB
	 */
	public Level(int id, String levelFromDB) {
		// TODO - implement Level.Level
		throw new UnsupportedOperationException();
	}

	/**
	 * Instantiates a new level.
	 */
	public Level() {
		// TODO - implement Level.Level
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	private void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @param levelFromDB
	 */
	private String setLevelFromDB(String levelFromDB) {
		// TODO - implement Level.setLevelFromDB
		throw new UnsupportedOperationException();
	}

	/**
	 * Read the String map, then create the grill.
	 * @param levelFromDB The String map to read.
	 */
	public void loadLevelFromDB(String levelFromDB) {
		// TODO - implement Level.loadLevelFromDB
		throw new UnsupportedOperationException();
	}

	/**
	 * Notify the view if the level has changed / Mobile
	 */
	public void setMobileHasChanged() {
		// TODO - implement Level.setMobileHasChanged
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param butterfly
	 */
	private void setButterfly(IMobile butterfly) {
		this.butterfly = butterfly;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Element getOnTheLevelXY(int x, int y) {
		// TODO - implement Level.getOnTheLevelXY
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the coordinate on the map.
	 * @param element The object to place.
	 * @param x The new X of the object.
	 * @param y The new Y of the object.
	 */
	public void setOnTheLevelXY(Element element, int x, int y) {
		// TODO - implement Level.setOnTheLevelXY
		throw new UnsupportedOperationException();
	}

	public java.util.Observable getObservable() {
		// TODO - implement Level.getObservable
		throw new UnsupportedOperationException();
	}

}