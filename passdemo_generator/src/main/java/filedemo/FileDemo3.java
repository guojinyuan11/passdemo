package filedemo;

import java.io.*;

/**
 * @ClassName FileDemo3
 * @Description
 * @Author gjy
 * @Date 2020/7/16 11:18
 **/
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File file=new File("../ohglajg/test.txt");
        boolean b = file.canRead();
        System.out.println(b);  //flase

        try {
            FileWriter fw=new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
            throw  new IOException("");

        }
        boolean c = file.canRead();
        System.out.println(c);  //flase
    }
}
