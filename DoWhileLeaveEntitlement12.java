import java.util.Scanner;
public class DoWhileLeaveEntitlement12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //Declaration Varibale
        int leaveEntitlement = 0, numLeave = 0, numInput;
        String confirmation;

        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input12.nextInt();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input12.next();

                if(confirmation.equalsIgnoreCase("y")) {
                    System.out.print("How many day (s)? ");
                    numLeave = input12.nextInt(); 

                    
                    while (numLeave > leaveEntitlement) {
                        System.out.println("You dont have enough leave entitlement for " + numLeave + " days ");
                        System.out.print("Enter a valid number of days: ");
                        numLeave = input12.nextInt(); }

                    }
                        leaveEntitlement -= numLeave;
                        System.out.println("Remaining leave entitlement: "+leaveEntitlement);
                
                } while(leaveEntitlement > 0); 
    }}
        

    
    
        

    

