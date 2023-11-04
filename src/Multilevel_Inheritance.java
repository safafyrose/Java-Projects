import java.util.Scanner;

public class Multilevel_Inheritance {
    String name;
    void names() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = input.next();
    }
}
class Child3 extends Multilevel_Inheritance{
    String hobby;
    void display(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hobby:");
        hobby = input.next();
        System.out.print(name+"\tlikes to/loves\t"+hobby);
    }
}
class Child4 extends Child3 {
    public static void main(String args[]) {

        Child3 c3 = new Child3();
        c3.names();
        c3.display();

    }
}
