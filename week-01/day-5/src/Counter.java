//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class Counter {
    private int counter;
    private ArrayList<Integer> history;

    public Counter(int counter) {
        this.counter = counter;
        this.history = new ArrayList<>();
        history.add(counter);
    }

    public int getCounter() {
        return this.counter;
    }
    public Counter() {
        this.counter = 0;
        this.history = new ArrayList<>();
        history.add(0);
    }

    public Counter add() {
        return this.add(1);
    }

    public Counter add(int number) {
        this.counter += number;
        this.history.add(counter);
        return this;
    }

    public Counter reset() {
        this.counter = history.get(history.size()-2);
        history.remove(Integer.valueOf(history.size()-1));
        return this;
    }

    public String toString() {
        return String.valueOf(this.counter);
    }

}