import java.util.ArrayList;
import java.util.Scanner;


public class College_ArrayList {
    public static void main(String[] args){
        ArrayList<String> Batch = new ArrayList<>();
        System.out.println("Enter the number of batch:");
        Scanner src = new Scanner(System.in);
       int  n = src.nextInt();
        System.out.println("Enter the batches");
        for(int i=0;i<n;i++)
        {
            String batch = src.next();
            Batch.add(batch);
        }
        System.out.println(Batch);
System.out.println("The last batch entered is:"+Batch.get(n-1));


    }
}
