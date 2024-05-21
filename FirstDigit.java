import java.util.Scanner;

public class FirstDigit {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        firstDigitNumber(n);
        firstDigitNumber2(n);
    }

//    Method 1
    private static void firstDigitNumber(int num){
        while (num > 10){
            num = (int) num / 10;
        }

        System.out.println(num);
    }

//    Method 2
    private static void firstDigitNumber2(int num){
        double power = Math.log10(num);
        int p = (int) power;
        int a = (int) Math.pow(10, p);
        int ans = num / a;
        System.out.println(ans);
    }
}
