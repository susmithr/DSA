package Maths;

public class Palindrome {

    public static void main(String[] args) {
        int n=123;
        System.out.println(isPalindromeTwoPointer(n));
    }

    public  static boolean isPalindromeTwoPointer(int n) {
        String str=Integer.toString(n);

        int i=0;

        int j=str.length()-1;

        while(i<j){

            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;





    }

    public  static boolean isPalindromeJava(int n) {
      String s=Integer.toString(n);
      String temp="";
      for(int i=s.length()-1;i>=0;i--){
          temp=temp+s.charAt(i);
      }
      return temp.equals(s);
    }

    public static boolean isPalindrome(int n) {
        int rem,sum=0;

        int temp=n;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        return sum == temp;
    }
}
