package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsPredicate {

    public static void main(String[] args) {

        List<Integer> arl= Arrays.asList(1,2,9,4,5,3);
        Predicate<Integer> predicate= t->  t%2==1;



        int sum=arl.stream()
                .filter(predicate)
                .sorted()
                .map(t->t*2)
                .reduce(0,(c,e)->c+e);

        System.out.println(sum);





        //Stream<Integer> data=arl.stream();

        //long val=data.count();
        //System.out.println(val);

        //data.forEach(n->System.out.println(n));


        //arl.stream().map(n->n*2).forEach(n->System.out.print(n));




    }}
