import java.util.Scanner;
public class TheTriangle12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //Declaration variable
        int numInput, i = 0;
        String s = " ";

        System.out.print("Input some number: ");
        numInput = input12.nextInt();
        
        for ( i = 0; i < numInput; i++) {
            s += " *";
            System.out.println(s);
        
        }
        

    } }
    
