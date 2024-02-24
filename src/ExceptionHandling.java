public class ExceptionHandling {
    double div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero not possible");
        return (double) a / b;
    }

    public static void main(String args[]) {
        ExceptionHandling eh = new ExceptionHandling();
        try {
            System.out.println(eh.div(1, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
