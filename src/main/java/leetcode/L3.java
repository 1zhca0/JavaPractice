package leetcode;

//无重复字符的最长子串
public class L3 {
    public static void main(String[] args) {

        String s = "abcabd";
        char flag;
        int finalResult = 0;


        for (int i = 0; i < s.length(); i++) {
            int result = 0;
        	flag = s.charAt(i);

            StringBuffer sb = new StringBuffer();
            sb.append(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {

                if (!sb.toString().contains(Character.toString(s.charAt(j)))){
                    sb.append(s.charAt(j));
                    continue;
                };
                break;
            }
            result = sb.toString().length();
            if (result >= finalResult) {
                finalResult = result;
            }
            System.out.println(sb.toString() + " " + flag + " " + result + " " + finalResult);
        }

        System.out.println(finalResult);
    }
}
class L3_v2{
    public static void main(String[] args) {
        int i = 1;
        i++;
        System.out.println(i);
    }
}