public class LogicalOperators {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println((a<b) && (b<c));
        System.out.println((a<b) || (b>c));
        System.out.println(!(a<b));
    }
}