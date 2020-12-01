import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int fourth = sc.nextInt();
        int fifth = sc.nextInt();
        int sum = first+second+third+fourth+fifth;
        double average = sum/5;
        System.out.println("Sum: " + sum + ", Average: " + average);
      // Write a program that asks for 5 integers in a row,
      // then it should print the sum and the average of these numbers like:
      //
      // Sum: 22, Average: 4.4
    }
  }