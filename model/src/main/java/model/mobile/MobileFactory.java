package model.mobile;

public abstract class MobileFactory {

    /** The Constant Human */
    private static final Human human = new Human();

    /** The Constant Diamond */
    private static final Diamond diamond = new Diamond();

    /** The constant Rock */
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
     *
     * @return the model.mobile element
     */
    public static Mobile createHuman() {
        return human; // IDEM
    }

    /**
     * Creates a new MobileElements object.
     *
     * @return the model.mobile element
     */
    public static Mobile createDiamond() {
        return diamond; // IDEM
    }

    /**
     * Creates a new MobileElements object.
     *
     * @return the model.mobile element
     */
    public static Mobile createRock() {
        return rock; // IDEM
    }

    /**
     * Gets the good MobileElement from file symbol.
     *
     * @param fileSymbol the file symbol
     * @return the from file symbol
     */
    public static Mobile getFromFileSymbol(final char fileSymbol) {
        for (final Mobile mobileElement : mobileElements) {
            if (mobileElement.getSprite().getConsoleImage() == fileSymbol) {
                return mobileElement;
            }
        }
        return human; // IDEM
    }
}
