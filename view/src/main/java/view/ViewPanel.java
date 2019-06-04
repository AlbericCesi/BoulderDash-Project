package view;

import javax.swing.*;
import java.util.*;

/**
 * The Class ViewPanel.
 * 
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = -998294702363713521L;
	/**
	 * The view frame.
	 */
	private ViewFrame viewFrame;

	/**
	 * Instantiates a new view panel.
	 * @param viewFrame the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		// TODO - implement ViewPanel.ViewPanel
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the view frame.
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 * @param viewFrame the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/**
	 * (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 * @param arg0
	 * @param arg1
	 */
	public void update(final java.util.Observable arg0, final Object arg1) {
		// TODO - implement ViewPanel.update
		throw new UnsupportedOperationException();
	}

	/**
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 * @param graphics
	 */
	@Override
	protected void paintComponent(final java.awt.Graphics graphics) {
		// TODO - implement ViewPanel.paintComponent
		throw new UnsupportedOperationException();
	}

}