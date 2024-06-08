import java.util.*;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        String input = sc.next();
        System.out.println(input);

        byte n = sc.nextByte();
        System.out.println(n);

        double big_decimal_number = sc.nextDouble();
        System.out.println(big_decimal_number);

        boolean true_false = sc.nextBoolean();
        System.out.println(true_false);

        short x = sc.nextShort();
        System.out.println(x);

        long big_number = sc.nextLong();
        System.out.println(big_number);
    }
}