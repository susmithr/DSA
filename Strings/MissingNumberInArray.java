package Strings;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
       int n= missingNumber(arr);
        System.out.println(n);
    }

    public static int missingNumber(int arr[])
    {
        int n = arr.length;
        int totalSum = (n+1)*(n+2)/2;
        int arraySum = 0;
        for(int i=0; i<n; i++) {
            arraySum += arr[i];
        }
        return totalSum - arraySum;
    }


}
