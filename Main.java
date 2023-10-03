package jankenpackage;

public class Main {
	public static int myhand ;
	public static int cpuhand ;

	public static void main(String[] args) {
		
		System.out.println("最初はグー、じゃんけん・・・");
		Myhand.myhand();
		Cpuhand.cpuhand();
		
		//switch文で各手を表示
		System.out.println("あなたの手は"+myhand);
		System.out.println("CPUの手は"+cpuhand);
		
		
		//myhandとcpuhandを比較して結果を表示
		//if ((myhand==0&&cpuhand==0)||) {
			
		
	}

}
