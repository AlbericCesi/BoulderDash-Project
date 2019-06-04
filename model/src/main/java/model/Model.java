package model;

import model.sql.DAOLevel;
import model.sql.DBConnection;

import java.util.Observable;


/**
 * The Class model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The model. */
	private Model model;

	/** The level. */
	private Level level;
	/**
     * Gets the model
     *
     * @return the model and the level
     */

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getModel()
	 */
	public Model () {
		this.level = new Level();
	}
	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	/**
	 * Gets the level.
	 * @return level
	 */
	public Level getLevel() {
		return this.level;
	}

	/**
	 * Sets a new level.
	 *
	 * @param level
	 * 			The new level.
	 */
	public void setLevel(final Level level) {
		this.level = level;
		this.setChanged();
		this.notifyObservers();
	}

	public void loadLevel(final int code) {
		final DAOLevel daolevel = new DAOLevel(DBConnection.getInstance().getConnection());
		this.setLevel(daolevel.find(code));
	}
	/**
	 * Gets the model.
	 *
	 * @return model
	 */
	public Model getModel() {
		return this.model;
	}

	private void setModel(Model model) {
		this.model = model;
	}
}