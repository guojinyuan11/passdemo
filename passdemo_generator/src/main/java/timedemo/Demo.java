package timedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Demo
 * @Description
 * @Author gjy
 * @Date 2020/7/3 10:53
 **/
public class Demo {
    public static void main(String[] args) throws ParseException {
        /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Integer integer = Integer.valueOf("20200701113745");
        String format = sdf.format(new Date(Integer.valueOf("20200701113745")));
        System.out.println(format);*/
        String timestamp=new Date().getTime()+"";
        System.out.println(timestamp);

    }

}
