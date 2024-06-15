import java.util.*;

public class PositiveNegative {
    public static void main(String[] args){
        System.out.println("Enter number : ");
        Scanner pn = new Scanner(System.in);
        int number = pn.nextInt();
        if(number>0){
            System.out.println("It's Positive");
        }
        else {
            System.out.println("It's Negative");
        }
    }
}