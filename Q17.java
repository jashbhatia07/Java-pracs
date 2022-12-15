import java.util.Scanner;

class Reservation
{
    static int availableSeats;
    void setAvlSeats() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total available seats :");
        availableSeats = sc.nextInt();
    }

    synchronized void reserveSeat(int requestedSeats)
    {
        System.out.println("Thread entered.");
        System.out.println("Available seats : " + availableSeats + " Requested seats : " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seats available. Booked successfully. ");
            availableSeats-=requestedSeats;
        }
        else
        {
            System.out.println("Seats not available. Booking failed. ");
        }
        System.out.println("Thread completed.");
        System.out.println("");
    }
}

class Person extends Thread
{
    Reservation reserve;
    int requestedSeats;
    public Person(Reservation reserve, int requestedSeats)
    {
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
    }
    synchronized public void run()
    {
        reserve.reserveSeat(requestedSeats);
    }
    
}

public class Q17 {
    public static void main(String[] args)
    {
        Reservation reserve = new Reservation();
        reserve.setAvlSeats();
        Person Thread1 = new Person(reserve, 5);
        Thread1.start();
        Person Thread2 = new Person(reserve, 6);
        Thread2.start();

    }
}