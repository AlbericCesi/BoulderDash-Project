package contract;

public interface IController {

	IView getView();

	IModel getModel();

	Order getStackOrder();

	/**
	 * 
	 * @param keyCodeToUserOrder
	 */
	void orderPerform(Order keyCodeToUserOrder);

}