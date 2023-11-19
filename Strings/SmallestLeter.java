package Strings;

public class SmallestLeter {

    public static void main(String[] args) {

        char[] letters={'a','b','c'};
        char target='c';
        char ch=nextGreatestLetter(letters,target);
        System.out.println(ch);
    }
    public static char nextGreatestLetter(char[] letters,char target){

        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                mid=mid-1;
            }else{
                start=mid+1;
            }

        }
        return letters[start%letters.length];
    }
}
