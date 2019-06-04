package model.mobile;

import java.util.*;
import model.element.*;

public class Dirt extends Observable implements IDirt {

	private int width;
	private int height;
	private Element[][] onTheDirt;
	private static final Sprite spriteDirtLevel1 = new Sprite('5', "Level\\Level 1\\Dirt.png");

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public Dirt() {
		// TODO - implement Dirt.Dirt
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param width
	 */
	private void setWidth(final int width) {
		this.width = width;
	}

	/**
	 * 
	 * @param height
	 */
	private void setHeight(final int height) {
		this.height = height;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	@Override
	public final Element getOnTheDirtXY(final int x, final int y) {
		// TODO - implement Dirt.getOnTheDirtXY
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */
	private void setOnTheDirtXY(final Element element, final int x, final int y) {
		// TODO - implement Dirt.setOnTheDirtXY
		throw new UnsupportedOperationException();
	}

	@Override
	public final void setMobileHasChanged() {
		// TODO - implement Dirt.setMobileHasChanged
		throw new UnsupportedOperationException();
	}

	@Override
	public java.util.Observable getObservable() {
		// TODO - implement Dirt.getObservable
		throw new UnsupportedOperationException();
	}

}