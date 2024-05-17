import java.util.Scanner;

public class TableofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        table(n);
    }

    private static void table(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(i * n);
        }
    }
}
