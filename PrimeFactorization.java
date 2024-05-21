import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        primeFactors(n);
    }

    public static void primeFactors(int num){
        for (int i = 2; i <= num; i ++){
            if (chkPrime(i)) {
                int x = i;
                while (num % x == 0){
                    System.out.print(i + ", ");
                    x = x * i;
                }
            }
        }
    }

    public static boolean chkPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
