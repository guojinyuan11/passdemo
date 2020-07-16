package filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName FileDemo1
 * @Description
 * @Author gjy
 * @Date 2020/7/16 10:34
 **/
public class FileDemo1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            File file = new File("../log/log.txt");
            fileWriter = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("创建文件异常");
        }
        PrintWriter pw = new PrintWriter(fileWriter);
        pw.println("test");
        pw.flush();

        try {
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("添加数据异常");
        }finally {
            pw.close();
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException("关闭filewriter异常");
            }
        }




    }
}
