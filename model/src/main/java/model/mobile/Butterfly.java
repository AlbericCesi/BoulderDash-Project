package model.mobile;

import model.element.Permeability;
import model.element.Sprite;


/**
 * The Class Butterfly.
 *
 * @author Ismaël El Kihel
 */

public class Butterfly extends Mobile {

	/** ButterflyBase  */
	private static final Sprite spriteBIdle = new Sprite('2', "Level\\Level 1\\Butterfly1.png");
	
	/** Instantiates a new Butterfly */
		
public Butterfly(){
	super(spriteBIdle, Permeability.BLOCKING);
	spriteBIdle.loadImage();
	}

@Override
	
public final void moveLeft() {
	 super.moveLeft();
	 this.setSprite(spriteBIdle);
	}

@Override
	
public final void moveRight() {
	  super.moveRight();
	  this.setSprite(spriteBIdle);
	}

@Override
	
public final void moveUp() {
	  super.moveUp();
	  this.setSprite(spriteBIdle);
	}

@Override
	
public final void moveDown() {
	  super.moveDown();
	  this.setSprite(spriteBIdle);
	}

protected final void die() {
	  super.hasBeenKilled();
	}
}