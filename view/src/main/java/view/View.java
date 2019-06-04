package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {

		switch (keyCode) {
			case KeyEvent.VK_UP:
				return ControllerOrder.Up;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.Down;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.Left;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.Right;
			case KeyEvent.VK_1:
				return ControllerOrder.One;
			case KeyEvent.VK_2:
				return ControllerOrder.Two;
			case KeyEvent.VK_3:
				return ControllerOrder.Three;
			case KeyEvent.VK_4:
				return ControllerOrder.Four;
			case KeyEvent.VK_5:
				return ControllerOrder.Five;
			default:
				return ControllerOrder.Nope;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
		this.viewFrame.repaint();
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);

	}
}