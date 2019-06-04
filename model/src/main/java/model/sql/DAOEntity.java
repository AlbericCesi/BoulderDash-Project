package model.sql;

import model.*;

/**
 * The Class DAOEntity.
 * 
 * @author Jean-Aymeric Diet
 */
abstract class DAOEntity {

	/**
	 * The connection.
	 */
	private final java.sql.Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 * @param connection the connection
	 */
	public DAOEntity(final java.sql.Connection connection) throws java.sql.SQLException {
		// TODO - implement DAOEntity.DAOEntity
		throw new UnsupportedOperationException();
	}

	protected DAOEntity() {
		// TODO - implement DAOEntity.DAOEntity
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the connection.
	 * @return the connection
	 */
	protected java.sql.Connection getConnection() {
		return this.connection;
	}

	/**
	 * Creates.
	 * @param level , the level
	 * @return true , if successful
	 */
	public abstract boolean create(Level level);

	/**
	 * Delete.
	 * @param level , the level
	 * @return true, if successful
	 */
	public abstract boolean delete(Level level);

	/**
	 * Update.
	 * @param level , the level
	 * @return true, if successful
	 */
	public abstract boolean update(Level level);

}