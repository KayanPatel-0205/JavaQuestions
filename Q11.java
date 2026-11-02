import java.util.*;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        boolean hasDuplicate =
                Arrays.stream(nums)
                      .boxed()
                      .collect(Collectors.toSet())
                      .size() < nums.length;

        System.out.println(hasDuplicate);
    }
}