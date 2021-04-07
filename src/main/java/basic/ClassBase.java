package basic;

/**
 * @ProjectName: JavaPractice
 * @Package: basic
 * @ClassName: ClassBase
 * @Author: Frank.Cao
 * @Description: Class基础知识
 * @Date: 2021/4/7 16:39
 * @Version: 1.0
 */
public class ClassBase {

    public static void main(String[] args) {
        final Class<Integer> type = Integer.TYPE;
        System.out.println(type.getClass());
    }
}
