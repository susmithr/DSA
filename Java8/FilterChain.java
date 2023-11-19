package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterChain{
    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');

        Predicate<Character> charPredicate = c -> c == 'c';
        Boolean isTrue = list.stream().anyMatch(charPredicate);
        System.out.println(isTrue);

        List<Character> list2 = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');

        Map<Character,Long> mapDataWithCount  = list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        mapDataWithCount.forEach((s1,s2) -> System.out.println(s1 + "" +s2));


    }
}

