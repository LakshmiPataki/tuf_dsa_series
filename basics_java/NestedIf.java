import java.util.Scanner;

class NestedIf {
    public static void main(String[] args) {
        // Given an age, pring adult if age = 18, or Teen if its less

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age);
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen");
        }

        scanner.close();

        /*
         * Given the marks of a student, tell us the grade he is getting following the
         * below rules.
         * - Grade A (>=90)
         * - Grade B (>= 70 and <90)
         * - Grade C (>= 50 and < 70)
         * - Grade D (>= 35 and < 50)
         * - Fail (<35)
         */

        Scanner scanner2 = new Scanner(System.in);
        int marks = scanner2.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if ((marks < 90 && marks >= 70)) {
            System.out.println("Grade B");
        } else if ((marks >= 50 && marks < 70)) {
            System.out.println("Grade C");
        } else if ((marks >= 35 && marks < 50)) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
        scanner2.close();

        /*
         * You are given 3 integers a,b and c. Print which of these integers is the
         * largest. If two or more integers are equal and are largest, the program
         * should indicate that as well.
         */

        Scanner scanner3 = new Scanner(System.in);
        int num1 = scanner3.nextInt();
        System.out.println(num1);
        int num2 = scanner3.nextInt();
        System.out.println(num2);
        int num3 = scanner3.nextInt();
        System.out.println(num3);
        scanner3.close();

        if (num1 >= num2 && num1 >= num3) {
            if (num1 == num2 || num1 == num3) {
                System.out.println("Two or more integers are equal and the largest are" + num1);
            } else {
                System.out.println("The largest number is " + num1);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num2 == num1 || num2 == num3) {
                System.out.println("Two or more integers are equal and the largest are " + num2);
            } else {
                System.out.println("The largest number is " + num2);
            }
        } else if (num3 >= num1 && num3 >= num2) {
            if (num3 == num1 || num3 == num2) {
                System.out.println("Two or more integers are equal and the largest are" + num3);

            } else {
                System.out.println("The largest number is " + num3);

            }

        }

    }
}
