import java.util.stream.Stream;

public class Q12 {
    public static void main(String[] args) {

        Stream<String> s1 =
                Stream.of("A","B","C");

        Stream<String> s2 =
                Stream.of("D","E","F");

        Stream.concat(s1, s2)
              .forEach(System.out::println);
    }
}