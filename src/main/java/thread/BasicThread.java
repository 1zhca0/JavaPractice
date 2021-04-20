package thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BasicThread implements Runnable{
    private String url;
    private String name;

    private BasicThread(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader.dewnloader(url,name);
        System.out.println(name + " downloaded");
    }

    public static void main(String[] args) {
        BasicThread basic1 = new BasicThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F140703%2F330746-140f301555752.jpg&refer=http%3A%2F%2Fimg.juimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621496339&t=ecfa4ae93150c731ad2ceefa8eecb98e","1.jpg");
        BasicThread basic2 = new BasicThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201410%2F20%2F20141020162058_UrMNe.jpeg&refer=http%3A%2F%2Fcdn.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621496339&t=13272c8013859d869d65fb48ebd1ee0a","2.jpg");
        BasicThread basic3 = new BasicThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic3.16pic.com%2F00%2F01%2F11%2F16pic_111395_b.jpg&refer=http%3A%2F%2Fpic3.16pic.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621496339&t=e0175cc690cf22cde94f45af389b69ec","3.jpg");

        new Thread(basic1).start();
        new Thread(basic2).start();
        new Thread(basic3).start();

        Thread t = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }});
        t.setDaemon(true);

        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("123");
        }).setDaemon(true);
    }
}

class WebDownloader{

    public static void dewnloader(String url, String name)  {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}