import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10,60,40,90,20);

        int max =
                numbers.stream()
                       .max(Integer::compare)
                       .get();

        System.out.println(max);
    }
}