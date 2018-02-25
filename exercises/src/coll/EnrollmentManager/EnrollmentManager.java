package coll.EnrollmentManager;

import java.util.*;

public class EnrollmentManager {
	
	private static HashMap<String, Set<String>> enrollments = new HashMap<String, Set<String>>();

	/**
	 * Enrolls a student into a unit.
	 * 
	 * @param unit
	 * @param student
	 */
	public static void enroll(String unit, String student) {
		
	}

	/**
	 * Gets the HashMap containing the current enrollments.
	 * 
	 * @return
	 */
	public static HashMap<String, Set<String>> getEnrollments() {
		return null;
	}

	/**
	 * Removes all enrollments form the HashMap.
	 */
	public static void wipeEnrollments() {
		
	}

	/**
	 * Withdraws a student from a unit.
	 * 
	 * @param unit
	 * @param student
	 */
	public static void withdrawEnrollment(String unit, String student) {
		
	}

	/**
	 * Withdraws a student from all units they are enrolled in.
	 * 
	 * @param student
	 */
	public static void withdrawStudent(String student) {

	}

	/**
	 * Gets a list of all students of a particular discipline. E.g. If discipline is
	 * "ABC" then return a collection of all students enrolled in units that start
	 * with "ABC", so ABC301, ABC299, ABC741 etc. This method is non-trivial so it
	 * would help to first implement the helper method matchesDiscipline (below).
	 * 
	 * @param discipline
	 * @return
	 */
	public static Set<String> getStudents(String discipline) {
		return null;
	}
}