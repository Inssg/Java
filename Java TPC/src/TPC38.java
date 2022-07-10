import java.util.ArrayList;
import java.util.List;

import kr.tpc.BOOKDTO;

public class TPC38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BOOKDTO> list = new ArrayList<BOOKDTO>(1);
		list.add(new BOOKDTO("자바", 12000, "이지스", 500));
		list.add(new BOOKDTO("노드js", 14000, "교보", 390));
		list.add(new BOOKDTO("파이선", 12000, "에이콘", 520));
	
		for(int i = 0; i<list.size(); i++) {
			Object o =list.get(i);
			BOOKDTO vo = (BOOKDTO)o;
			System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
		}
	
	}
	

}
