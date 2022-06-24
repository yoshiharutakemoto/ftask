package org.example;

import java.util.Calendar;

public class Partime extends Staff{
    public  Partime(String firstName, String lastName, String IDNumber, String sex, Calendar birthOfDate, double hourlyRate, int workedWeek){
        super(firstName, lastName, IDNumber, sex, birthOfDate, hourlyRate);
        workedPerWeek = workedWeek;
    }

    @Override
    public double monthlyEarning() {
        return getHourlyRate() * workedPerWeek * 4;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + getIDNumber()+ "\n");
        builder.append("Employee name: " + getFirstName() + " " + getLastName()+ "\n");
        builder.append("Birth date: " + getBirth().getTime().toString()+ "\n");
        builder.append("Hours works per month: " + workedPerWeek+ "\n");
        builder.append("Monthly Salary: " + monthlyEarning()+ "\n");
        return builder.toString();
    }

    public int getWorkedPerWeek() {
        return workedPerWeek;
    }

    public void setWorkedPerWeek(int workedPerWeek) {
        this.workedPerWeek = workedPerWeek;
    }

    private int workedPerWeek;
}
