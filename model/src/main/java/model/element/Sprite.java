package model.element;

/**
 * <h1>The Sprite Class.</h1>
 * 
 * @author Charles Larcier
 * @version 0.1
 */
public class Sprite {

	/**
	 * The image.
	 */
	private java.awt.Image image;
	/**
	 * The image name.
	 */
	private String imageName;
	/**
	 * The console image.
	 */
	private char consoleImage;

	public java.awt.Image getImage() {
		return this.image;
	}

	public String getImageName() {
		return this.imageName;
	}

	public char getConsoleImage() {
		return this.consoleImage;
	}

	/**
	 * Instantiates a new sprite.
	 * @param character the character
	 * @param imageName the image name
	 */
	public Sprite(final char character, final String imageName) {
		// TODO - implement Sprite.Sprite
		throw new UnsupportedOperationException();
	}

	/**
	 * Instantiates a new sprite.
	 * @param character the character
	 */
	public Sprite(final char character) {
		// TODO - implement Sprite.Sprite
		throw new UnsupportedOperationException();
	}

	/**
	 * Loads image.
	 */
	public final void loadImage() {
		// TODO - implement Sprite.loadImage
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the image.
	 * @param image the new image
	 */
	private void setImage(final java.awt.Image image) {
		this.image = image;
	}

	/**
	 * Sets the console image.
	 * @param consoleImage the consoleImage to set
	 */
	private void setConsoleImage(final char consoleImage) {
		this.consoleImage = consoleImage;
	}

	/**
	 * Sets the image name.
	 * @param imageName the imageName to set
	 */
	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}

}