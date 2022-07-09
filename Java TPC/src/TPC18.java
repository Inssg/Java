import com.google.gson.Gson;

import kr.tpc.BookVO;

public class TPC18 {

	public static void main(String[] args) {
	
		// 1. Java에서 제공 해주는 class들 ..API
		//문자열 String
		java.lang.String str =new String("Apple");
		java.lang.System.out.println(str.toLowerCase());
		
		
		//2. 직접 만들어서 상용하는 class들 .. DTO/VO , DAO, Utility .. API
		kr.tpc.MyUtil my=new kr.tpc.MyUtil(); // import하면 더편리
		int sum= my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 class들 .. API
		//Gson -> json
		
		Gson g=new Gson();
		
		BookVO vo = new BookVO("자바", 13000, "영진", 5555);
		String json=g.toJson(vo);
		System.out.println(json);

	}

}
