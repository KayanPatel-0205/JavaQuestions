import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40);

        numbers.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}