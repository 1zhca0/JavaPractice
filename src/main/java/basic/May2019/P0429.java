package basic.May2019;

import java.util.HashMap;
import java.util.Map;

public class P0429 {

	public static Map<String,String> firstChar(String[] arr){
        
        Map<String,String> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            //获取首字符
            char c = arr[i].charAt(0);
            String s = "" + c;
            //如果首字符集合中没有，直接添加,如果有，拼接字符串后添加
            if(!map.containsKey(s)){
                //凉风夜正好，月下谁家年少，念马新城，忽忆故人，月半梢，人在扰，我正来，你可好?
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
