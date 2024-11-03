
import java.util.Scanner;
public class TicketSales12 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        //declaration variable
        int totalTickets = 0;
        long totalSales = 0;

        while (true) {
            System.out.print("Enter the number of tickets sold: ");
            int numberTickets = input12.nextInt();

            if (numberTickets <= 0) {
                System.out.println("invalid input! please enter positive number of tickets");
                continue;
            }
            totalTickets += numberTickets;
            long priceTicket = 50000;
            long discount = 0;

            if (numberTickets > 4 ) {
                discount  = (long) (priceTicket * 0.1);
            } else if (numberTickets > 10) {
                discount = (long) (priceTicket * 0.15);
            }
                totalSales += (priceTicket - discount) * numberTickets;

                System.out.println("total ticket sold: " + totalTickets);
                System.out.println("total sales: Rp " +totalSales);

                }
                
            }
        }



    
    

