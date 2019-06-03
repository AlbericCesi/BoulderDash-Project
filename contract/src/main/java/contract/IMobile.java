package contract;

public interface IMobile {

	int getX();

	int getY();

	java.awt.Point getPosition();

	model.element.Sprite getSprite();

	void moveUp();

	void moveLeft();

	void moveDown();

	void moveRight();

	void doNothing();

	Boolean isAlive();

}