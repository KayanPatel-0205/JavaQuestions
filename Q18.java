import java.util.*;

public class Q18 {
    public static void main(String[] args) {

        int[] arr = {10,50,25,90,40};

        int max =
                Arrays.stream(arr)
                      .max()
                      .getAsInt();

        System.out.println(max);
    }
}