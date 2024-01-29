package java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {

    public static void main(String[] args) {
        List<Integer> inpuIntegers = Arrays.asList(10, 20, 11, 14, 15, 17, 25, 30);
        inpuIntegers.forEach(System.out::println);
        List<String> liststartingwith1 = inpuIntegers.stream()
                .map(s -> s + " ")
                .filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println("**********************************************************");
        liststartingwith1.forEach(System.out::println);
    }
}
