package model.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends Mobile {

	/** DiamondBase */
	private static final Sprite spriteDIdle = new Sprite('3', "Items\\diamond.png");

	/** Instantiates a new Rock */

	public Diamond(){
		super(spriteDIdle, Permeability.BLOCKING);
		spriteDIdle.loadImage();
	}

	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteDIdle);
	}

	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteDIdle);
	}

	@Override
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteDIdle);
	}
}