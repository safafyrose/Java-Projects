public class Calculator {
    public static void main(String[] args)
    {
        int a=10;
        int b=10;
        int result;
        char op='*';
        switch(op)
        {
            case '+': result=a+b;
            System.out.println(result);
            break;
            case '-': result=a-b;
                System.out.println(result);
                break;
            case '*': result=a*b;
                System.out.println(result);
                break;
            case '/': result=a/b;
                System.out.println(result);
                break;
            case '%': result=a%b;
                System.out.println(result);
                break;
            default : System.out.println("Not a valid operator");

        }
    }
}
