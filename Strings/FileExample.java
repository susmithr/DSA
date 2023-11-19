package Strings;

import java.io.FileOutputStream;

public class FileExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "welcome to usa";

        try {
            FileOutputStream output = new FileOutputStream("C:\\CARLoan\\output.txt");
            byte [] array = str.getBytes();
            output.write(array);
            output.close();




        }catch(Exception e) {
            e.getStackTrace();
        }

    }

}