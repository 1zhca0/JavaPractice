package basic.pattern.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ProjectName: JavaPractice
 * @Package: basic.pattern.factory
 * @ClassName: Pool
 * @Author: Frank.Cao
 * @Description: 连接池实体类
 * @Date: 2021/4/7 10:12
 * @Version: 1.0
 */
public abstract class Pool {

    protected static final String PROPRIETIES = "conn.properties";
    private static Pool poolInstance = null;
    private static Driver driver;
    protected static String driverName;
    protected static int maxConn = 100;
    protected static int normalConn = 10;
    protected static String url = null;


    protected Pool() throws IOException {
        init();
    }

    /**
     * 初始化变量
     * @Method init
     * @Author Frank.Cao
     * @Version  1.0
     * @Description
     * @param
     * @Return void
     * @Exception
     * @Date 2021/4/7 11:12
     */
    private void init() throws IOException {
        InputStream is = this.getClass().getResourceAsStream(PROPRIETIES);
        Properties p = new Properties();
        p.load(is);
        maxConn = Integer.parseInt(p.getProperty("maxConn"));
        normalConn = Integer.parseInt(p.getProperty("normalConn"));
        driverName = p.getProperty("driverName");
    }

    public abstract void createPool();

    public static synchronized Pool getInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        if(poolInstance==null){
            poolInstance = (Pool) Class.forName("basic.pattern.factory.Pool").newInstance();
        }
        return poolInstance;
    }

    public abstract Connection getConnection();

    public abstract Connection getConnection(Long time);

    public abstract void freeConnection();

    public abstract int getNumActive();

}
