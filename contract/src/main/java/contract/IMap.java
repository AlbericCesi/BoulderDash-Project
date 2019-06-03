package contract;

public interface IMap {

	int getWidth();

	int getHight();

	java.util.Observable getObservables();

	int getDiamondCount();

	void setPlayer(IMap player);

	void setMapHasChanged();

}