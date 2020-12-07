public class Sharpie {
    public String colour;
    public float width;
    public float inkAmount = 100;

    public Sharpie(String colour, float width) {
        this.colour = colour;
        this.width = width;
    }

    public void use() {
        this.inkAmount -= 20;
    }
}