package Collections;

import java.util.Arrays;

public class LargestElementArray {

    public static void main(String[] args) {

        int[] arr={99,2,3,4,299};

        int n=arr.length;

       int max= largestElement(arr,n);
        System.out.println(max);
    }

    private static int largestElement(int[] arr, int n) {

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }


    return max;
    }


}
