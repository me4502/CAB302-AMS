package patt.ReactorMonitoring;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

public abstract class RadiationMonitor implements Observer {

	/**
	 * Constructs a RadiationMonitor object.
	 * 
	 * @param location.
	 *            An arbitrary location.
	 */
	public RadiationMonitor(String location) {

	}

	/**
	 * Gets the location
	 * 
	 * @return location
	 */
	public String getLocation() {
		return null;
	}

	/**
	 * Updates the monitor with a new observation
	 */
	public abstract void update(Observable subject, Object o);

	/**
	 * Generates a report based on the observation.
	 * 
	 * @param observation
	 * @return a report
	 */
	public abstract String generateReport(double observation);

	/**
	 * Gets the current time.
	 * 
	 * @return The current time in yyyy-MM-dd HH:mm:ss format
	 */
	public String now() {
		String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat date = new SimpleDateFormat(DATE_FORMAT_NOW);
		return date.format(calendar.getTime());
	}

}
