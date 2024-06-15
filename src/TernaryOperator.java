public class TernaryOperator {
    public static void main(String[] args){
        int number = 5;

        //ternary operator
        String type = ((number%2) == 0)? "Even" : "Odd";
        int larger = ((5>3))? 5:3;
        System.out.println(larger);
        System.out.println(type);
    }
}