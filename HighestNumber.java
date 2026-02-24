import java.util.Scanner;

public class HighestNumber {
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

        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Highest number = " + max);
    }
}