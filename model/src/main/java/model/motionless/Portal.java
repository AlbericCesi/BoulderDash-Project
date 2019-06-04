package model.motionless;

import model.element.Permeability;
import model.element.Sprite;

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