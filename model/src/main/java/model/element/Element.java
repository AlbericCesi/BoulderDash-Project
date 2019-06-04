package model.element;

public abstract class Element implements IElement {

	private Sprite sprite;
	private Permeability permeability;

	public Sprite getSprite() {
		return this.sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;
	}

	/**
	 * 
	 * @param sprite
	 * @param permeability
	 */
	public Element(final Sprite sprite, final Permeability permeability) {
		// TODO - implement Element.Element
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sprite
	 */
	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	/**
	 * 
	 * @param permeability
	 */
	private void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}

	@Override
	public final java.awt.Image getImage() {
		// TODO - implement Element.getImage
		throw new UnsupportedOperationException();
	}

}