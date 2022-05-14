package session3;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(1);
        nums.add(2);
        nums.add(23);
        nums.add(44);
        nums.add(54);
        nums.add(23);
        nums.add(56);
        nums.add(78);
        nums.add(8);
        nums.add(9);
        nums.add(55);
        nums.add(45);


        int sumOfEvenNumbers = 0;
        for (int i = 0; i < nums.size(); i++) {

            if(nums.get(i) % 2 == 0){
                sumOfEvenNumbers += nums.get(i);




            }

        }
        System.out.println( sumOfEvenNumbers);


        int sum = nums.stream().filter(i -> i % 2 == 0).mapToInt(j -> j).sum();
        System.out.println(sum);


    }
}
