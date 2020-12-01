import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
      // Write a program that reads a number from the standard input,
      // Then prints "Odd" if the number is odd, or "Even" if it is even.
    }
  }
