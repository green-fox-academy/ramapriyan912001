import static java.lang.Math.pow;

public class Cube {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int surfaceArea() {
        return 6*side*side;
    }

    public int volume() {
        return (int) pow(side, 3);
    }
}
