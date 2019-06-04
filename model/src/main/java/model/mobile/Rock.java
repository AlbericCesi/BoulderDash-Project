package model.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends Mobile {

	/** RockBase */
	private static final Sprite spriteRIdle = new Sprite('4', "Items\\rock.png");

	/** Instantiates a new Rock */

	public Rock() {
		super(spriteRIdle, Permeability.BLOCKING);
		spriteRIdle.loadImage();
	}

	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteRIdle);
	}

	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteRIdle);
	}

	@Override
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteRIdle);
	}
}