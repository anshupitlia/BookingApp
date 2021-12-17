import java.util.ArrayList;
import java.util.List;

public class Slot {
    private int startTime;
    private int endTime;

    public Slot(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public List<Slot> deduct(int startTime, int endTime) {
        Slot leftSplittedSlot = new Slot(this.startTime, this.startTime - startTime);
        Slot rightSplittedSlot = new Slot(endTime, this.endTime);
        List<Slot> slots = new ArrayList<>();
        slots.add(leftSplittedSlot);
        slots.add(rightSplittedSlot);
        return slots;
    }
}
