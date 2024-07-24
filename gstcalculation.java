
import java.util.Scanner;
public class gstcalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pen+pencil+eraser;
        float gst = bill * 18 /100;
        float total = gst + bill;
        System.out.println(total);
        System.out.println(bill);


        


    }
}
