package model.sql;

import model.Level;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The Class DAOConnector.
 *
 * @author Jean-Aymeric Diet
 */
abstract class DAOConnector {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOConnector(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	protected DAOConnector() {
		connection = null;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * Creates.
	 *
	 * @param level , the level
	 *
	 * @return true , if successful
	 */
	public abstract boolean create(Level level);

	/**
	 * Delete.
	 *
	 * @param level , the level
	 * @return true, if successful
	 */
	public abstract boolean delete(Level level);

	/**
	 * Update.
	 *
	 * @param level , the level
	 * @return true, if successful
	 */
	public abstract boolean update(Level level);
}
