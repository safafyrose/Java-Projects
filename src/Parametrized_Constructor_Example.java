import java.util.Scanner;

public class Parametrized_Constructor_Example {
    public static void main(String args[]){
        Employee1 emp1 = new Employee1(1,"Safa","HR");
        Employee1 emp2 = new Employee1(2,"Hiba","CRO");
        Employee1 emp3 = new Employee1(3,"Shifa","CEO");

    }
}
class Employee1{
    int id;
    String Name;
    String designation;
    Employee1(int eid,String ename,String edesignation){
        id=eid;
        Name=ename;
        designation=edesignation;
        System.out.println("The employee ID's are"+eid);
        System.out.println("\t\tThe employee names are"+ename);
        System.out.println("\t\t\tThe employee designation are"+edesignation);

    }
}