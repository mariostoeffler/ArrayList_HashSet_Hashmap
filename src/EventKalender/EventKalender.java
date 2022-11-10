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


    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public void printEvents() {
        for (Event e : events) {
            System.out.println("e = " + e);
        }
    }

    public Event getByTitle (String title) {
        for (Event e: events) {
            if (e.getTitle().equals(title))
                return e;

        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<Event>();
        for (Event e: events) {
            if (e.getLocation().equals(ort))
                result.add(e);

        }
        return result;
    }

}
