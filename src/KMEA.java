import java.util.Scanner;

public interface KMEA {
    static final int totalavailableleave=10;
    void  get();
    void display();
    void leave_calculator();

}
 class Students implements KMEA{
    Scanner input = new Scanner(System.in);
    String name,id,mail,address;
    long phno;
    int leave;
    public void get(){
        System.out.println("Enter the Student's name:");
         name=input.next();
        System.out.println("Enter the Student's ID:");
         id=input.next();
        System.out.println("Enter the Student's phone number:");
         phno=input.nextLong();
        System.out.println("Enter the Student's mail ID:");
         mail=input.next();
        System.out.println("Enter the Student's address:");
         address=input.next();
         System.out.println("Enter the amount of leave taken:");
         leave=input.nextInt();
    }
    public void display(){
        System.out.println("Student's name is\t"+name);
        System.out.println("Student's ID is\t"+id);
        System.out.println("Student's phone number is\t"+phno);
        System.out.println("Student's mail ID is\t"+mail);
        System.out.println("Student's address is\t"+address);
        System.out.println("Student has taken a total of\t"+leave+"\tleaves");
    }
    public void leave_calculator(){
        int availableleaves=totalavailableleave-leave;
        System.out.println("The Student has\t"+availableleaves+"\tleaves left");
    }
    public static void main(String args[]){
        Students s=new Students();
        s.get();
        s.display();
        s.leave_calculator();
    }

}
