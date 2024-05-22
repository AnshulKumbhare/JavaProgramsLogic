//Write a Java program that takes two numbers as input and displays the product of two numbers.
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int mul = a * b;
        System.out.printf("%d x %d = %d", a, b, mul);
    }
}
