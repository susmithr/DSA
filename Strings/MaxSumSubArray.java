package Strings;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] arr={1,2,4,6,9};
      int n=  maxSumSubArray(arr);
        System.out.println(n);
    }
    public static int maxSumSubArray(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;

    }}


