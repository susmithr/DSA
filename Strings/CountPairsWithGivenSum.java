package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {

        int[] arr={3,4,5,6,9};
        int sum=9;
        int result= countPairsWithSum(arr,sum);
        System.out.println(result);
    }

    public static int countPairsWithSum(int[] arr, int sum) {
         int count=0;

         int i=0;
         int j=arr.length;

         while(i<j){
             if(arr[i]+arr[j]==sum){
                 count++;
                 i++;
                 j--;
             } else if(arr[i]+arr[j]<sum){
                 i++;
             }else{
                 j--;
             }

         }
         return count==0?-1:count;
}}
