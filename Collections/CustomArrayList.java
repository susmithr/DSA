package Collections;


import java.util.ArrayList;

public class CustomArrayList  extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }
        else{
            return super.add(o);
        }
    }

    public static void main(String[] args) {

        CustomArrayList customArrayList=new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(1);

        System.out.println(customArrayList);

    }
}
