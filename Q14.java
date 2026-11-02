import java.util.*;
import java.util.stream.*;

public class Q14 {
    public static void main(String[] args) {

        int[] arr = {5,2,8,1,4};

        Arrays.sort(arr);

        IntStream stream =
                Arrays.stream(arr);

        stream.forEach(System.out::println);
    }
}