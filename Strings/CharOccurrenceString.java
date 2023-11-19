package Strings;

import java.util.HashMap;

public class CharOccurrenceString {

    public static void main(String[] args) {

        String name="SUSMITH";

        HashMap<Character,Integer> freq=new HashMap<>();

       for(char c:name.toCharArray()){
         if(freq.containsKey(c)){
             freq.put(c,freq.get(c)+1);
         }
         else{
             freq.put(c,1);
         }
       }
        System.out.println(freq);

    }
}
