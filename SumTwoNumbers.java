//Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int ans = a + b;
        System.out.printf("Sum of %d and %d is %d", a, b, ans);
    }
}
