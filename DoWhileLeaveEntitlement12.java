import java.util.Scanner;
public class DoWhileLeaveEntitlement12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //Declaration Varibale
        int leaveEntitlement = 0, numLeave, numInput;
        String confirmation;

        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input12.nextInt();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input12.next();

                if(confirmation.equalsIgnoreCase("y")) {
                    System.out.print("How many day (s)? ");
                    numLeave = input12.nextInt();

                    if(numLeave <= leaveEntitlement) {
                        leaveEntitlement -= numLeave;
                        System.out.println("Remaining leave entitlement: "+leaveEntitlement);
                    } else {
                        System.out.println("You dont have enough leave entitlement");
                        break;
                    }
                    }
                } while(leaveEntitlement > 0); }
            }
        
        
    
    
        

    

