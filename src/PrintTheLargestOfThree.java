import java.util.*;

public class PrintTheLargestOfThree {
    public static void main(String[] args){
        Scanner largest = new Scanner(System.in);
        int A = largest.nextInt();
        int B = largest.nextInt();
        int C = largest.nextInt();

        if((A >= B) && (A >= C)){
            System.out.println("Largest is A = "+A);
        }
        else if (B >= C) {
            System.out.println("Largest is B = "+B);
        }
        else{
            System.out.println("Largest is C = "+C);
        }
    }
}