package org.example;

import java.util.Calendar;


 public abstract class Employee implements EmployeeInfo, Comparable<Employee> {
    private String lastName;
    private String firstName;
    private String IDNumber;
    private String sex;
    private Calendar birthOfDate;

    //constructor
    public Employee(String lastName, String firstName, String IDNumber, String sex, Calendar birthOfDate){
        this.lastName = lastName;
        this.firstName = firstName;
        this.IDNumber = IDNumber;
        this.sex = sex;
        this.birthOfDate = birthOfDate;

    }

     public String getFirstName() { return firstName; }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getIDNumber() {
         return IDNumber;
     }

     public void setIDNumber(String IDNumber) {
         this.IDNumber = IDNumber;
     }

     public String getSexgetSex() { return sex; }

     public void setSex(String sex) {
         this.sex = sex;
     }

     public Calendar getBirth() {
         return birthOfDate;
     }

     public void setBirth(Calendar birth) {
         this.birthOfDate = birth;
     }

     public String getLastName() {
         return lastName;
     }
     public void setLastName(String lastName){
         this.lastName = lastName;
     }
   @Override
   public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + IDNumber + "\n");
        builder.append("Employee name: " + firstName + " " + lastName+ "\n");
        builder.append("Birth date: " + birthOfDate.getTime().toString()+ "\n");

        return builder.toString();
    }

     @Override
     public int compareTo(Employee o) {
         if(this.IDNumber.compareTo(o.getIDNumber()) == -1)
             return 1;
         else if(this.IDNumber.compareTo(o.getIDNumber()) == 0)
             return 0;
         else
             return -1;
     }

     public  abstract  double monthlyEarning();
}
