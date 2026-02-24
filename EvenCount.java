import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (>5): ");
        int n = sc.nextInt();

        if(n <= 5){
            System.out.println("Size must be greater than 5");
            return;
        }

        int[] arr = new int[n];
        int count = 0;

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println("\nCount of even numbers = " + count);
    }
}