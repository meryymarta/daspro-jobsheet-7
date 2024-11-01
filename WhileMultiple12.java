import java.util.Scanner;
public class WhileMultiple12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

      //Declaration Variable
      int multiple, sum = 0, counter = 0;
      double average = 0;

      System.out.print(" Input the multiple: ");
      multiple = input12.nextInt();

      int i = 1;
      while (i <= 50) {
        if (i % multiple == 0) {
            sum = sum + i;
            counter++;
        }
        i++;
      }
      average = sum / counter;
    
    System.out.printf(" There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
    System.out.printf(" The sum of all mulptiples of %d in range 1 to 50 is %d. \n", multiple, sum);
    System.out.printf(" The average of all multiples of %d in range 1 to 50 is %.2f. \n ", multiple, average);
}

    }
     
    

