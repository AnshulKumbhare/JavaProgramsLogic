import java.util.Scanner;

public class swap2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.printf("a = %d, b = %d", a, b);
        System.out.println();

//        Using 3 variables
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.printf("a = %d, b = %d", a, b);
        System.out.println();
        // Without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a = %d, b = %d", a, b);

    }
}
