package jankenpackage;

import java.util.Random;

public class Cpuhand {
	public static void cpuhand() {
		Random rand = new Random();
		int cpuhand = rand.nextInt(3);
		Main.cpuhand = cpuhand;
		
			switch(Main.cpuhand) {
			case 0:
				Main.printCpuhand = "グー";
				break;
			case 1:
				Main.printCpuhand = "パー";
				break;
			case 2:
				Main.printCpuhand = "チョキ";
				break;
			}
		
	}
}
