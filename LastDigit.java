import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int x = Math.abs(n);
        int y = x % 10;

        System.out.printf("Last digit of %d is %d", n, y);
    }
}
