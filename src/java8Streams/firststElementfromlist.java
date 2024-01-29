package java8Streams;

import java.util.Arrays;
import java.util.List;

public class firststElementfromlist {

    public static void main(String[] args) {
        List<Integer> inputIntList = Arrays.asList(10, 25, 41, 25, 3, 5);
        inputIntList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
