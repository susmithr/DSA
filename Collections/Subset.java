package Collections;

class Subset{
    public static void main(String[] args) {
        long    a1[] = {10, 5, 2, 23, 19,0,3};
        long    a2[] = {19, 5, 999};
        long n=a1.length;
        long m=a2.length;
        String Decision= isSubset(a1,a2,n,m);
        System.out.println(Decision);
    }

    public static String isSubset( long a1[], long a2[], long n, long m) {
        if(n<m){
            return "NO";
        }
        for(int i=0;i<a2.length;i++){
            boolean flag=false;
            for(int j=0;j<a1.length;j++) {
                if(a1[j]==a2[i]){
                    flag=true;
                    break;
                }

            }
            if(flag==false){
                return "NO";
            }

        }


        return "YES";
    }
}
