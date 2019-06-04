package model.motionless;

public abstract class MotionLessFactory {

	/**
	 * The Constant IronWall
	 */
	private static final IronWall ironWall = new IronWall();
	/**
	 * The Constant Background
	 */
	private static final Background background = new Background();
	/**
	 * The constant Portal
	 */
	private static final Portal portal = new Portal();
	/**
	 * The model.motionless.motionless elements is an array of all possible MotionlessElement.
	 */
	private static MotionLessElement[] motionlessElements = {
			ironWall,
			background,
			portal, };

	/**
	 * Creates a new MotionlessElements object.
	 * @return the model.motionless.motionless element
	 */
	public static MotionLessElement createIronWall() {
		// TODO - implement MotionLessFactory.createIronWall
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new MotionlessElements object.
	 * @return the model.motionless.motionless element
	 */
	public static MotionLessElement createBackground() {
		// TODO - implement MotionLessFactory.createBackground
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new MotionlessElements object.
	 * @return the model.motionless.motionless element
	 */
	public static MotionLessElement createPortal() {
		// TODO - implement MotionLessFactory.createPortal
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the good MotionlessElement from file symbol.
	 * @param fileSymbol the file symbol
	 * @return the from file symbol
	 */
	public static MotionLessElement getFromFileSymbol(final char fileSymbol) {
		// TODO - implement MotionLessFactory.getFromFileSymbol
		throw new UnsupportedOperationException();
	}

}