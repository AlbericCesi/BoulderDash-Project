package model.sql;

/**
 * The Class DBConnection.
 * 
 * @author Ismaël El Kihel
 */
public final class DBConnection {

	/**
	 * The connection.
	 */
	private java.sql.Connection connection;
	/**
	 * The instance.
	 */
	private static DBConnection INSTANCE = null;

	public java.sql.Connection getConnection() {
		return this.connection;
	}

	/**
	 * Instantiates a new DB connection.
	 */
	private DBConnection() {
		// TODO - implement DBConnection.DBConnection
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the single instance of DBConnection.
	 * @return single instance of DBConnection
	 */
	public static synchronized DBConnection getInstance() {
		// TODO - implement DBConnection.getInstance
		throw new UnsupportedOperationException();
	}

	/**
	 * Open.
	 * @return the boolean
	 */
	private Boolean open() {
		// TODO - implement DBConnection.open
		throw new UnsupportedOperationException();
	}

}