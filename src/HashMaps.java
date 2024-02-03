import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String args[]) {
        int i;
        HashMap<String, Integer> stores = new HashMap<>(8, 0.5F);
        Scanner input = new Scanner(System.in);
        System.out.println("How many items do you want to add to the store:");
        int n = input.nextInt();
        for (i = 1; i <=n; i++) {
            System.out.println("Enter the item" + i);
            String items=input.next();
            System.out.println("Enter the quantity" +i);
            Integer value = input.nextInt();
            stores.put(items,value);
        }
        System.out.println(stores);
        System.out.println("Enter the item you want to replace:");
            String items= input.next();
            System.out.println("Enter the new value");
            int newvalue = input.nextInt();
            stores.replace(items,newvalue);
        System.out.println(stores);
        System.out.println("Enter the item you want to remove:");
         items=input.next();
         stores.remove(items);
         System.out.println(stores);
    }
}