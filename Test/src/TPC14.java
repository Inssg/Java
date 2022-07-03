import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		
		MemberVO m= new MemberVO();
		
		m.setName("홍길도");
		m.setAge(50);
		m.setTel("010-4444-2222");
		m.setAddr("서울");
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getTel());
		System.out.println(m.getAddr());
		
		
	/*
		m.name="홍길동";
		m.age=1000;
		m.tel="010-1111-1111";
		m.addr="서울";
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.tel);
		System.out.println(m.addr); */
		
	}

}
