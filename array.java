import java.util.Scanner;

public class array {
    public static void main(String[]args){
       /* int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr.length);
        System.out.println("element 0:"+arr[0]);
        System.out.println("element 1:"+arr[1]);
        System.out.println("element 2:"+arr[2]);
        System.out.println("element 3:"+arr[3]);
        System.out.println("element 4:"+arr[4]);
        arr[0] = 10;
        System.out.println("element 0:"+arr[0]);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
