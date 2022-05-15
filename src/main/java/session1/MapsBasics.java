package session1;

import java.util.HashMap;
import java.util.Map;

public class MapsBasics {


    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();

        students.put(1234, "Romeo");
        students.put(4567, "Lee");
        students.put(8909, "Kiven");
        students.put(7654, "Fendi");
        students.put(7685," Kareem");
        students.put(1234, "romeo");


        System.out.println(students);
//          students.clear();
        System.out.println(students.isEmpty());
        System.out.println(students.get(1234));
        // the get method in HashMap take the key in the pair data structure.



    }

}