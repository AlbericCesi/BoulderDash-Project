package model.sql;

import java.util.*;

/**
 * The Class DBProperties.
 * 
 * @author Jean-Aymeric Diet
 */
class DBProperties extends Properties {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 5289057445894568927L;
	/**
	 * The Constant PROPERTIES_FILE_NAME.
	 */
	private static final String PROPERTIES_FILE_NAME = "model.properties";
	/**
	 * The url.
	 */
	private String url = "";
	/**
	 * The login.
	 */
	private String login = "";
	/**
	 * The password.
	 */
	private String password = "";

	public String getUrl() {
		return this.url;
	}

	public String getLogin() {
		return this.login;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * Instantiates a new DB properties.
	 */
	public DBProperties() {
		// TODO - implement DBProperties.DBProperties
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the url.
	 * @param url the new url
	 */
	private void setUrl(final String url) {
		this.url = url;
	}

	/**
	 * Sets the login.
	 * @param login the new login
	 */
	private void setLogin(final String login) {
		this.login = login;
	}

	/**
	 * Sets the password.
	 * @param password the new password
	 */
	private void setPassword(final String password) {
		this.password = password;
	}

}