package basic.May2019;

import java.util.HashSet;
import java.util.Set;

public class P0429 {

	/*
	 * ����һ������, ��ȡ������������ĸ, ������������������������ĸΪ��ͷ������String�����ƴ��
	 */
	public static void main(String[] args) {
		
		String sample[] = {"salt","tea","soda","toast","hello"};
		
		Set<String> firstsSet = new HashSet<>();
		for (int i = 0; i < sample.length; i++) {
			firstsSet.add(sample[i].substring(0, 1));
		}
		
		
		System.out.println(firstsSet);
		
		String result = "";
		
		for (String str : firstsSet) {
			String temp = "";
			for (int j = 0; j < sample.length; j++) {
				
				if (sample[j].substring(0, 1).equals(str)) {
					temp += sample[j];
				}
			}
			
			temp = str + ": " + temp + ". ";
			result = result + " " + temp;
		}
		
		System.out.println(result);
	}
}
