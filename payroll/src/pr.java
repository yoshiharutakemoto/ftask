import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;

public class program {

    public static void main(String[] args){
        Employee employee[] = new Employee[9];
        employee[0] = new Staff("Paita","Allen", 'M', new GregorianCalendar(1959,2,23), "123", 50);
        employee[1] = new Staff("Steven", "Zapata", 'F', new GregorianCalendar(1964,7,12), "456", 35);
        employee[2] = new Staff("Enrique","Rios", 'M',new GregorianCalendar(1970, 6, 2), "789",40);

        employee[3] = new Faculty("Anne","Johnson",'F', new GregorianCalendar(1962, 4, 27), "243", FacultyLevel.FU, new Education("Ph.D","Engineering",3));
        employee[4] = new Faculty("William", "Bouris", 'F', new GregorianCalendar(1975,3,14), "791",FacultyLevel.AS, new Education("Ph.D","English", 1));
        employee[5] = new Faculty("Christopher","Andrade",'F',new GregorianCalendar(1980,5,22),"623",FacultyLevel.AS, new Education("MS","Physical Education",0));

        employee[6] = new Partime("Augusto","Guzman",'F',new GregorianCalendar(1977, 8, 10),"455",35,30);
        employee[7] = new Partime("Martin","Depirro",'F',new GregorianCalendar(1987, 9, 15), "678", 30, 15);
        employee[8] = new Partime("Marque","Aldaco",'M',new GregorianCalendar(1988,11,24), "945", 20, 35);

        // a. Display employee information using toString method
        for(int i=0;i<9;i++)
            System.out.println(employee[i].toString());
        // b. total monthly salary for all part-time staff
        double total = 0;
        for(int i=6;i<9;i++)
            total += employee[i].monthlyEarning();
        System.out.println("Total monthly salary for all part-time staff is: " + total);
        // c. total month salary for all employees.
        total = 0;
        for(int i=0;i<9;i++)
            total += employee[i].monthlyEarning();
        System.out.println("Total month salary for all employees is : " + total);
        // d. sort the employee and then display employee information
        Arrays.sort(employee);
        for(int i=0;i<9;i++)
            System.out.println(employee[i].toString());
        // e. display all employee information ascending by last name
        Arrays.sort(employee, new EmployeeComparer());
        // f. Duplicate a faculty
        Employee faculty =new Faculty("Anne","Johnson",'F', new GregorianCalendar(1962, 4, 27), "243", FacultyLevel.FU, new Education("Ph.D","Engineering",3));;
        Employee duplicateFaculty = (Faculty)((Faculty)faculty).duplicate();
        if(duplicateFaculty == null)
            System.out.println("Duplicate false.");
        else
            System.out.println("Duplicate faculty: " + duplicateFaculty.toString());
    }
}