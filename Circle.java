import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        System.out.println(circlePerimeter(r));
        System.out.println(circleArea(r));
    }

    private static float circlePerimeter(float r){
        return 2 * (float) Math.PI * r;
    }

    private static float circleArea(float r){
        float area = (float) Math.PI * (float) Math.pow(r, 2);
        return area;
    }
}
