package session3;

import java.util.*;

public class HashTableVsHashMap {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();

        map.put(1234, "fjhewiofj lee ");
        map.put(534, "romeo kitten ");
        map.put(56, "Aylla emf");
        map.put(5645, "kevin ejgfo");
        map.put(9453, "mohammed hferf");
        map.put(634,"ahmed kjegner");
        map.put(546, "kenan jhfgoeig");
        map.put(348, "kareem kgoie");
        map.put(645, "husen mrgkr");

        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values();

        List<String> list = new ArrayList<>(values);

        System.out.println(list.get(8));

        boolean b = map.containsKey(3464);
        System.out.println(b);

        boolean kdnvks = map.containsValue("kdnvks");
        System.out.println(kdnvks);


    }


}
