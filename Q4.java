import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10,20,30,40,50);

        long count = numbers.stream().count();

        System.out.println(count);
    }
}