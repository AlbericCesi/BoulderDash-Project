package model.mobile;

public abstract class MobileFactory {

	/**
	 * The Constant Human
	 */
	private static final Human human = new Human();
	/**
	 * The Constant Diamond
	 */
	private static final Diamond diamond = new Diamond();
	/**
	 * The constant Rock
	 */
	private static final Rock rock = new Rock();
	/**
	 * The model.motionless.motionless elements is an array of all possible MotionlessElement.
	 */
	private static Mobile[] mobileElements = {
            human,
            diamond,
            rock };

	/**
	 * Creates a new MobileElements object.
	 * @return the model.mobile element
	 */
	public static Mobile createHuman() {
		// TODO - implement MobileFactory.createHuman
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new MobileElements object.
	 * @return the model.mobile element
	 */
	public static Mobile createDiamond() {
		// TODO - implement MobileFactory.createDiamond
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new MobileElements object.
	 * @return the model.mobile element
	 */
	public static Mobile createRock() {
		// TODO - implement MobileFactory.createRock
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the good MobileElement from file symbol.
	 * @param fileSymbol the file symbol
	 * @return the from file symbol
	 */
	public static Mobile getFromFileSymbol(final char fileSymbol) {
		// TODO - implement MobileFactory.getFromFileSymbol
		throw new UnsupportedOperationException();
	}

}