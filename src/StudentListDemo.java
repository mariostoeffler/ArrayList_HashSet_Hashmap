import java.util.ArrayList;
import java.util.HashSet;

public class StudentListDemo {

    public static void main(String[] args) {
        Student Susi = new Student(2324234, "Susi Sorglos");

        ArrayList<Student> studentsList = new ArrayList<>();




        studentsList.add(Susi);

        studentsList.remove(0);

        Student alfred = new Student(34233, "Afreld Sepp");
        studentsList.add(alfred);
        Student alfred1 = new Student(34233, "Afreld Sepp");
        studentsList.add(alfred);

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("Student " + i + " = " + studentsList);

        }

        boolean contains = studentsList.contains(alfred);
        System.out.println("Contains = " + contains);

        containsName(studentsList, "Susi");
        System.out.println("contains = " + contains);

      

        containsMatNum(studentsList, 44);
        System.out.println("contains = " + contains);

        boolean containsSusi3 = containsMatNum(studentsList, 44);
        System.out.println("containsSusi3 = " + containsSusi3);
        
        boolean cointainsSusi4 = containsMatNum(studentsList, 34233);
        System.out.println("cointainsSusi4 = " + cointainsSusi4);

        System.out.println(alfred.equals(alfred1));

        
    }

    public static boolean containsName(ArrayList<Student> studentList, String searchName) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFullName().equals(searchName)) {
                return true;
            }

        }
        return false;
    }

    public static boolean containsMatNum(ArrayList<Student> studentList, int searchMatNum) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getMatNr() == searchMatNum) {
                return true;
            }
        }

            return false;


        }}
