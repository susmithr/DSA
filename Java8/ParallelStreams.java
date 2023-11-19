package Java8;

import java.util.stream.IntStream;

public class ParallelStreams {

    public static void main(String[] args) {
        long start,end=0;

        // start = System.currentTimeMillis();
        // IntStream.range(1, 1000).forEach(n -> System.out.println(n));
        // end = System.currentTimeMillis();
        // System.out.print("Plain Stream took" + (start - end));

        // start = System.currentTimeMillis();
        // IntStream.range(1, 1000).parallel().forEach(n -> System.out.println(n));
        // end = System.currentTimeMillis();
        // System.out.print("Parallel Stream Stream took" + (start - end));

        IntStream.range(1, 100).forEach(x->{
            System.out.println("Thread"+Thread.currentThread().getName()+" "+x);
        });

        IntStream.range(1, 100).parallel().forEach(x->{
            System.out.println("Thread"+Thread.currentThread().getName()+" "+x);
        });

    }

}
