package view;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import contract.IController;
import model.IModel;
import model.mobile.Human;

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
	 private IModel						model;

	 private Human human;
	/**
	 * The controller.
	 */
	private IController controller;

	/**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @throws HeadlessException
     *           the headless exception
     */
    public ViewFrame(final IModel model) throws HeadlessException {
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @param gc
     *          the gc
     */
    public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
        super(gc);
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @param title
     *          the title
     * @throws HeadlessException
     *           the headless exception
     */
    public ViewFrame(final IModel model, final String title) throws HeadlessException {
        super(title);
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @param title
     *          the title
     * @param gc
     *          the gc
     */
    public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
        super(title, gc);
        this.buildViewFrame(model);
    }

    /**
     * Gets the controller.
     *
     * @return the controller
     */
    private IController getController() {
        return this.controller;
    }

    /**
     * Sets the controller.
     *
     * @param controller
     *          the new controller
     */
    void setController(final IController controller) {
        this.controller = controller;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    IModel getModel() {
        return this.model;
    }

    /**
     * Sets the model.
     *
     * @param model
     *          the new model
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    /**
     * Builds the view frame.
     * @param model the model
     */
    private void buildViewFrame(IModel model) {
        this.setModel(this.model);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.addKeyListener(this);
        this.setContentPane(new ViewPanel(this));
        this.setSize(32*16 + this.getInsets().left + this.getInsets().right, 32*16 + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);
        this.setTitle("Grosse pisse de mes deux");
    }

    /**
     * Prints the message.
     *
     * @param message
     *          the message
     */
    public void printMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
    public void keyTyped(final KeyEvent e) {

    }

    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
    public void keyPressed(final KeyEvent e) {
        this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
    }
    /*
     * (non-Javadoc)
     *
     * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
     */
    public void keyReleased(final KeyEvent e) {

    }
}}