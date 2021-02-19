import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "один");
        map.put("two", "два");
        map.put("three", "три");
        map.put("four", "четыре");
        map.put("five", "пять");
        replaceKeyValue(map);
    }

    public static void replaceKeyValue(Map<String, String> temp) {
        String[] keys = new String[temp.size()];
        String[] values = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            System.out.println("Key: " + temp.keySet());
            System.out.println("Value: " + temp.values());
            keys[i] = temp.keySet().toString();
            values[i] = temp.values().toString();
            temp.clear();
            temp.put(values[i], keys[i]);
            System.out.println("Key: " + temp.keySet());
            System.out.println("Value: " + temp.values());
        }

    }


}