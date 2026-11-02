import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 15, 123, 45, 178, 91, 100);

        numbers.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}