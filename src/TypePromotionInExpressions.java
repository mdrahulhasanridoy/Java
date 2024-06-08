public class TypePromotionInExpressions {
    public static void main(String[] args) {
        //int, float, long promoted to double
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans =  a + b + c + d;
        System.out.println(ans);

        /*
        //char to int promotion
        char ch1 = 'b';   //98
        char ch2 = 'a';   //97
        System.out.println(ch1-ch2);  //98-97 = 1
        */
    }
}
