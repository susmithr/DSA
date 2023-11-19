package Collections;

public class sortArray {

    public static void main(String[] args) {

        int[] nums={1,2,5,3,4,7,8,6};

       for(int i=0;i<nums.length;i++){
           int temp=0;
           for(int j=i+1;j<nums.length;j++){

               if(nums[j]<nums[i]){
                   temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
               }


           }

       }

        for(int num:nums){
            System.out.println(num+" ");
        }
    }
}
