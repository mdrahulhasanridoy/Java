import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);
        int year = years.nextInt();
        String result = ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0))? "is a leap year." : "is not a leap year.";
        System.out.println(year + " " + result);
    }
}
