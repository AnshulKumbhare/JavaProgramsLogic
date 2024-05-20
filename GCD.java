import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        System.out.println(gcdOfTwoNumber(a, b));
    }
    
    private static int gcdOfTwoNumber(int n1, int n2){
        int gcd = 1;
        int max = Math.min(n1, n2);
        for (int i = max; i >= 1; i--){
            if(n1 % i == 0 && n2 % i ==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
