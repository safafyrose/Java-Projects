import java.io.FileOutputStream;

public class TryWithResources {
    public static void main (String args[]){
        try{
            FileOutputStream twr = new FileOutputStream("Trywithresources.txt");
            String text = "Hello, This is just for a test";
            twr.write(text.getBytes());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Text sucessfully written into the file");
    }
}
