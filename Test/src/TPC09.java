
public class TPC09 {
	public static void main(String[] args) {
		int a=30;
		int b=50;
		
		TPC09 tpc =new TPC09();
		
		int v=tpc.sum(a,b); 
		System.out.println(v);
		
	}
	
	public  int sum(int a, int b) {
		int v=a+b;
		return v;
	}
}
 