package java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoStream {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(233);
        numbers.add(0);
        numbers.add(55);
        numbers.add(22);
        numbers.add(4);
        numbers.add(30);
        numbers.add(14);

        System.out.println("Numbers are" + numbers);
        List<Integer> evenNumberList = numbers.stream().filter(no -> no % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberList);
    }
}
