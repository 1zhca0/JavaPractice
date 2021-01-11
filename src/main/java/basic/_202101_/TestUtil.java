package basic._202101_;

import java.util.Calendar;
import java.util.Random;

/**
 * @ProjectName: JavaPractice
 * @Package: basic._202101_
 * @ClassName: TestUtil
 * @Author: Frank.Cao
 * @Description: 测试代码用
 * @Date: 2021/1/11 10:44
 * @Version: 1.0
 */
public class TestUtil {

    public static void main(String[] args) {
        String s = Long.toString(Calendar.getInstance().getTimeInMillis()) + new Random().nextInt(100);
//        System.out.println(s);

        String fileid = "123";
        fileid = fileid == null ? "" : fileid;
        System.out.println("fileid : " + fileid);
    }


}
