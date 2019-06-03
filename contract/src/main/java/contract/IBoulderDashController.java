package contract;

public interface IBoulderDashController {

	IOrderPerformer getOrderPeformer();

	void start() throws InterruptedException;

}