package patt.ReactorMonitoring;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ResearchCentre extends RadiationMonitor {

    private List<Double> observations = new ArrayList<>();

	/**
	 * Constructs a ResearchCentre object, which observes reactor radiation readings
	 * and constantly prints a report with the current moving average of the
	 * recorded observations.
	 * 
	 * @param location
	 *            An arbitrary location.
	 */
	public ResearchCentre(String location) {
		super(location);
	}

	/**
	 * Updates the monitor with a new observation and prints a report.
	 */
	public void update(Observable subject, Object o) {
        observations.add((Double) o);
        System.out.println(generateReport());
	}

	/**
	 * Generates a report of the current moving average, updated by a new
	 * observation. The moving average is calculated by summing all observations
	 * made so far, and dividing by the quantity of observations so far.
	 */
	public String generateReport() {
	    // 2018-02-28 09:54:48 :: moving average :: 3.2289 :: Centre for Nuclear Research
	    double average = observations.stream().mapToDouble(d -> d).average().orElse(0);
        return now() + " :: moving average :: " + String.format("%.5g", average) + " :: " + this.getLocation();
	}
}
