package Maths;

public class RecursiveExample {

    public static void main(String[] args) {
        int number=5;
        int result=sum(number);
        System.out.println(result);
    }

    private static int sum(int number) {
        if(number==1){
            return 1;
        } else{
            return number+sum(number-1);
        }

    }

}
