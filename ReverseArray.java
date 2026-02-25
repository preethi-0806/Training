import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (>5): ");
        int n = sc.nextInt();

        if(n <= 5){
            System.out.println("Size must be greater than 5");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");

        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}