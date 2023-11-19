package Maths;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        String[] arr={"susmith","reddy","bobbala"};

     Arrays.stream(arr).sorted((o1, o2) -> o2.compareTo(o1)).forEach(str-> System.out.println(str));
    }
}
