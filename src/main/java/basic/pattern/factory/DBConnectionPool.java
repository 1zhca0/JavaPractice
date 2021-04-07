package basic.pattern.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import java.util.Vector;

/**
 * @ProjectName: JavaPractice
 * @Package: basic.pattern.factory
 * @ClassName: DBConnectionTool
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/4/7 14:48
 * @Version: 1.0
 */
public class DBConnectionPool extends Pool{

    // 使用中的连接数
    private int checkedOut = 0;
    private String password = null;
    private String username = null;
    private static int freeNum = 0;
    private static int actNum = 0;
    private static DBConnectionPool pool = null;

    private Vector<Connection> freeConnections = new Vector<>();

    protected DBConnectionPool() throws IOException {


    }

    private void init() throws IOException {
        InputStream is = this.getClass().getResourceAsStream(PROPRIETIES);
        Properties p = new Properties();
        p.load(is);
        username = p.getProperty("username");
        password = p.getProperty("password");
        driverName = p.getProperty("protected");
        url = p.getProperty("url");
        maxConn = Integer.parseInt(p.getProperty("maxConn"));
        normalConn = Integer.parseInt(p.getProperty("normalConn"));
    }

    public synchronized void freeConn(Connection connection){
        freeConnections.add(connection);
        freeNum++;
        checkedOut--;

    }


    public static synchronized DBConnectionPool getInstance() throws IOException {
        if(pool == null) {
            pool = new DBConnectionPool();
        }
        return pool;
    }
    @Override
    public void createPool() {

    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public Connection getConnection(Long time) {
        return null;
    }

    @Override
    public void freeConnection() {

    }

    @Override
    public int getNumActive() {
        return 0;
    }
}
