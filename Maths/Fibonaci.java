package Maths;

public class Fibonaci {


    public static void main(String[] args) {


        int num1=0;
        int num2=1;
        int counter=0;
        int n=8;
        while(counter<n){
            //System.out.print(num1 + " ");
            int num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
            counter++;
        }

    }
}
