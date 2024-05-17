import java.util.Scanner;

public class OddEven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.printf("%d is even", n);
        }
        else{
            System.out.printf("%d is odd", n);
        }
    }
}
