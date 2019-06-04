package model.mobile;

import model.element.*;

/**
 * The Class Human.
 * 
 * @author Ismaël El Kihel
 */
public class Human extends Mobile {

	/**
	 * HumanBase
	 */
	private static final Sprite spriteIdle = new Sprite('1', "Human\\Base.png");
	/**
	 * HumanMoveLeft
	 */
	private static final Sprite spriteMoveLeft = new Sprite('1', "Human\\Left.png");
	/**
	 * HumanMoveRight
	 */
	private static final Sprite spriteMoveRight = new Sprite('1',"Human\\Right.png");
	/**
	 * HumanMoveUp
	 */
	private static final Sprite spriteMoveUp = new Sprite('1',"Human\\Up1.png");
	/**
	 * HumanMoveDown
	 */
	private static final Sprite spriteMoveDown = new Sprite('1', "Human\\Down1.png");
	/**
	 * IsHumanDead.
	 */
	private static final Sprite spriteIsDead = new Sprite('1', "Human\\Dead.png");

	/**
	 * Instantiates a new Human
	 */
	Human() {
		// TODO - implement Human.Human
		throw new UnsupportedOperationException();
	}

	@Override
	public final void moveLeft() {
		// TODO - implement Human.moveLeft
		throw new UnsupportedOperationException();
	}

	@Override
	public final void moveRight() {
		// TODO - implement Human.moveRight
		throw new UnsupportedOperationException();
	}

	@Override
	public final void moveUp() {
		// TODO - implement Human.moveUp
		throw new UnsupportedOperationException();
	}

	@Override
	public final void moveDown() {
		// TODO - implement Human.moveDown
		throw new UnsupportedOperationException();
	}

	protected final void die() {
		// TODO - implement Human.die
		throw new UnsupportedOperationException();
	}

	@Override
	public final void doNothing() {
		// TODO - implement Human.doNothing
		throw new UnsupportedOperationException();
	}

}