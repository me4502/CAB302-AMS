package patt.ReactorMonitoring;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Observable;

public class ControlRoom extends RadiationMonitor {

	private double warningThreshold;
    private double radiation;

	/**
	 * Constructs a ControlRoom object, which observes reactor radiation readings
	 * and prints reports if the radiation exceeds a threshold.
	 * 
	 * @param location
	 *            An arbitrary location.
	 * @param warningThreshold
	 *            The radiation threshold for when reports should be printed.
	 */
	public ControlRoom(String location, double warningThreshold) {
		super(location);

		this.warningThreshold = warningThreshold;
	}

	/**
	 * Updates the monitor with a new observation and prints a report if and only if
	 * the observation is equal to or greater than the warning threshold.
	 */
	public void update(Observable subject, Object o) {
        if (((double) o) > warningThreshold) {
        	this.radiation = (double) o;
            System.out.println(generateReport());
        }
	}

	/**
	 * Generates a report based on the observation.
	 */
	@Override
	public String generateReport() {
		// 2018-02-28 09:54:52 :: WARNING :: 8.1881 :: Reactor A Control Room
        return now() + " :: WARNING :: " + String.format("%.5g", this.radiation) + " :: " + this.getLocation();
	}

}
