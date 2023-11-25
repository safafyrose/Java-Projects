import java.util.Scanner;

 abstract class BankAccount_AbstractClass {
    abstract void deposit();
    abstract void withdraw();
}
class SavingsAccount extends BankAccount_AbstractClass {


        Scanner input = new Scanner(System.in);
        int currentvalue = 10000, totalvalue = 0;
        void deposit() {
System.out.println("Enter the amount you want to deposit");
            int depositamount=input.nextInt();
            totalvalue=currentvalue+depositamount;
            System.out.println("Your current balance is"+totalvalue);
        }

        void withdraw () {
            System.out.println("Enter the amount you want to withdraw");
            int withdrawamount=input.nextInt();
            if (totalvalue>1500)
            {totalvalue=currentvalue-withdrawamount;
            System.out.println("Your current balance is"+totalvalue);}
            else {
                System.out.println("Withdrawal not possible!");
            }
        }
    public static void main(String args[]) {
        SavingsAccount s = new SavingsAccount();
        Scanner inputs = new Scanner(System.in);
        System.out.println("Choose your option: A.Deposit\tB.Withdraw\tC.Exit");
        String choice=inputs.next();
        switch (choice){
            case "A":  s.deposit();
            break;
            case "B": s.withdraw();
            break;
            default: System.exit(0);

        }





    }}