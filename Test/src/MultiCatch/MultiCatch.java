package MultiCatch;
public class MultiCatch {
	public static void main(String[] args) {

try {
	System.out.println(3 / 0);
	int num = Integer.parseInt("10A");
}
catch (ArithmeticException e) {
	System.out.println("숫자는 0으로 나눌수 없다.");
}
catch (NumberFormatException e) {
	System.out.println("숫자로 바꿀수 없습니다.");
}
finally {
	System.out.println("프로그램 종료");

}
	}
}