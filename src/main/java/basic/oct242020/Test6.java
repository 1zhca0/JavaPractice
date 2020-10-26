package basic.oct242020;

public class Test6 {
    public static int output(int source, int chars) {
        System.out.println("source: " + source + ", chars : " + chars);

        int oddSum = (source+1)/2;

        System.out.println("start from odd num: " + oddSum);
        if (chars == 1) {
            return oddSum;
        }else if (chars == 2) {
            return oddSum;
        }else {
            return (int) ((int) oddSum * source * Math.pow(Integer.toUnsignedLong(source+1), Integer.toUnsignedLong(chars - 2)));
        }
    }

    public static void main(String[] args) {
        int result = Test6.output(7, 7);
        System.out.println(result);
    }
}
