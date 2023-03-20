import java.util.Scanner;
class Passenger{
    static int x;
    String name;
    int age;
    long con;
    String start;
    String end;
    int seat;

    Passenger(String s,int a,long c,String st,String e){
        name = s;
        age = a;
        con = c;
        start = st;
        end = e;
        seat = ++x;
    }
}
public class BusManagementSystem {
    public static void main(String[] args) {
        static ArrayList<Passenger> arr = new ArrayList<>();
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

