import java.util.Scanner;

class Movieticket {
    String movie_name;
    int numberOf_tickets;
    double ticket_price;

    Movieticket(String movie_name, int numberOf_tickets, double ticket_price) {
        this.movie_name = movie_name;
        this.numberOf_tickets = numberOf_tickets;
        this.ticket_price = ticket_price;
    }

    double total() {
        return ticket_price * numberOf_tickets;
    }

    double discount() {
        if (numberOf_tickets >= 5) {
            return total() * 0.10;
        } else {
            return 0.0;
        }
    }

    double finalamount() {
        return total() - discount();
    }

    void displayBill() {
        System.out.println("======= Cinema Ticket Booking Bill =======");
        System.out.println("Movie Name        : " + movie_name);
        System.out.printf("Ticket Price      : %.2f%n", ticket_price);
        System.out.println("Number of Tickets : " + numberOf_tickets);
        System.out.printf("Total Amount      : %.2f%n", total());
        System.out.printf("Discount          : %.2f%n", discount());
        System.out.printf("Final Amount      : %.2f%n", finalamount());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Movie name : ");
        String movie_name = sc.nextLine();

        System.out.println("Enter number of tickets : ");
        int numberOf_tickets = sc.nextInt();

        System.out.println("Enter the ticket price : ");
        double ticket_price = sc.nextDouble();

        Movieticket ticket = new Movieticket(
            movie_name,
            numberOf_tickets,
            ticket_price
        );

        ticket.displayBill();

        sc.close();
    }
}