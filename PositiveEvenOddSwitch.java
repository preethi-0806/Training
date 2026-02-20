import java.util.Scanner;

public class PositiveEvenOddSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        if (num > 0) {
            System.out.println("The number is Positive");

            
            switch (num % 2) {
                case 0:
                    System.out.println("The number is Even");
                    break;
                case 1:
                    System.out.println("The number is Odd");
                    break;
            }

        } else {
            System.out.println("The number is Not Positive");
        }

        sc.close();
    }
}