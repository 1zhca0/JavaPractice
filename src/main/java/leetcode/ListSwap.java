package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: JavaPractice
 * @Package: leetcode
 * @ClassName: ListSwap
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/4/20 20:12
 * @Version: 1.0
 *
 * 输入：
 * A -> B -> C -> D -> E
 * 输出：
 * B -> A -> D -> C -> E
 */
public class ListSwap {

    class ResultPair{
        String first;
        String second;

        ResultPair(String first, String second){
            this.first = first;
            this.second = second;
        }

        ResultPair swap(){
            return new ResultPair(this.second, this.first);
        }
    }

    public void transfer(String[] input){

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < input.length; i = i+2) {


            if (i+2>input.length){

                break;
            }
            ResultPair rp = new ResultPair(input[i], input[i+1]);
            ResultPair rpResult = rp.swap();

            // output every pair
            resultList.add(rpResult.first);
            resultList.add(rpResult.second);
        }


    }

}
