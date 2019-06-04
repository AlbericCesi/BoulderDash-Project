package model.mobile;

import java.util.Observable;

import model.element.Element;
import model.element.Sprite;


public class Dirt extends Observable implements IDirt {

	private int width;
	private int height;
	private Element[][] onTheDirt;

	private static final Sprite spriteDirtLevel1 = new Sprite('5', "Level\\Level 1\\Dirt.png");
	
	public Dirt() {
		super();
	}

	@Override
	public final int getWidth() {
		return this.width;
	}


	private void setWidth(final int width) {
		this.width = width;
	}

	
	@Override
	public final int getHeight() {
		return this.height;
	}

	
	private void setHeight(final int height) {
		this.height = height;
	}

	@Override
	public final Element getOnTheDirtXY(final int x, final int y) {
		return this.onTheDirt[x][y];
	}

	
	private void setOnTheDirtXY(final Element element, final int x, final int y) {
		this.onTheDirt[x][y] = element;
	}

	@Override
	public final void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public Observable getObservable() {
		return this;
	}
}
