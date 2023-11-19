package Java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith1 {

    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(10,15,8,49);

        myList.stream().filter(s->s<20).forEach(System.out::println);
    }
}
