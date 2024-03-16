import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class streams_nonematch {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream3 = nums.stream();
        Boolean noneMatch = stream3.noneMatch(n->nums.contains(20));
        System.out.println(noneMatch);
    }
}
