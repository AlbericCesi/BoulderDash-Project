package view;

import contract.*;

public class ViewTest implements IView, Runnable {

	private int mapView = 10;
	private int SquareSize = 50;
	private java.awt.Rectangle closeView;
	private int view;
	private IMap map;
	private IOrderPerformer orderPerformer;
	private IMobile player;
	private IModel model;
	private ViewFrame viewFrame;

	public int getMapView() {
		return this.mapView;
	}

	public void setMapView(int mapView) {
		this.mapView = mapView;
	}

	public int getSquareSize() {
		return this.SquareSize;
	}

	public void setSquareSize(int SquareSize) {
		this.SquareSize = SquareSize;
	}

	public java.awt.Rectangle getCloseView() {
		return this.closeView;
	}

	public void setCloseView(java.awt.Rectangle closeView) {
		this.closeView = closeView;
	}

	public int getView() {
		return this.view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public IMap getMap() {
		return this.map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	public IMobile getPlayer() {
		return this.player;
	}

	public void setPlayer(IMobile player) {
		this.player = player;
	}

	public IModel getModel() {
		return this.model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	/**
	 * 
	 * @param model
	 */
	public ViewTest(IModel model) throws java.io.IOException {
		// TODO - implement ViewTest.ViewTest
		throw new UnsupportedOperationException();
	}

	private java.awt.Rectangle getReasonableViewPort() {
		// TODO - implement ViewTest.getReasonableViewPort
		throw new UnsupportedOperationException();
	}

	@Override
	public void run() {
		// TODO - implement ViewTest.run
		throw new UnsupportedOperationException();
	}

	private void followMyCharacter() {
		// TODO - implement ViewTest.followMyCharacter
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param keyCode
	 */
	public static Order keyCodeToUserOrder(final int keyCode) {
		// TODO - implement ViewTest.keyCodeToUserOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param controller
	 */
	public void setController(final IController controller) {
		// TODO - implement ViewTest.setController
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param message
	 */
	public void printMessage(String message) {
		// TODO - implement ViewTest.printMessage
		throw new UnsupportedOperationException();
	}

	@Override
	public IMap GetMap() {
		// TODO - implement ViewTest.GetMap
		throw new UnsupportedOperationException();
	}

}