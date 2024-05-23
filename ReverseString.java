import java.util.Scanner;

// Write a Java program to reverse a string.
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        String new_s = "";

        for (int i = s.length() - 1; i >= 0; i --){
            new_s = new_s + s.charAt(i);
        }

        System.out.println(new_s);
    }
}
