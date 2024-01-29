package java8Streams;

import java.util.HashMap;
import java.util.Map;

import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;

public class MyMapExample {


    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "first");
        studentMap.put(2, "second");
        studentMap.put(3, "third");
        studentMap.forEach((K, V)->System.out.println(K + ", value" + V));
    }

}
