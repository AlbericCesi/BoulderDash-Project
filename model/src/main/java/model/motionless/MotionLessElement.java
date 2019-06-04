package model.motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;


abstract class MotionLessElement extends Element {
	
	/**
     * Instantiates a new model.motionless.motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */


	public MotionLessElement(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}


}
