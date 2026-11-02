import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {

        String str = "stress";

        Character ch =
                str.chars()
                   .mapToObj(c -> (char)c)
                   .collect(Collectors.groupingBy(
                           Function.identity(),
                           LinkedHashMap::new,
                           Collectors.counting()))
                   .entrySet()
                   .stream()
                   .filter(e -> e.getValue() == 1)
                   .findFirst()
                   .get()
                   .getKey();

        System.out.println(ch);
    }
}