package Collections;

public class FindMinElemArray {


    public static void main(String[] args) {

        int[] arr={9999,123,1,3,5,-1};
        int ans=min(arr);
        System.out.println(ans);

    }

    static int min(int[] arr) {
        int min=arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index]<min){
                min=arr[index];
            }
        }




        return min;
    }
}
