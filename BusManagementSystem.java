import java.util.*;

class Passenger{
    String name;
    int age;
    long con;
    String start;
    String end;
    int seat;

    Passenger(String s,int a,long c,String st,String e,int x){
        name = s;
        age = a;
        con = c;
        start = st;
        end = e;
        seat = x;
    }
}
class Operations{
    static ArrayList<Passenger> arr = new ArrayList<>();

    int vacantSeat(){
        if(arr.size() == 0){
            return 0;
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).seat != (i+1))
                return i;
        }
        return -1;
    }
    void booking(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String s = sc.nextLine();
        System.out.println("Enter age");
        int a = sc.nextInt();
        System.out.println("Enter contact number");
        long c = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter starting point");
        String st = sc.next();
        System.out.println("Enter destination");
        String e = sc.next();
        int x = vacantSeat(); // This functions returns the vacant seat in case of seat is vacant by cancelling

        if(x == -1)
            x = arr.size();
        if(arr.size() < 40){
            arr.add(x,new Passenger(s , a , c , st , e, (x+1)));
		}
        else
            System.out.println("No more seats available");

        System.out.println();
        System.out.println("|-------------------|");
        System.out.println("    Ticket Booked ");
        System.out.println("    Seat number : "+(x+1));
        System.out.println("|-------------------|");
        System.out.println();
        sc.close();
    }

    void cancel(){
        Scanner sc = new Scanner(System.in);
        if(arr.size() >= 1){
            System.out.println("Enter seat number");
            int st = sc.nextInt();
            for (int i = 0; i < arr.size();i++) {
                if(arr.get(i).seat == st){
                    arr.remove(i);
                }
            }
            System.out.println();
            System.out.println("|-------------------|");
            System.out.println("   Ticket Cancelled ");
            System.out.println("|-------------------|");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("No passenger available");
            System.out.println();
        }
        sc.close();
    }

    void seatAvailblity(){
        System.out.println();
        System.out.println("Available seats: "+ (40-arr.size()));
        System.out.println();
    }

    void passengerDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seat number");
        int st = sc.nextInt();
        for (Passenger p : arr) {
            if(p.seat == st){
				System.out.println();
                System.out.println("Passeger Details:");
                System.out.println("Name : "+p.name);
                System.out.println("Age : "+p.age);
                System.out.println("Mobile No. : "+p.con);
                System.out.println("Boarding : "+p.start);
                System.out.println("Destination : "+p.end);
				System.out.println();
				System.out.println();
                return;
            }
        }
        System.out.println();
        System.out.println("Seat "+st+" is vacant");
        System.out.println();
        sc.close();
    }
}
public class BusManagementSystem1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
		Operations op = new Operations();
        int a;
        do{
            System.out.println("Press 1 for Booking");
            System.out.println("Press 2 for Ticket Cancel");
            System.out.println("Press 3 for Seat Availblity");
            System.out.println("Press 4 for Passenger Detail");
            System.out.println("Press 0 for Exit");
            a = sc.nextInt();
            switch(a){
				case 0:
                    System.out.println("Thanks");
					break;
                case 1:
                    //Ticket booking method
                    op.booking();
                    break;
                case 2:
                    //Ticket Cancel method
                    op.cancel();
                    break;
                case 3:
                    //Seat Availablity method
                    op.seatAvailblity();
                    break;
                case 4:
                    // Passenger Detail
                    op.passengerDetail();
                    break;
		default:
		     System.out.println("Invalid Input");
		     System.out.println("Please try again");
            }
        }while(a != 0);
        sc.close();
    }
}
