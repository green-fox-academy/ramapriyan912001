import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Josepheus {
    private static final String Map = null;

    public static void main(String[] args) {
        // Can do this with an algorithm
        // However, I wish to sim the entire process
        runSimulation(41);
        
    }

    public static void runSimulation(int input) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            list.add("Alive");
        }
        int count = 0;
        boolean killer = false;
        int i = 0;
        while (count < input-1) {
            if (list.get(i) == "Alive" && !killer) {
                killer = true;
            } else if (list.get(i) == "Alive" && killer) {
                killer = !killer;
                deathMessage(i+1);
                list.set(i, "Dead");
                count++;
            }
            i++;
            i %= input;
            //System.out.println(count);
        }
        System.out.println(String.valueOf(list.indexOf("Alive") + 1) + " lives!");
    }

    public static void deathMessage(int input) {
        String s = String.valueOf(input) + " is dead.";
        System.out.println(s);
    }
}
