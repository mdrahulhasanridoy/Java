import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner calculate = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = calculate.nextInt();
        System.out.println("Enter b : ");
        int b = calculate.nextInt();
        System.out.println("Enter Operator : ");
        char operator = calculate.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Wrong Operation");
        }
    }
}