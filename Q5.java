import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1,2,2,3,3,3,4);

        Map<Integer, Long> freq =
                numbers.stream()
                       .collect(Collectors.groupingBy(
                               Function.identity(),
                               Collectors.counting()));

        System.out.println(freq);
    }
}