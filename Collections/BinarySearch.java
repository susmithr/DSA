package Collections;
public class BinarySearch {

    public static void main(String[] args) {
        int [] arr={1,2,3,99,199,399,599,699};
        int ans= binarysearch(arr,99);
        System.out.println(ans);
    }
    //retrun index

    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find middle element
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //found at middle
                return mid;
            }
        }return -1;
    }
}