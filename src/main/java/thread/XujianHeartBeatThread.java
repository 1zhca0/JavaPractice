package thread;

import com.alibaba.fastjson.JSONObject;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: nc-emec-framework
 * @Package: com.chinaunicom.emergency.common.controller
 * @ClassName: XujianHeartBeatThread
 * @Author: Frank.Cao
 * @Description: 叙简心跳保活接口
 * @Date: 2021/2/8 15:10
 * @Version: 1.0
 */
@Log4j2
@Component
public class XujianHeartBeatThread extends Thread{


    private final static long HEARTBEAT_PERIOD = 15000;
    private final static String ERROR_MSG = "scooper心跳保持功能失效，请联系维护人员";
    private final static String RETURN_KEY = "code";

    @SneakyThrows
    @Override
    public void run() {

        boolean keepAlive = true;
        String heartbeatUrl = "http://124.161.95.203:18080/scooper-core-rest/data/system/authManage/heartbeat?token=eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyTmFtZSI6InpoengxIiwidXNlcklkIjozLCJJbnZhbGlkVGltZSI6IlRodSBKdWwgMDEgMTY6MDc6MjYgQ1NUIDIwMjEifQ.BLhKglXm_PByCWYbz0YGnTL-RbzIFWIkDq7wvlKOh9o_3";
        log.debug("heartbeatUrl --> " + heartbeatUrl);
        while(keepAlive){
            // 发送心跳保持请求
            // 因工程中有Feign拦截器，此拦截器会处理请求中request对象，无request对象会报错，而此方式发送请求请求无request对象
            // 详见：core -> FeignInterceptor.java
            // 解决此问题，1，依然通过Feign调用，请求头添加request对象；2，使用相对简洁的restTemplate方式。 此发送请求使用方法2
            // -- by Frank
            RestTemplate restTemplate = new RestTemplate();

            try {
                String returnObj = restTemplate.getForObject(heartbeatUrl, String.class);
                log.debug("returnObj --> " + returnObj.isEmpty());


                // 心跳正常的返回值是【0】，返回其他值【1】表示心跳保活失败。

                // 某些情况下网络突然不通，按先前逻辑，心跳会被卡断，网络恢复后需要重启项目
                // 修改此逻辑，目前无论网络是否通，都会固定时间发送心跳
                // 此时只发出心跳请求，不对返回值做处理
//                if (null == returnObj || (int) returnObj.get(RETURN_KEY)!=0){
//                    keepAlive = false;
//                }
            } catch (Exception e) {
//                keepAlive = false;
                log.error(ERROR_MSG);
            } finally {
                // 叙简文档中规定的心跳间隔 - 15s
                Thread.sleep(HEARTBEAT_PERIOD);
            }
        }
    }


    public static void main(String[] args) {
        new XujianHeartBeatThread().start();
    }
}
