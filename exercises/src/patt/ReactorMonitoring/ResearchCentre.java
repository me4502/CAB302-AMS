package patt.ReactorMonitoring;

import java.util.Observable;

public class ResearchCentre extends RadiationMonitor {

	/**
	 * Constructs a ResearchCentre object, which observes reactor radiation readings
	 * and constantly prints a report with the current moving average of the
	 * recorded observations.
	 * 
	 * @param location.
	 *            An arbitrary location.
	 */
	public ResearchCentre(String location) {
		super(null);
	}

	/**
	 * Updates the monitor with a new observation and prints a report.
	 */
	public void update(Observable subject, Object o) {

	}

	/**
	 * Generates a report of the current moving average, updated by a new
	 * observation. The moving average is calculated by summing all observations
	 * made so far, and dividing by the quantity of observations so far.
	 */
	public String generateReport(double observation) {
		return null;
	}
}
