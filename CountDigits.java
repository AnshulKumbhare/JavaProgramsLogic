import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

//        Method 1

        int count = 0;
        while (n > 0){
           n = (int) n / 10;
            count ++;
        }

        System.out.println(count);

    }
}
