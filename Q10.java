import java.util.*;

public class Q10 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(5,2,9,1,7);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}