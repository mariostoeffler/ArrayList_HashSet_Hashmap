import java.util.HashSet;

public class SetsDemo {
    public static void main(String[] args) {
        HashSet<String> newHashset = new HashSet<String>();
        newHashset.add("Hallo");
        newHashset.add("Student");
        System.out.println(newHashset.size());
        System.out.println(newHashset.toString());
        newHashset.add("Hallo");
        newHashset.add("Student1");
        System.out.println(newHashset.size());

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Max", "Mustermann"));
        people.add(new Person("Max", "Mustermann"));
        System.out.println(people.toString());


    }
}
