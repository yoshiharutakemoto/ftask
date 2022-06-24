package org.example;

import java.util.Calendar;

public class Faculty extends Employee implements  Cloneable{

    public  Faculty(String firstName, String lastName, String sex, Calendar birth, String IDNumber, FacultyLevel level, Education education){
        super(firstName, lastName, IDNumber, sex, birth);
        this.level = level;
        this.education = education;
    }

    public FacultyLevel getLevel() {
        return level;
    }

    public void setLevel(FacultyLevel level) {
        this.level = level;
    }

    private FacultyLevel level;

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    private  Education education;
    @Override
    public double monthlyEarning() {
        double bs = FACULTY_MONTHLY_SALARY * STAFF_MONTHLY_HOURS_WORKED;
        if(level == FacultyLevel.AS)
            return bs;
        else if(level == FacultyLevel.AO)
            return bs * 1.2;
        else
            return bs * 1.4;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + getIDNumber()+ "\n");
        builder.append("Employee name: " + getFirstName() + " " + getLastName()+ "\n");
        builder.append("Birth date: " + getBirth().getTime().toString()+ "\n");
        if(level == FacultyLevel.AS){
            builder.append("Assistant Professor"+ "\n");
        }else if(level == FacultyLevel.AO){
            builder.append("Associate Professor"+ "\n");
        }else{
            builder.append("Full Professor"+ "\n");
        }
        builder.append("Monthly Salary: " + monthlyEarning()+ "\n");
        return builder.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Object duplicate(){
        try{
            return clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}