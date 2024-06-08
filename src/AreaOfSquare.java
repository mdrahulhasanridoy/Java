import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sides = new Scanner(System.in);
        int side = sides.nextInt();
        int area = side * side;
        System.out.println("Area of the square is : "+area);
    }
}
