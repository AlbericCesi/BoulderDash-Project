package model.mobile;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

import java.awt.*;

abstract class Mobile extends Element implements IMobile {

    /** The position. */
    private Point position;

    /** The alive. */
    private Boolean alive = true;

    /** The road. */
    private IDirt dirt;

    /**
     * Instantiates a new mobile.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    Mobile(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
        this.position = new Point();
    }


    @Override
    public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
    }


    @Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
    }


    @Override
    public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
    }


    @Override
    public void moveRight() {
        this.setX(this.getX() + 1);
        this.setHasMoved();
    }


    @Override
    public void doNothing() {
        this.setHasMoved();
    }

    /**
     * Sets the dirt has moved.
     */
    private void setHasMoved() {
        this.getDirt().setMobileHasChanged();
    }


    @Override
    public final int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.hasBeenKilled()) {
            this.isDead();
        }
    }


    @Override
    public final int getY() {
        return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y
     *            the new y, as the road is an infinite loop, there's a modulo
     *            based on the road height.
     */
    public final void setY(final int y) {
        this.getPosition().y = (y + this.getDirt().getHeight()) % this.getDirt().getHeight();
        if (this.hasBeenKilled()) {
            this.isDead();
        }
    }

    /**
     * Gets the dirt.
     *
     * @return the dirt
     */
    public IDirt getDirt() {
        return this.dirt;
    }

    @Override
    public Boolean isAlive() {
        return this.alive;
    }

    /**
     * Dies.
     */
    protected void isDead() {
        this.alive = false;
        this.setHasMoved();
    }

    @Override
    public Boolean hasBeenKilled() {
        return this.getDirt().getOnTheDirtXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
   
}
