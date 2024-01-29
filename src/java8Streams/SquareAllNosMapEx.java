package java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAllNosMapEx {

    public static void main(String[] args) {
        List<Integer> inputlist = new ArrayList<>();
        inputlist.add(3);
        inputlist.add(33);
        inputlist.add(56);
        inputlist.add(7);
        inputlist.add(12);

        List<Integer> listWIthSqaures = inputlist.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(listWIthSqaures);


    }
}
