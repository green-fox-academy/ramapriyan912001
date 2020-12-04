import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        System.out.println(map.isEmpty());
        for (Map.Entry<Integer, Character> entry: map.entrySet()) {
            System.out.println(entry.getKey());
        }
        // alternative method
        map.forEach((x,y) -> {System.out.println(x);});
        System.out.println(map);

    }
}
