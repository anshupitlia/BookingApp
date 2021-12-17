import java.util.List;

public  class Search {
    public static int search(int low, int n, List<Slot> number, int startTime, int endTime) {
        int mid = (int) Math.ceil(number.size() / 2);
        if (low > n) {
            return -1;
        }
        final Slot slot = number.get(mid);
        if (startTime >= slot.getStartTime() && endTime <= slot.getEndTime()) {
            return mid;
        }
        if (endTime < slot.getStartTime()) {
            return search(0, mid -1, number, startTime, endTime);
        }
        if (startTime > slot.getEndTime()) {
            return search(mid+1, n, number, startTime, endTime);
        }
        return -1;
    }
}
