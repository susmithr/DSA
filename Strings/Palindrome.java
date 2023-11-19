package Strings;

public class Palindrome {

    public static void main(String[] args) {

        String str="madam";


        System.out.println(isValidPalindrome(str));
    }

    public static boolean isValidPalindrome(String str) {

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        return str.equals(rev);
    }
}
