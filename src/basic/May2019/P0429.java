package basic.May2019;

import java.util.HashMap;
import java.util.Map;

public class P0429 {

	/*
	 * 给定一个数组, 获取其中所有首字母, 并给出这个数组中以这个首字母为开头的所有String对象的拼接
	 */	
	public static Map<String,String> firstChar(String[] arr){
        
        Map<String,String> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            //获取首字符
            char c = arr[i].charAt(0);
            String s = "" + c;
            //如果首字符集合中没有，直接添加,如果有，拼接字符串后添加
            if(!map.containsKey(s)){
                map.put(s,arr[i]);
            } else {
                String newStr = map.get(s) + arr[i];
                map.put(s, newStr);
            }
        }
//        return toString(map);
        
        return map;
    }
	
	public static void main(String[] args) {
		
		String s[] = {"salt","tea","soda","toast","hello", "ammm", "b123"};
		new P0429();
		System.out.println(P0429.firstChar(s).values());
	}
	
	
}
