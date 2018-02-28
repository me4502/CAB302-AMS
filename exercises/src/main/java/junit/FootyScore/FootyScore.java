package junit.FootyScore;

/**
 * An Australian Rules football score consists of a number of
 * points, accumulated by kicking goals and behinds.
 * 
 */
public class FootyScore {

	/* Initially there is no score */
	private int goals = 0;
	private int behinds = 0;
	
	/**
	 * Returns the total number of points, based on the number
	 * of goals and behinds kicked, and the number of points
	 * earned for each.
	 * 
	 * @return the total number of points earned
	 */
	public int getPoints() {
		final int pointsPerGoal = 6;
		final int pointsPerBehind = 1;
		return (goals * pointsPerGoal) + (behinds * pointsPerBehind);
	}
	/**
	 * Increments the number of goals kicked.
	 */
	public void kickGoal() {
		goals += 1;
	}
	
	/**
	 * Increments the number of points kicked.
	 */
	public void kickBehind() {
		behinds += 1;
	}
	
	/**
	 * Returns a string representing the way an AFL score would be
	 * expressed by a typical footy commentator, as the number of
	 * goals kicked, behinds kicked, and points earned.
	 * 
	 * @return a "speakable" football score
	 */
	public String sayScore() {
		return Integer.toString(goals) + ", " + 
		Integer.toString(behinds) + ", " +
		getPoints();
	}
	
	/**
	 * Returns whether or not this team's score exceeds the given team's
	 * score.
	 * 
	 * @param otherTeam the opposing footy team
	 * @return true iff this team is winning
	 */
	public boolean inFrontOf(FootyScore otherTeam) {
		return (getPoints() > otherTeam.getPoints());
	}
	
}
