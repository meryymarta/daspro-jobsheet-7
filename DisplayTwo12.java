import java.util.Scanner;
public class DisplayTwo12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
    
    //Declaration variable
    int numInput;

    System.out.print("Input some number: ");
    numInput = input12.nextInt();

    for(int i =2; i<= numInput; i+=2) {
       
            System.out.println("2 multiple: "+ i);

        }
    }
    
}

    

