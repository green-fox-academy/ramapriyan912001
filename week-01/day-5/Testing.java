import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Counter> counters = new ArrayList<>();
        List<Counter> counters2 = new ArrayList<>();
        ArrayList<Counter> counters3 = (ArrayList<Counter>) counters.clone();
        Counter counter = new Counter(20);
        counters.add(counter);
        counters2.add(counter);
        counter = new Counter(12);
        System.out.println(counters);
        System.out.println(counters2);

    }
}
