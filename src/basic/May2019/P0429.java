package basic.May2019;

import java.util.HashMap;
import java.util.Map;

public class P0429 {

	/*
	 * ����һ������, ��ȡ������������ĸ, ������������������������ĸΪ��ͷ������String�����ƴ��
	 */	
	public static Map<String,String> firstChar(String[] arr){
        
        Map<String,String> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            //��ȡ���ַ�
            char c = arr[i].charAt(0);
            String s = "" + c;
            //������ַ�������û�У�ֱ�����,����У�ƴ���ַ��������
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
