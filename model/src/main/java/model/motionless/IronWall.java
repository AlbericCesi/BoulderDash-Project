package model.motionless;

import model.element.Permeability;
import model.element.Sprite;


public class IronWall extends MotionLessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('6', "Items\\wall.png");

    /**
     * Instantiates a new macadam.
     */
    public IronWall() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}