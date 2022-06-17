import java.util.Calendar;

public class Partime extends Staff{
    public  Partime(){

    }

    public  Partime(String firstName, String lastName, char sex, Calendar birth, String id, double hourlyRate, int workedWeek){
        super(firstName, lastName, sex, birth, id, hourlyRate);
        workedPerWeek = workedWeek;
    }

    @Override
    public double monthlyEarning() {
        return getHourlyRate() * workedPerWeek * 4;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + getId()+ "\n");
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