package EventKalender;

import java.util.Objects;

public class Event {

    private String title;
    private String location;
    private double price;

    public Event(String title, String location, double price) {
        this.title = title;
        this.location = location;
        this.price = price;
    }

    @Override
    public String toString() {
        return "EventKalender.EventKalender{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event that = (Event) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(title, that.title) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, location, price);
    }
}
