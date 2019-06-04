package controller;

import java.awt.event.KeyAdapter;

import contract.ControllerOrder;
import contract.IController;
import contract.IView;
import model.mobile.IMobile;
/**
 * The Class Controller.
 */
public final class Controller extends KeyAdapter implements IController {

	/**
	 * The view.
	 */
	private IView view;

	/**
	 * The mobile.
	 */
	private IMobile mobile;

	/**
 	* The model.
 	*/
	private Model model;

	/**
	 * Instantiates a new controller.
	 *  @param view  the view
	 * @param model the model
	 */

	public Controller(final IView view, final model.Model model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
	 * Control.
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("BoulderDash");
	}

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final Model model) {
		this.model = model;
	}

	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case Up:
				this.mobile.moveUp();
				break;
			case Down:
				this.mobile.moveDown();
				break;
			case Left:
				this.mobile.moveLeft();
				break;
			case Right:
				this.mobile.moveRight();
				break;
            case One:
                this.model.getLevel();
                this.model.loadLevel(1);
                break;
            case Two:
                this.model.getLevel();
                this.model.loadLevel(2);
                break;
            case Three:
                this.model.getLevel();
                this.model.loadLevel(3);
                break;
            case Four:
                this.model.getLevel();
                this.model.loadLevel(4);
                break;
            case Five:
                this.model.getLevel();
                this.model.loadLevel(5);
			default:
			case Nope:
				break;
		}
	}
}