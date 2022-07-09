import kr.tpc.MovieVO;

public class TPC17 {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int[] b= {10, 20, 30, 40, 50};
		
		int[] c= new int[] {10, 20, 30, 40, 50};
		
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
				
		}
		
		MovieVO mv =new MovieVO("비트", 12000, "연기자", 12, 1.3f);
		System.out.println(mv.toString());

		
		MovieVO[] marr=new MovieVO[3];
		marr[0]=new MovieVO("비트", 12000, "연기자1", 12, 1.3f);
		marr[1]=new MovieVO("비트1", 15500, "연기자2", 15, 1.2f);
		marr[2]=new MovieVO("비트2", 15000, "연기자3", 16, 1.1f);
		
		System.out.println(marr[0].toString());
		System.out.println(marr[1]);
		System.out.println(marr[2]);
		
		for(int i=0;i<marr.length;i++) {
			System.out.println(marr[i]);
		}
		
	}

}
