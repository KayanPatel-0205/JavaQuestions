import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q19 {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> countMap =
                str.chars()
                   .mapToObj(c -> (char)c)
                   .collect(Collectors.groupingBy(
                           Function.identity(),
                           Collectors.counting()));

        System.out.println(countMap);
    }
}