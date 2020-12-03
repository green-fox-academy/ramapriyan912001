import java.util.Map;

public class MapIntro2 {

    public static void main(String[] args) {
    Map<String, String> map = Map.of(
        "978-1-60309-452-8", "A Letter to Jo",
        "978-1-60309-459-7", "Lupus",
        "978-1-60309-444-3", "Red Panda and Moon Bear",
        "978-1-60309-461-0", "The Lab");
        
    map.forEach((x,y) -> {
        System.out.print(y);
        System.out.print(" ");
        System.out.println(x);
    });
    map.
}
    
}
