package coll.UserAccounts;

public class User {

	/**
	 * Constructs a user with a given username and password. If a user is
	 * successfully constructed, their username is added to the list of usernames.
	 * 
	 * @param username
	 * @param password
	 * @throws Exception.
	 *             Throws a UserException if the username or password is invalid
	 *             (use the below methods badUsername and badPassword to assist you
	 *             with this).
	 */
	public User(String username, String password) throws Exception {

	}

	/**
	 * Gets the username of the user.
	 * 
	 * @return
	 */
	public String getUsername() {
		return null;
	}

	/**
	 * Gets the password of the user.
	 * 
	 * @return
	 */
	public String getPassword() {
		return null;
	}

	/**
	 * Checks if a given username is invalid
	 * 
	 * @param username
	 * @return true if the username already exist, false otherwise.
	 */
	public static boolean badUsername(String username) {
		return false;
	}

	/**
	 * Checks if a given password is invalid.
	 * 
	 * @param password
	 * @return true if the password is fewer than 8 characters long, false
	 *         otherwise.
	 */
	public static boolean badPassword(String password) {
		return false;
	}

}
