import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        float radius = circle.nextFloat();
        float area = 3.1416f * radius * radius;
        System.out.println(area);
    }
}