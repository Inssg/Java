package BitwiseOperator;

public class BitwiseOperator {
	public static void main(String[] args) {
		int data = 13;
		System.out.println(Integer.toBinaryString(data)); // 10진수 값을 2진수,8진수,16진수로변환
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		System.out.println(Integer.parseInt("1101", 2)); // 2진수,8진수,16진수 값을 10진수로 변환
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("0D", 16));
		System.out.println();
	}
}
