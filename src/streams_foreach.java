import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams_foreach {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream3 = nums.stream();
        nums.stream().map(x->x*x*x).forEach(y->System.out.println(y));
    }
}
