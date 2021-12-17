import java.util.ArrayList;
import java.util.List;

public class Booking {
//    private Stakeholder stakeholder;
    private MeetingRoom meetingRoom;
    private List<Slot> bookedSlots = new ArrayList<>();

    public void addBooking(MeetingRoom mr, Slot slot) {
        meetingRoom = mr;
        bookedSlots.add(slot);
    }
}
