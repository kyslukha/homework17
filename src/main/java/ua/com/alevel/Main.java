package ua.com.alevel;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "один");
        map.put("two", "два");
        map.put("three", "три");
        map.put("four", "четыре");
        map.put("five", "пять");
        System.out.println(map);
        map = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(map); // it is worked if map does not have duplicate keys
    }
}
