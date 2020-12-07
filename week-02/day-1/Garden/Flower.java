public class Flower extends Plant {

    public Flower(String colour) {
        super(colour, 5, 0.75);
    }

    @Override
    public boolean needWater() {
        return needWater("Flower");
    }
}
