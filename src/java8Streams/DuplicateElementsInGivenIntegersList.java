package java8Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInGivenIntegersList {
    public static void main(String[] args) {
        List<Integer>inputIntegerList= Arrays.asList(11,11,23,54,85,85,44,22,33,33);
        Set<Integer>mySet=new HashSet<>();
        inputIntegerList.stream()
                .filter(e->!mySet.add(e))
                .forEach(System.out::println);
    }
}
