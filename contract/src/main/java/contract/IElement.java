package contract;

import model.element.*;

public interface IElement extends ISquare {

	model.element.Sprite getSprite();

	model.element.Permeability getPermeability();

	java.awt.Image getImage();

}