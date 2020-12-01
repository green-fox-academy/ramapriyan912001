import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int i=1; i <= j;i++) {
            System.out.println('*'*i);
        }
    }
}
