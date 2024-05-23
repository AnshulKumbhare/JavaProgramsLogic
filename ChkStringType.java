import java.util.Scanner;

// Write a Java program to count letters, spaces, numbers and other characters in an input string.
// The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33

public class ChkStringType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int letter = 0, space = 0, number = 0, other = 0;

        for (int i = 0; i < s.length(); i ++){
            if (Character.isLetter(s.charAt(i))){
                letter ++;
            }
            else if (Character.isSpaceChar(s.charAt(i))){
                space ++;
            }
            else if (Character.isDigit(s.charAt(i))){
                number ++;
            }
            else{
                other ++;
            }
        }

        System.out.printf("letter = %d \nspace = %d \nnumber = %d \nother = %d \n", letter, space, number, other);
    }
}
