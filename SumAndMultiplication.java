import java.util.Scanner;

public class SumAndMultiplication {
    public static void main(String[] args) {
        // Part 1: Sum of 1 to 15
        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 15 is: " + sum);

        // Part 2: Multiplication Table
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}