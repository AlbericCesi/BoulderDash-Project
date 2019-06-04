package model;

import java.util.*;

/**
 * The Class model.
 * 
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/**
	 * The model.
	 */
	private Model model;
	private Level level;

	public Model getModel() {
		return this.model;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * (non-Javadoc)
	 * @see model.IModel#getModel()
	 */
	public Model() {
		// TODO - implement Model.Model
		throw new UnsupportedOperationException();
	}

	/**
	 * (non-Javadoc)
	 * @see model.IModel#getObservable()
	 */
	public java.util.Observable getObservable() {
		// TODO - implement Model.getObservable
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void loadLevel(final int id) throws java.sql.SQLException {
		// TODO - implement Model.loadLevel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param model
	 */
	private void setModel(Model model) {
		this.model = model;
	}

}