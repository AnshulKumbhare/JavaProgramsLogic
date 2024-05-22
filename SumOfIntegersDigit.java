// Write a Java program and compute the sum of an integer's digits.

import java.util.Scanner;

public class SumOfIntegersDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int n = sc.nextInt();

        int s = 0;
        while (n > 0){
            int digit = n % 10;
            s += digit;
            n = (int) n / 10;
        }

        System.out.println(s);
    }
}
