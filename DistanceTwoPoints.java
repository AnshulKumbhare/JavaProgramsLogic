import java.util.Scanner;

public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = sc.nextDouble();
        System.out.print("input the longitude of coordinate 2: ");
        double y2 = sc.nextDouble();

        findDistance(x1, y1, x2, y2);
    }

    private static void findDistance(double x1, double y1, double x2, double y2){
        double a1 = Math.toRadians(x1);
        double b1 = Math.toRadians(y1);
        double a2 = Math.toRadians(x2);
        double b2 = Math.toRadians(y2);

        double r_Earth = 6371.01;
        double d = r_Earth * Math.acos(Math.sin(a1) * Math.sin(a2) + Math.cos(a1) * Math.cos(a2) * Math.cos(b1 - b2));
        System.out.println(d);
    }
}
