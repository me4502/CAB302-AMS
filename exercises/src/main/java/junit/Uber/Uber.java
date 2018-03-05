package junit.Uber;

public class Uber {

    private static double fareRate;

    private String driverName;
    private String carModel;
    private double surgeMultiplier = 1.0;

    private long pickupTime;

    public Uber(String driverName, String carModel) {
        this.driverName = driverName;
        this.carModel = carModel;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    public void pickupPassenger() {
        this.pickupTime = System.currentTimeMillis();
    }

    public double setdownPassenger() {
        return Uber.fareRate * ((System.currentTimeMillis() - this.pickupTime) / 1000) * this.surgeMultiplier;
    }

    public static void setFareRate(double fareRate) {
        Uber.fareRate = fareRate;
    }

    public static double getFareRate() {
        return Uber.fareRate;
    }
}
