package view;

import javax.swing.*;
import java.awt.event.*;
import contract.*;

/**
 * The Class ViewFrame.
 * 
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame implements KeyListener {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = -697358409737458175L;
	/**
	 * The model.
	 */
	private IModel model;
	/**
	 * The controller.
	 */
	private IController controller;

	/**
	 * Instantiates a new view frame.
	 * @param model the model
	 */
	public ViewFrame(final IModel model) throws java.awt.HeadlessException {
		// TODO - implement ViewFrame.ViewFrame
		throw new UnsupportedOperationException();
	}

	/**
	 * Instantiates a new view frame.
	 * @param model the model
	 * @param gc the gc
	 */
	public ViewFrame(final IModel model, final java.awt.GraphicsConfiguration gc) {
		// TODO - implement ViewFrame.ViewFrame
		throw new UnsupportedOperationException();
	}

	/**
	 * Instantiates a new view frame.
	 * @param model the model
	 * @param title the title
	 */
	public ViewFrame(final IModel model, final String title) throws java.awt.HeadlessException {
		// TODO - implement ViewFrame.ViewFrame
		throw new UnsupportedOperationException();
	}

	/**
	 * Instantiates a new view frame.
	 * @param model the model
	 * @param title the title
	 * @param gc the gc
	 */
	public ViewFrame(final IModel model, final String title, final java.awt.GraphicsConfiguration gc) {
		// TODO - implement ViewFrame.ViewFrame
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the controller.
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 * @param controller the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 * @param model the model
	 */
	void buildViewFrame(final IModel model) {
		// TODO - implement ViewFrame.buildViewFrame
		throw new UnsupportedOperationException();
	}

	/**
	 * Prints the message.
	 * @param message the message
	 */
	public void printMessage(final String message) {
		// TODO - implement ViewFrame.printMessage
		throw new UnsupportedOperationException();
	}

	/**
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 * @param e
	 */
	public void keyTyped(final java.awt.event.KeyEvent e) {
		// TODO - implement ViewFrame.keyTyped
		throw new UnsupportedOperationException();
	}

	/**
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 * @param e
	 */
	public void keyPressed(final java.awt.event.KeyEvent e) {
		// TODO - implement ViewFrame.keyPressed
		throw new UnsupportedOperationException();
	}

	/**
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 * @param e
	 */
	public void keyReleased(final java.awt.event.KeyEvent e) {
		// TODO - implement ViewFrame.keyReleased
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param b
	 */
	public void setHeightLooped(boolean b) {
		// TODO - implement ViewFrame.setHeightLooped
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dimension
	 */
	public void setDimension(java.awt.Dimension dimension) {
		// TODO - implement ViewFrame.setDimension
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param closeView
	 */
	public void setDisplayFrame(java.awt.Rectangle closeView) {
		// TODO - implement ViewFrame.setDisplayFrame
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param onTheMap
	 * @param x
	 * @param y
	 */
	public void addSquare(IElement onTheMap, int x, int y) {
		// TODO - implement ViewFrame.addSquare
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param player
	 */
	public void addPawn(IMobile player) {
		// TODO - implement ViewFrame.addPawn
		throw new UnsupportedOperationException();
	}

	public java.util.Observer getObserver() {
		// TODO - implement ViewFrame.getObserver
		throw new UnsupportedOperationException();
	}

}