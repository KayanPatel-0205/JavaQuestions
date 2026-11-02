import java.util.*;

public class Q17 {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Spring");

        Optional.ofNullable(list)
                .filter(l -> !l.isEmpty())
                .ifPresent(l -> l.forEach(System.out::println));
    }
}