package Maths;

public class Factorial {

    public static void main(String[] args) {
        int n=5;

        System.out.println(factorial(n));
    }

    public  static int factorial(int n) {
        int res=1;

        if(n==1){
            System.out.println(1);
        }
        while(n>1){
            res=res*n;
            n--;
        }
 return res;
    }
}
