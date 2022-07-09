package kr.poly;

public interface Remocon { // 객체 생성 X ; RemoCon r = new Remocon();
	
	// 상수를 사용가능 -> static 키워드통해 객체 생성없이 사용가능하기때문
	//public static final int MAXCH=100; final 생략되있다
	int MAXCH=100;
	int MINCH=1;
	
	//추상 메서드
	public abstract void chUp();
	public void chDown();
	public void internet();

}
