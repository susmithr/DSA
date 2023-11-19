package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class charInArray {

    public static void main(String[] args) {
        String s="susmith";

        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()
                        ));

        System.out.println(collect);

        Map<Character,Long> hm = s.chars().mapToObj(c->
                (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(hm);
    };




}
