package model.sql;

import model.Level;

import java.sql.*;

/**
 * The Class DAOLevel.
 *
 * @author Ismaël El Kihel / Manon Cantos
 *
 */
public class DAOLevel extends DAOEntity {

	/**
	 * Instantiates a new DAO model.
	 */
	public DAOLevel(){
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.sql.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final Level entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.sql.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final Level entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.sql.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final Level entity) {
		// Not implemented
		return false;
	}

	/**
	 * Find.
	 *
	 * @param id
	 *          the id
	 * @return the map
	 */
	public Level find(int id)
	{
		/////   access database   /////
		String urlString = "jdbc:mariadb://localhost:3307/boulderdasher?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String loginString = "root";
		String passwdString = "";
		Connection cnConnection = null;
		CallableStatement stStatement = null;
		ResultSet rsResultset = null;

		String sqlRequestString = "{call levelByID(?)}";
		/////////////////////////////////////

		Level TEMP = new Level();

		try {
			// 2): Connexion
			cnConnection = DriverManager.getConnection(urlString, loginString, passwdString);
			// 3): create  statement
			stStatement = (CallableStatement) cnConnection.prepareCall(sqlRequestString);
			stStatement.setInt(1, id);
			stStatement.execute();
			// 4): execute query
			rsResultset = stStatement.getResultSet();
			// 5):
			if (rsResultset.first()) {
				String TEMP_mapText_FromSQL = rsResultset.getString("level_data");
				TEMP_mapText_FromSQL = TEMP_mapText_FromSQL.replaceAll("\n", "");

				System.out.println(TEMP_mapText_FromSQL);
			}
			else {
				System.out.println("<ERROR : map not found>");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 6): clear memory
				cnConnection.close();
				stStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return TEMP;
	}
}