package oop.University;

public class Student extends Academic {

    private double stipend;

    public Student(String name, int id, Title title, double stipend) {
        super(name, id, title);
        this.stipend = stipend;
    }

    @Override
    public double getWeeklyPay() {
        return this.stipend;
    }

    @Override
    public String toString() {
        return "Student " + this.getID() + " studies a " + this.getTitle().toString();
    }
}
