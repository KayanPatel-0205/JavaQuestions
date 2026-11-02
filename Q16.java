import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q16 {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","SQL",
                              "Java","Spring","SQL");

        Map<String, Long> duplicates =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Function.identity(),
                            Collectors.counting()));

        duplicates.entrySet()
                  .stream()
                  .filter(e -> e.getValue() > 1)
                  .forEach(System.out::println);
    }
}