import java.util.Scanner;

public class PassFail {
    public static void main(String[] args){
        int marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        String result = (33 <= marks)? "Pass" : "Fail";
        System.out.println(result);
    }
}