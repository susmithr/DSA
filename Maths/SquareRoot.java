package Maths;

public class SquareRoot {

    public static void main(String[] args) {

        int n=17;

       int res= squareRoot(n);
        System.out.println(res);
    }

    public static int squareRoot(int n) {
        int s = 0;
        int e = n;
        int res = 0;

        while(s<=e)
        {
            int mid = (s+e)/2;
            if(mid*mid == n)
            {
                return mid;
            }
            else if(mid*mid < n)
            {
                res = mid;
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return res;
}}
