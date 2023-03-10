import java.util.Scanner;

public class BusManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        int a;
        do{
            System.out.println("Press 1 for Booking");
            System.out.println("Press 2 for Ticket Cancel");
            System.out.println("Press 3 for Seat Availblity");
            System.out.println("Press 0 for Exit");
            a = sc.nextInt();
            switch(a){
                case 1:
                    //Ticket booking method
                    break;
                case 2:
                    //Ticket Cancel method
                    break;
                case 3:
                    //Seat Availablity method
                    break;
                case 0:
                    System.out.println("Thanks");
            }
        }while(a != 0);
    }
}

