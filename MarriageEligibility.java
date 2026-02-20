import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender == 'M' || gender == 'm') {
            if (age >= 24) {
                System.out.println("You are eligible for marriage.");
            } else {
                System.out.println("You are not eligible for marriage.");
            }
        } else if (gender == 'F' || gender == 'f') {
            if (age >= 21) {
                System.out.println("You are eligible for marriage.");
            } else {
                System.out.println("You are not eligible for marriage.");
            }
        } else {
            System.out.println("Invalid gender input!");
        }

        sc.close();
    }
}