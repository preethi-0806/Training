import java.util.Scanner;

public class ReverseFromN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Numbers from " + n + " to 1 in reverse order:");

        // Print in reverse using while loop
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        sc.close();
    }
}