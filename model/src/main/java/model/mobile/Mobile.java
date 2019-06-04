package model.mobile;

import model.element.*;

abstract class Mobile extends Element implements IMobile {

	/**
	 * The position.
	 */
	private Point position;
	/**
	 * The alive.
	 */
	private Boolean alive = true;
	/**
	 * The board.
	 */
	private fr.exia.showboard.IBoard board;
	/**
	 * The road.
	 */
	private IDirt dirt;

	public Point getPosition() {
		return this.position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public IDirt getDirt() {
		return this.dirt;
	}

	/**
	 * Instantiates a new mobile.
	 * @param sprite the sprite
	 * @param permeability the permeability
	 */
	Mobile(final Sprite sprite, final Permeability permeability) {
		// TODO - implement Mobile.Mobile
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveUp() {
		// TODO - implement Mobile.moveUp
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveLeft() {
		// TODO - implement Mobile.moveLeft
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveDown() {
		// TODO - implement Mobile.moveDown
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveRight() {
		// TODO - implement Mobile.moveRight
		throw new UnsupportedOperationException();
	}

	@Override
	public void doNothing() {
		// TODO - implement Mobile.doNothing
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the dirt has moved.
	 */
	private void setHasMoved() {
		// TODO - implement Mobile.setHasMoved
		throw new UnsupportedOperationException();
	}

	@Override
	public final int getX() {
		// TODO - implement Mobile.getX
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the x.
	 * @param x the new x
	 */
	public final void setX(final int x) {
		// TODO - implement Mobile.setX
		throw new UnsupportedOperationException();
	}

	@Override
	public final int getY() {
		// TODO - implement Mobile.getY
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the y.
	 * @param y the new y, as the road is an infinite loop, there's a modulo
	 * based on the road height.
	 */
	public final void setY(final int y) {
		// TODO - implement Mobile.setY
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the road.
	 * @param dirt the new dirt
	 */
	private void setDirt(final IDirt dirt) {
		this.dirt = dirt;
	}

	@Override
	public Boolean isAlive() {
		// TODO - implement Mobile.isAlive
		throw new UnsupportedOperationException();
	}

	/**
	 * Dies.
	 */
	protected void isDead() {
		// TODO - implement Mobile.isDead
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean hasBeenKilled() {
		// TODO - implement Mobile.hasBeenKilled
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the board.
	 * @return the board
	 */
	protected fr.exia.showboard.IBoard getBoard() {
		return this.board;
	}

}