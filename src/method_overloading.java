public class method_overloading {
    public int multiply(int a,int b,int c){
        int product1=a*b*c;
        return product1;

    }
    public double multiply(double a, double b, double c){
        double product2= a*b*c;
        return product2;
    }
    public static void main(String args[]){
method_overloading mthdover = new method_overloading();
int product1=mthdover.multiply(10,40,50);
double product2=mthdover.multiply(2.9,3.8,4.7);
System.out.println("Interger product is"+product1);
System.out.println("Double product is"+product2);
}
}