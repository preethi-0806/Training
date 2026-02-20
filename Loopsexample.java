import java.util.Scanner;

public class Loopsexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using while loop
        int temp = num;
        int countWhile = 0;
        while (temp != 0) {
            temp /= 10;
            countWhile++;
        }
        System.out.println("Number of digits using while loop: " + countWhile);

        // Using do-while loop
        temp = num;
        int countDoWhile = 0;
        do {
            temp /= 10;
            countDoWhile++;
        } while (temp != 0);

        System.out.println("Number of digits using do-while loop: " + countDoWhile);

        sc.close();
    }
}