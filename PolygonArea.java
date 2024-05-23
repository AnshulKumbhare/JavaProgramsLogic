import java.util.Scanner;

// Write a Java program to compute the area of a polygon.
public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of sides on the Polygon: ");
        int n = sc.nextInt();

        System.out.print("length of one of the sides: ");
        int s = sc.nextInt();

        double area = (double) (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.println(area);
    }
}
