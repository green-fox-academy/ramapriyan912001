public class Tree extends Plant{

    public Tree(String colour) {
        super(colour, 10, 0.40);
    }

    public boolean needWater() {
        return needWater("Tree");
    }

}
