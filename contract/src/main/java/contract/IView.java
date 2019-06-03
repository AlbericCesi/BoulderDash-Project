package contract;

public interface IView {

	java.awt.Rectangle getCloseView();

	int getView();

	IOrderPerformer getOrderPerformer();

	IMap GetMap();

	/**
	 * 
	 * @param string
	 */
	void printMessage(String string);

}