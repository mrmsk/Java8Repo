package java8Streams;

import java.util.stream.Stream;

public class SortArray1and0 {

    public static void main(String[] args) {
        Integer[] inputarray = {1, 0, 0, 1, 0, 1, 0, 1, 0};

        for (Integer i : inputarray) {
            System.out.println(i);

        }
        Stream<Integer> integerStream = Stream.of(inputarray);
        integerStream.forEach(s -> {
            System.out.println(s);
        });
    }

    //sorting of array


}
