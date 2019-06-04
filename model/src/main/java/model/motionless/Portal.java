package model.motionless;

import model.element.Permeability;
import model.element.Sprite;

/**
 * <h1>The Portal Class.</h1>
 *
 * @author Charles Larcier
 * @version 0.3
 */
class Portal extends MotionLessElement {

    /**
     * The Constant SPRITE.
     */
    private static final Sprite SPRITE = new Sprite('7', "Level\\Level1\\TP1.png");

    /**
     * Instantiates a new macadam.
     */
    Portal() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}