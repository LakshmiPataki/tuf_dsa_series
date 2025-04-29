
import java.util.Scanner;

class LoopsAndArray {
    public static void main(String[] args) {
        // calculate the sum of numbers in given array
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int i;
        int sum = 0;
        for (i = 0; i <= size - 1; i++) {
            arr[i] = scanner.nextInt();

        }

        for (i = 0; i <= size - 1; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("The sum of the input is " + sum);
        scanner.close();

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);

            // increment
            j++;

        }

        int k = 1;
        do {
            // first statement is executed before checking the condition. Rest will execute
            // based on the condition.
            System.out.println(k);
            k++;

        } while (k <= 5);

    }

}
