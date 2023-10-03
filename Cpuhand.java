package jankenpackage;

import java.util.Random;

public class Cpuhand {
	public static void cpuhand() {
		Random rand = new Random();
		int cpuhand = rand.nextInt(3);
		Main.cpuhand = cpuhand;
	}
	

}
