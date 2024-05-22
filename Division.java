// Write a Java program to divide two numbers and print them on the screen

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int div = a / b;
        System.out.printf("%d / %d = %d", a, b, div);
    }
}
