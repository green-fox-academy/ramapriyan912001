public class Animal {
    public int hunger = 50;
    public int thirst = 50;

    public void eat() {
        this.hunger -= 1;
    }

    public void drink() {
        this.thirst -= 1;
    }

    public void play() {
        this.hunger += 1;
        this.thirst += 1;
    }
}