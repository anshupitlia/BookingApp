import java.util.List;

public class MeetingRoom {
    private String name;
    private List<Slot> availableSlots;

    public MeetingRoom(String name, List<Slot> availableSlots) {
        this.name = name;
        this.availableSlots = availableSlots;
    }

    public boolean isFree(int startTime, int endTime) {
        int index = Search.search(0, availableSlots.size(), availableSlots, startTime, endTime);
        if (index == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean book(int startTime, int endTime) {
        if (isFree(startTime, endTime)) {
            int index = Search.search(0, availableSlots.size(), availableSlots, startTime, endTime);
            List<Slot> avlSlots = availableSlots.get(index).deduct(startTime, endTime);
            availableSlots.remove(index);
            availableSlots.addAll(avlSlots);
            return true;
        } else {
            return false;
        }
    }
}
