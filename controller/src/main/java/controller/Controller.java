package controller;

import contract.*;

public final class Controller implements IController, IOrderPerformer, IBoulderDashController {

	private model.element.motionless.Door tkt;
	private final int speed = 20000;
	private StateDoor door;
	private IView view;
	private IModel model;
	private Order stackOrder;

	public IView getView() {
		return this.view;
	}

	public void setView(IView view) {
		this.view = view;
	}

	public IModel getModel() {
		return this.model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	public Order getStackOrder() {
		return this.stackOrder;
	}

	public void setStackOrder(Order stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * 
	 * @param view
	 * @param model
	 */
	public Controller(final IView view, final IModel model) {
		// TODO - implement Controller.Controller
		throw new UnsupportedOperationException();
	}

	@Override
	public void start() throws InterruptedException {
		// TODO - implement Controller.start
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stackOrder
	 */
	public void orderPerform(final Order stackOrder) {
		// TODO - implement Controller.orderPerform
		throw new UnsupportedOperationException();
	}

	public void clearStackOrder() {
		// TODO - implement Controller.clearStackOrder
		throw new UnsupportedOperationException();
	}

	@Override
	public IOrderPerformer getOrderPeformer() {
		// TODO - implement Controller.getOrderPeformer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userOrder
	 */
	@Override
	public void orderPerformer(Order userOrder) {
		// TODO - implement Controller.orderPerformer
		throw new UnsupportedOperationException();
	}

}