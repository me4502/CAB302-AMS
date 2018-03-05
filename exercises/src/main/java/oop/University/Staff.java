package oop.University;

public class Staff extends Academic {

    private int hours;

    public Staff(String name, int id, Title title) {
        super(name, id, title);
    }

    @Override
    public double getWeeklyPay() {
        switch (this.getTitle()) {
            case LECTURER:
                return 80000 / 52.0;
            case TUTOR:
                return 40 * this.hours;
            default:
                throw new IllegalStateException("Staff with non-staff title");
        }
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Staff " + this.getID() + " works as a " + this.getTitle().toString();
    }
}
