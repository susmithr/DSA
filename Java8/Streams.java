package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Streams {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(9,8,5,2,3,1,4);

        Predicate<Integer> predicate=(integer) ->integer%2==1;

        Integer reduce = list.stream().
                filter(predicate)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        System.out.println(reduce);


    }
}
