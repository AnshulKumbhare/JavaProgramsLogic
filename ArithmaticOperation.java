//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//        Test Data:
//        Input first number: 125
//        Input second number: 24

import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d mod %d = %d\n", a, b, a % b);
    }
}
