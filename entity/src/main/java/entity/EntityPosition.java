package entity;

import contract.*;

public class EntityPosition extends Entity {

	/**
	 * The key.
	 */
	private int x;
	/**
	 * The message.
	 */
	private int y;
	private IElement id_element;

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public IElement getId_element() {
		return this.id_element;
	}

	public void setId_element(IElement id_element) {
		this.id_element = id_element;
	}

	/**
	 * 
	 * @param id_element
	 * @param x
	 * @param y
	 */
	public EntityPosition(IElement id_element, int x, int y) {
		// TODO - implement EntityPosition.EntityPosition
		throw new UnsupportedOperationException();
	}

}