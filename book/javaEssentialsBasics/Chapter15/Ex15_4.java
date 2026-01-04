package Chapter15;

import java.io.*;
import java.util.*;

public class Ex15_4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);

        //FileInputStream fis = new FileInputStream("{파일 경로}");

        int data = 0;

        while((data=fis.read()) != -1){
            char c = (char)data;
            System.out.print(c);
        }
    }


}
