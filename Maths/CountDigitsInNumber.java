package Maths;

public class CountDigitsInNumber {

    public static void main(String[] args) {
        int n=123;
        int count= countDigits(n);
        System.out.println(count);
    }

    public  static int countDigits(int n) {
        int count=0;

        while(n>0){
            count++;
            n=n/10;
        }

        return count;
    }
}
