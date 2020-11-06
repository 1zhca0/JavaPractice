package leetcode;

//无重复字符的最长子串
public class L3 {
    public static void main(String[] args) {
        String s = "abcabd";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
        	System.out.println("---");
        	char flag1 = s.charAt(i);
    		System.out.println("第" + i + " 次循环， --> " + flag1);
    		
    		for (int j = i; j < s.length(); j++) {
				
			}
    		
        }
    }
}
