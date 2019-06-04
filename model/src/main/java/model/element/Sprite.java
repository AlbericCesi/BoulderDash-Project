package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <h1>The Sprite Class.</h1>
 *
 * @author Charles Larcier
 * @version 0.1
 */
public class Sprite {

    /** The image. */
    private Image   image;

    /** The image name. */
    private String  imageName;

    /** The console image. */
    private char    consoleImage;
    /**
     * Instantiates a new sprite.
     *
     * @param character
     *            the character
     * @param imageName
     *            the image name
     */
    public Sprite(final char character, final String imageName) {
        this.setConsoleImage(character);
        this.setImageName(imageName);
    }

    /**
     * Instantiates a new sprite.
     *
     * @param character
     *            the character
     */
    public Sprite(final char character) {
        this(character, "noimage.jpg");
    }

    /**
     * Gets the image.
     *
     * @return the image
     */
    public final Image getImage() {
        return this.image;
    }

    /**
     * Loads image.
     */
    public final void loadImage() {
        try {
            this.setImage(ImageIO.read(new File("C:\\Users\\ielki\\Documents\\GitHub\\Fichtrouille 5\\Branlix2000\\images\\" + this.getImageName())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the console image.
     *
     * @return the consoleImage
     */
    public final char getConsoleImage() {
        return this.consoleImage;
    }

    /**
     * Sets the image.
     *
     * @param image
     *            the new image
     */
    private void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Sets the console image.
     *
     * @param consoleImage
     *            the consoleImage to set
     */
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }

    /**
     * Gets the image name.
     *
     * @return the imageName
     */
    public final String getImageName() {
        return this.imageName;
    }

    /**
     * Sets the image name.
     *
     * @param imageName
     *            the imageName to set
     */
    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }

}