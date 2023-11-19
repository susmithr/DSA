package Strings;

import java.util.Arrays;

public class TwoSringAnagram {

    public static void main(String[] args) {
        String name="susmith";
        String fullname="ussthim";

        char[] arr=name.toCharArray();
        char[] arr1=fullname.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        boolean validAnagram = Arrays.equals(arr, arr1);
        System.out.println(validAnagram);

    }
}
