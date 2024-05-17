import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        largest(a, b, c);
    }

    private static void largest(int a, int b, int c){
//        Method 1
        if(a > b && a > c){
            System.out.printf("%d is largest", a);
        }
        else if(b > a && b > c){
            System.out.printf("%d is largest", b);
        }
        else{
            System.out.printf("%d is largest", c);
        }

//        Method 2
        int max_1 = Math.max(a, b);
        int large = Math.max(max_1, c);

        System.out.println(large);
    }
}
