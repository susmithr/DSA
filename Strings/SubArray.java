package Strings;

public class SubArray {

    public static void main(String[] args) {
        int[] arr={1,3,4,5,2,1,7,8};
        subArray(arr);
    }

    public static void subArray(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
              for(int k=i;k<=j;k++){
                  System.out.println(arr[k]+"  ");
              }
          }
        }

    }
}
