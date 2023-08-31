import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSequence {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number less than 47");
        int num = scan.nextInt();


        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
