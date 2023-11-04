import java.util.Scanner;
public class Default_Constructor_Example {
    public static void main(String args[]){
        Employee emp = new Employee();
    }
}
 class Employee {

     Employee()
     {
         Scanner input = new Scanner(System.in);
         String name,designation;
         int id;
         System.out.println("Enter the name");
         name = input.next();
         System.out.println("Enter the ID");
         id = input.nextInt();
         System.out.println("Enter the designation");
         designation = input.next();
         System.out.println("The name is"+name);
         System.out.println("The id is"+id);
         System.out.println("The designation is"+designation);
     }






 }