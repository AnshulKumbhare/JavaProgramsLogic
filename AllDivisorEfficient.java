import java.util.Scanner;

public class AllDivisorEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = sc.nextInt();

        for (int i = 1; i * i <= n; i++){
            if (n % i == 0){
                System.out.print("(" + i);
                if (n % (n / i) == 0 && i != n / i){
                    System.out.print(", " + (n / i) + ")");
                }
                else{
                    System.out.print(")");
                }
            }
        }
    }
}
