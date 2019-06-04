package model.mobile;

import model.element.Permeability;
import model.element.Sprite;


public class Human extends Mobile {

	/** HumanBase  */
	private static final Sprite spriteIdle =	new Sprite('1', "Human\\Base.png");

	/** HumanMoveLeft */
	private static final Sprite spriteMoveLeft =	new Sprite('1', "Human\\Left.png");

	/** HumanMoveRight */
	private static final Sprite spriteMoveRight =	new Sprite('1',"Human\\Right.png");
	
	/** HumanMoveUp */
	private static final Sprite spriteMoveUp =	new Sprite('1',"Human\\Up1.png");
	
	/** HumanMoveDown */
	private static final Sprite spriteMoveDown =	new Sprite('1', "Human\\Down1.png");
	
	/** IsHumanDead. */
	private static final Sprite spriteIsDead = new Sprite('1', "Human\\Dead.png");


	/** Instantiates a new Human */

    Human() {
		super(spriteIdle, Permeability.BLOCKING);
		spriteIdle.loadImage();
		spriteMoveUp.loadImage();
		spriteMoveDown.loadImage();
		spriteMoveLeft.loadImage();
		spriteMoveRight.loadImage();
		spriteIsDead.loadImage();
    }

    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteMoveLeft);
    }

    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteMoveRight);
    }

    @Override
    public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteMoveUp);
    }

    @Override
    public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteMoveDown);
    }

    protected final void die() {
        super.hasBeenKilled();
        this.setSprite(spriteIsDead);
    }

    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(spriteIdle);
    }
}
