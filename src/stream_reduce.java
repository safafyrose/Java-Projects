import java.util.Arrays;
import java.util.List;

public class stream_reduce {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       int result = nums.stream().reduce(0,(x,y)->x+y);
        System.out.println(result);
    }
}
