package leetcode;

import java.io.Console;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: L20
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/7/5 11:15
 * @Version: 1.0
 */
public class L20 {

    public boolean isValid(String s) {

        s.replace("()", "").replace("[]", "").replace("{}", "");

        return s.length()==0;
    }
}
