import java.util.Scanner;

public class OddEven2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.print("positive ");

            if(n % 2 == 0){
                System.out.print("Even");
            }
            else{
                System.out.print("odd");
            }
        }
        else if(n < 0){
            System.out.print("negative ");

            if(n % 2 == 0){
                System.out.print("Even");
            }
            else{
                System.out.print("odd");
            }
        }
        else{
            System.out.println(0);
        }
    }
}
