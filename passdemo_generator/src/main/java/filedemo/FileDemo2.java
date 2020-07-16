package filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName FileDemo2
 * @Description
 * @Author gjy
 * @Date 2020/7/16 10:51
 **/
public class FileDemo2 {
    public static void main(String[] args) {
        File f=new File("../test");
        if (!f.exists()){
            f.mkdir();
        }
        File file=new File("../test/testlog.txt");
        FileWriter fw=null;
        try {
            fw=new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
            throw new  RuntimeException("添加文件错位u");
        }

        PrintWriter printWriter = new PrintWriter(fw);
        printWriter.println("hhhhhhhhhhhhhhhhhhhhhhhhh");

        printWriter.flush();
        try {
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.close();
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
