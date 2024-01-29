package java8Streams;

import java.util.Arrays;
import java.util.List;

public class MaxValueFromList {
    public static void main(String[] args) {
        List<Integer> inputIntList = Arrays.asList(10, 25, 41, 25, 3, 5);
        Integer i = inputIntList.stream().max(Integer::compare)
                .get();
        System.out.println("Maz value from given list is \t"+i);
    }
}
