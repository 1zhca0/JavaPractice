package basic._201905_;

public class P0503 {
	
	/*
	 * 	类中有一个方法，方法名makePi;
		返回一个包含pi(参考Math.PI)的前n位数字的整数数组长度，n为方法接收的参数。
		例如：n为3，则返回{3，1，4}。
	 */
	public static void getNumbers(int n) {
		double pi = Math.PI;
		String piString = String.valueOf(pi);
		System.out.println(piString);
		
		
		
		for (int i = 2; i < piString.length(); i++) {
			System.out.println(piString.substring(i, i+1));
		}
	}
	
	public static void main(String[] args) {
		new P0503();
		P0503.getNumbers(0);
	}
}
