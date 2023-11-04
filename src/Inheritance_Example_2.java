public class Inheritance_Example_2 {
public static void main(String[] args){
Child c=new Child();
c.display();
c.add();
}
}
class Parent{
    int a=10,b=20;
    void display()
    {
        System.out.println("The value of a is"+a);
        System.out.println("The value of b is"+b);
    }
}
class Child extends Parent{
    void add(){
        int c=a+b;
        System.out.println("The sum is"+c);
    }
}
