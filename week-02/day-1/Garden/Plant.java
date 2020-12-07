public class Plant {

    protected String colour;
    protected int minAmount;
    protected double absorption;
    protected int quantityOfWater;

    public Plant(String colour, int minAmount, double absorption) {
        this.colour = colour;
        this.minAmount = minAmount;
        this.absorption = absorption;
        this.quantityOfWater = 0;
    }

    public int getMinAmount() {
        return this.minAmount;
    }

    public int getQuantityOfWater() {
        return this.quantityOfWater;
    }

    public double getAbsorption() {
        return this.absorption;
    }

    public String getColour() {
        return this.colour;
    }

    public void topUp(int topUp) {
        this.quantityOfWater += topUp;
    }

    public boolean waterCheck() {
        return minAmount>quantityOfWater;
    }

    public boolean needWater(String name) {
        if (waterCheck()) {
            System.out.println(String.format("The %s %s needs water.", this.getColour(), name));
        } else {
            System.out.println(String.format("The %s %s doesnt need water.", this.getColour(), name));
        }
        return waterCheck();
    }

    public boolean needWater() {
        return needWater("Plant");
    }

    public void waterPlant(int water) {
        this.quantityOfWater += water*absorption;
    }
}
