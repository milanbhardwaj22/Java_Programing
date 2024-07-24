// import java.util.Scanner;
// public class whileloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 1;
//         while( counter <= n)
//         {
//             System.out.println(counter);
//             counter ++;
//         }
//         System.out.println("hello world is printed 100x");
//     }
// }


// SUM OF N NUMBERS
import java.util.Scanner;
public class whileloop {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int sum =0;
        while(counter <= n)
        {
        sum += counter;
        counter ++;
        }
        System.out.print(sum);
    }
}