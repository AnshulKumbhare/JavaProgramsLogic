import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        nth_term(a, r, n);
    }

    public static void nth_term(int a, int r, int n){
        int ans = a * (int) Math.pow(r, (n - 1));
        System.out.println("nth term is " + ans);
    }
}
