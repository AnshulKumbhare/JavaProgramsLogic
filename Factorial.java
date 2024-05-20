import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        fact_orial(n);
    }

    private static void fact_orial(int n){
        int f = 1;
        for (int i = 2; i <= n; i ++){
            f = f * i;
        }
        System.out.println(f);
    }
}
