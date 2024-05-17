import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        leapYearChk(year);
    }

    private static void leapYearChk(int year){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.printf("%d is a leap year", year);
        }
        else if(year % 400 == 0){
            System.out.printf("%d is a leap year", year);
        }
        else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
