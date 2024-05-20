import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println(lcmOfTwoNumber(a, b));
    }

    private static int lcmOfTwoNumber(int n1, int n2){
        int m = n1 * n2;
        int max = Math.max(n1, n2);
        int ans = max;
        for (int i = max; i <= m; i ++){
            if (i % n1 == 0 && i % n2 == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
