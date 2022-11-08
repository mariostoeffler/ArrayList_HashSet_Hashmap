package EventKalender;

import java.util.ArrayList;

public class EventKalender {

    private ArrayList<Event> events;

    public EventKalender(ArrayList<Event> events) {
        this.events = events;
    }

    public void add(Event newEvents) {
        events.add(newEvents);
    }

    public void printEvents() {
        for (Event e : events) {
            System.out.println("e = " + e);
        }
    }
}
