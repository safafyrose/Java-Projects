public class Inheritance_Example {

        int a,b,result;
}
class Sum extends Inheritance_Example {
    public static void main(String args[]) {
        Sum s=new Sum();
        s.a = 10;
        s.b = 20;
        s.result = s.a + s.b;
        System.out.println("The result is" + s.result);
    }
}
