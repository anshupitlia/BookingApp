import java.util.ArrayList;
import java.util.List;

public class Organization {
    public static void main(String[] args) {
        Slot slot = new Slot(2, 4);
        Slot slot2 = new Slot(5, 10);
        Booking booking = new Booking();
        List<Slot> slots = new ArrayList<>();
        slots.add(slot);
        slots.add(slot2);
        //is Available
        MeetingRoom mr1 = new MeetingRoom("Alpha", slots);
        System.out.println(mr1.isFree(3, 5));

        //Book
        if (mr1.book(3, 5)) {
            System.out.println("Successfully booked your room");
            booking.addBooking(mr1, new Slot(3, 5));
        } else {
            System.out.println("Unfortunately! we could not book this room");
        }

        //List All Booked Rooms

    }
}
