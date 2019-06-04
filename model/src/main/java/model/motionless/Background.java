package model.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Background extends MotionLessElement {



    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('5', "Items\\ground.png");

    /**
     * Instantiates a new background.
     */
    Background() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}