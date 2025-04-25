
import java.util.Scanner;

class Basics {
    public static void main(String[] args) {
        int x = 8;
        int y = ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        String name = "Anantha";
        String lastName = "Subramanya";
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        String substrings = fullName.substring(0, 4);
        System.out.println(substrings);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        String num2 = scanner.next();
        System.out.println(num2);

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[1]);

        // 1- D array
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(arr1[3]);

        // 2-D array or Two-dimensional array.

        int[][] arr2 = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        System.out.println(arr2[1][1]);
        int[] Zeroindex = arr2[0];
        System.out.println(Zeroindex[0]);

    }
}