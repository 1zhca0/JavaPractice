package thread;

/**
 * @ProjectName: JavaPractice
 * @Package: thread
 * @ClassName: StaticProxyThread
 * @Author: Frank.Cao
 * @Description: 静态代理
 * @Date: 2021/4/22 10:32
 * @Version: 1.0
 */
public class StaticProxyThread {
    public static void main(String[] args) {
//        new Group(new You()).execute();
    }
}

interface Wedding{
    void execute();
}

interface Wedding2{
    void exe2();
}

class You implements Wedding2{

    @Override
    public void exe2() {
        System.out.println("I am wedding");
    }
}

class Group implements Wedding{

    private Wedding2 target;

    public Group(Wedding2 wedding){
        this.target = wedding;
    }

    @Override
    public void execute() {
        System.out.println("before help");
        target.exe2();
        System.out.println("after help");
    }
}