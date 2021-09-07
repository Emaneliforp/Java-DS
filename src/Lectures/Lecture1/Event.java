package Lectures.Lecture1;
import java.time.LocalDateTime;

public class Event {
    // fields: start, end, location
    LocalDateTime start;
    LocalDateTime end;
    String location;

    // constructor
    Event(LocalDateTime start, LocalDateTime end, String location){
        this.start = start;
        this.end = end;
        this.location = location;
    }

    // conflict method
    // Return true if the other event is in the same location at an overlapping time
    public boolean conflict(Event e2) {
        if (this.location != e2.location) return false;

        // completely overlapping
        if (this.start.compareTo(e2.start) > 0 && this.end.compareTo(e2.end) <= 0) {
            return true;
        }
        // completely overlapping2
        if (this.start.compareTo(e2.start) < 0 && this.end.compareTo(e2.start) > 0) {
            return true;
        }
        return false;
    }
}
