import java.util.Scanner;

// Write a Java program to compute hexagon area.
public class HexagonalArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        int s = sc.nextInt();

        float area = (float) ((float) (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)));
        System.out.println(area);
    }
}
