package contract;

public interface IModel {

	model.element.mobile.IMap getMap();

	model.element.mobile.Player getPlayer();

	java.util.Observable getObservable();

	model.element.motionless.MotionlessElement getMotionlessElement();

}