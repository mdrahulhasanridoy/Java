import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner number =  new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();

        int average = (a + b + c) / 3;

        System.out.println("Average is : "+ average);
    }
}
