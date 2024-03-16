import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class streams_findany {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream3 = nums.stream();
        Optional<Integer> result = nums.stream().findAny();
        System.out.println(result);
    }
}
