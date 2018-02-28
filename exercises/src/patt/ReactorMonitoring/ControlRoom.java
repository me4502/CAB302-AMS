package patt.ReactorMonitoring;

import java.util.Observable;

public class ControlRoom extends RadiationMonitor {

	/**
	 * Constructs a ControlRoom object, which observes reactor radiation readings
	 * and prints reports if the radiation exceeds a threshold.
	 * 
	 * @param location.
	 *            An arbitrary location.
	 * @param warningThreshold.
	 *            The radiation threshold for when reports should be printed.
	 */
	public ControlRoom(String location, double warningThreshold) {
		super(null);
	}

	/**
	 * Updates the monitor with a new observation and prints a report if and only if
	 * the observation is equal to or greater than the warning threshold.
	 */
	public void update(Observable subject, Object o) {

	}

	/**
	 * Generates a report based on the observation.
	 */
	@Override
	public String generateReport(double observation) {
		return null;
	}

}
