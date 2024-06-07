import java.util.Scanner;

public class BillOfItemsCost {
    public static void main(String[] agrs) {
        Scanner items = new Scanner(System.in);
        float pencil = items.nextFloat();
        float pen = items.nextFloat();
        float eraser = items.nextFloat();

        float total_bill = pencil + pen + eraser;

        //add 18% gst tax
        float total_bill_with_tax = total_bill + (0.18f * total_bill);

        System.out.println("Bill with 18% tax : "+total_bill_with_tax);
    }
}