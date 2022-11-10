package EventKalender;

import java.util.ArrayList;

public class EventDemo {

    public static void main(String[] args) {

        Event hasselhoff = new Event("David Hasselhoff", "Graz", 169);
        Event spongebob = new Event("SpongeBob Schwammkopf", "Tirol", 49);
        Event peter = new Event("Peter Zwegat", "Salzburg", 69);

        ArrayList<Event> arrayListEvents = new ArrayList<Event>();


        EventKalender newCalender = new EventKalender(arrayListEvents);

        newCalender.add(spongebob);
        newCalender.add(hasselhoff);
        newCalender.add(peter);

        System.out.println(newCalender.getByOrt("Graz"));


    }
}
