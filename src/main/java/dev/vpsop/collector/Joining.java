package dev.vpsop.collector;


import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    // joining() is used to concatenate elements of
    // a Stream<String> into a single String

    public static void main(String[] args) {
        List<String> words = List.of("Java", "is", "good");

        String res1 = words.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.joining());

        System.out.println(res1);

        // Add a delimiter b/w words
        String res2 = words.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.joining(" "));

        System.out.println(res2);

        // Add prefix and suffix too
        // prefix + element1 + delimiter + element2 + delimiter + ... + suffix
        String res3 = words.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.joining(" ", "{ ", " }"));

        System.out.println(res3);


    }
}
