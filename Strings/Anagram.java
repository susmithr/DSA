package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static  void main(String[] args) {

        HashMap<String,Integer> freq=new HashMap<>();

        String[] words = {"susmith", "reddy", "GOD", "DOG", "MADAM", "ADAMM"};

        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String newString = new String(arr);
          if(freq.containsKey(newString)){
              freq.put(newString,freq.get(newString)+1);
          } else{
              freq.put(newString,1);
          }

        }

        System.out.println(freq);

    }}