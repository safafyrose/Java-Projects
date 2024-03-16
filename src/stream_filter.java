import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_filter {
    public static void main(String args[]){
        //filtering names that starts with N
        Stream<String> stream2 = Stream.of("Safa","Hiba","Shifa","Nidal","Nadine","Noura");
        List<String> filtered = stream2.filter(x->x.startsWith("N")).toList();
        System.out.println(filtered);

        //filtering odd numbers
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5); //creating a list
        Stream<Integer> stream= numbers1.stream(); //converting list to stream
        List<Integer> odd = stream.filter(x->x%2!=0).toList(); //mapping
        System.out.println(numbers1);
        System.out.println(odd);
    }
}
