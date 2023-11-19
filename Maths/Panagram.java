package Maths;

public class Panagram {

    public static void main(String[] args) {

        String s="abcdedfghijklmnopqrstuvwxyz";
        boolean isPanagram= isPanagram(s);
        System.out.println(isPanagram);



    }

    private static boolean isPanagram(String s) {


        if(s.length()<26){
            return false;
        }
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);

            if(x>='a'&& x<='z'){
                visited[x-'a']=true;
            }
            if(x>='A'&& x<='Z'){
                visited[x-'A']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(visited[i]==false){
                return false;
            }
        }


        return true;
    }

}
