
import java.util.Scanner;
public class ForMutiples12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //declaration variable
        int multiple, sum = 0, counter = 0;

        System.out.print(" Input the multiple: ");
        multiple = input12.nextInt();

        for(int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }
    
    System.out.printf(" There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
    System.out.printf(" The sum of all mulptiples of %d in range 1 to 50 is %d. \n", multiple, sum);
    
    }
 
}

