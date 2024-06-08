public class Decrement {
    public static void main(String[] args) {

        //pre decrement
        int a = 10;
        int b  = --a;
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        //post decrement
        int c = 10;
        int d  = c--;
        System.out.println("c : "+ c);
        System.out.println("d : "+ d);
    }
}