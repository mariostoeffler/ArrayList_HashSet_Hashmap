import java.util.ArrayList;
import java.util.HashMap;

public class StudentMapDemo {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> studentHashMap = new HashMap<>();
        
        studentHashMap.put("Susi Sorglos", new ArrayList<>());
        studentHashMap.put("Max Mustermann", new ArrayList<>());
        System.out.println("studentHashMap = " + studentHashMap);

        ArrayList<Integer> gradesOfSusi = studentHashMap.get("Susi Sorglos");
        gradesOfSusi.add(1);
        gradesOfSusi.add(2);
        System.out.println("studentHashMap = " + studentHashMap);


        for (String peter:studentHashMap.keySet()) {
            System.out.println("student = " + peter);

        }

    }
}
