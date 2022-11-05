import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {
        HashSet<Student> hashStudent = new HashSet<>();

        Student Peter1 = new Student(3, "Peter Meier");
        Student Peter2 = new Student(2, "Peter Maier");
        Student Peter3 = new Student(1, "Peter Meyer");
        Student Peter4 = new Student(1, "Peter Meyer1");

        hashStudent.add(Peter1);
        hashStudent.add(Peter1);

        hashStudent.remove(Peter1);

        System.out.println(hashStudent.size());

        hashStudent.add(Peter2);
        hashStudent.add(Peter3);
        System.out.println();
        System.out.println(hashStudent.size());

        hashStudent.add(Peter4);

        System.out.println(hashStudent.size());

        System.out.println(hashStudent.equals(Peter2));



        for (Student student: hashStudent
             ) {

            System.out.println(student);

        }


    }
}
