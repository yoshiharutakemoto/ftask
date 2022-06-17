import java.util.Calendar;

public class Staff extends Employee {

    public Staff(){
    }
    public  Staff(String firstName, String lastName, char sex, Calendar birth, String id, double hourlyRate){
        super(firstName,lastName,sex,birth,id);
        this.hourlyRate = hourlyRate;
    }
    private double hourlyRate;

    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyEarning() {
        return hourlyRate * STAFF_MONTHLY_HOURS_WORKED;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("Full Time\nMonthly Salary: " + monthlyEarning()+ "\n");
        return builder.toString();
    }
}