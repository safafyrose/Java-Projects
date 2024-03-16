import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_mapping {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5); //creating a list
        Stream <Integer> stream1 = numbers.stream(); //converting list to stream
        List<Integer> cube = stream1.map(x->x*x*x).toList(); //creating a new list cube where we are mapping the function and then converting to list
        System.out.println(numbers);
        System.out.println(cube);
    }
}
