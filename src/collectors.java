import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectors {
    public static void main(String[] args) {
        //Filtering strings based on letters using collect
        String[] fruits = {"apple", "banana", "orange"};
        List<String> fruitList = Arrays.asList(fruits);
        Stream<String> stream1 = fruitList.stream();
        List<String> vowel = stream1.filter(name -> name.startsWith("a")).collect(Collectors.toCollection(ArrayList::new)); //mapping
        System.out.println(fruitList);
        System.out.println(vowel);
    }
}