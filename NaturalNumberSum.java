import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(summation(n));
    }

    private static int summation(int n){
        return n * (n + 1) / 2;
    }
}
