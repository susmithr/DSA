package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        int[] arr={1,2,3,5,6};

        List<Integer> arl= new ArrayList<>();
        arl.add(1);
        arl.add(2);

        arl.stream().map(i->i*i).forEach(System.out::println);


    }
}
