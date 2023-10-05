package jankenpackage;

public class Main {
	public static int myhand ;
	public static int cpuhand ;
	public static String printMyhand;
	public static String printCpuhand;

	public static void main(String[] args) {
		
		System.out.println("最初はグー、じゃんけん・・・");
		Myhand.myhand();
		Cpuhand.cpuhand();
		System.out.println("あなたの手は"+printMyhand);
		System.out.println("CPUの手は"+printCpuhand);
		Winorlose.winorlose();
	
	}
}
