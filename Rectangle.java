import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = sc.nextFloat();

        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        float area = l * b;
        float perimeter = 2 * (l + b);
        System.out.println(area + " " + perimeter);
    }
}
