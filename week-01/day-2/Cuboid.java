import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.next();
        double width = sc.next();
        double height = sc.next();
        System.out.println("Surface Area: " + 2*(length*width + width*height + length*height));
        System.out.println("Volume: " + length*width*height);
    }
}
