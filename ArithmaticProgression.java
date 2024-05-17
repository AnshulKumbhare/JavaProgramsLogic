import java.util.Scanner;

public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Nth term is " + nth_term(a, d, n));
    }

    public static int nth_term(int a, int d, int n){
        return (a + (n - 1) * d);
    }
}
