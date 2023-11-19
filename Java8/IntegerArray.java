package Java8;

import java.util.Arrays;
import java.util.List;

public class IntegerArray {

    public static void main(String[] args) {

        List<Integer> mylist= Arrays.asList(1,2,4,5);

        mylist.stream().map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);


    }
}
