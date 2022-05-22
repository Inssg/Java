package ThrowsException;

class B {
	void abc() {
		try {
			bcd(); //InterrputedException
		} catch (InterruptedException | ClassNotFoundException e) {
			// 예외 처리구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object"); // ClassNotFoundException
		Thread.sleep(1000); //InterruptedException
	}
}
public class ThrowsException {
	public static void main(String[] args) {
		
	}
}
