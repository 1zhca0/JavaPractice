package thread;

/**
 * @ProjectName: JavaPractice
 * @Package: thread
 * @ClassName: LamdaTest
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/4/22 14:13
 * @Version: 1.0
 */
public class LamdaTest {

    public static void main(String[] args) {
        testIf t = (a)-> System.out.println(a);
        t.test(10);
    }



    interface testIf{
        void test(int a);
    }
}


