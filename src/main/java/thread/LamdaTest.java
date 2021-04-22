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
        LamdaTest l = new LamdaTest();
        l.test1();
    }

    void test1(){
        T1 t = ()-> System.out.println("123");
    }
    interface T1{
        void test();
    }

    class T1a implements T1{

        @Override
        public void test() {
            System.out.println("test");
        }
    }
}


