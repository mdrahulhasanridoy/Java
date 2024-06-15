import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        if(n % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}