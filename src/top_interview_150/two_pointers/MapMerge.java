package top_interview_150.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>() {{
            put("Apple", 5);
            put("Orange", 5);
            put("Pineaples", 5);
        }};

        map.merge("Apple", 1, (a, b) -> a + b);

        System.out.println(map.get("Apple"));
    }
}
