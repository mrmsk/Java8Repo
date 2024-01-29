package java8Streams;

import java.util.Arrays;
import java.util.List;

public class TotalNoOfElementsfromLisst {
    public static void main(String[] args) {
        List<Integer> inputIntList = Arrays.asList(10, 25, 41, 25, 3, 5);
        long count = inputIntList.stream().count();
        System.out.println("Count from the list is "+count);

    }
}
