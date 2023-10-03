package jankenpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Myhand {
	public static void myhand(){
		System.out.println("出す手の数字を入力してください＞＞＞");
		System.out.println(" 0:グー");
		System.out.println(" 1:パー");
		System.out.println(" 2:チョキ");
		
		for (int i = 0; i < 1; i++) {
			try {
				Scanner sc = new Scanner(System.in);
				int myhand = sc.nextInt();	
				if (myhand == 0||myhand == 1||myhand == 2) {
					;
				}else {
					i--;
					System.out.println("0~1の数字で入力してください");
				}
				
				Main.myhand = myhand;
				
			}catch(InputMismatchException e) {
				i--;
				System.out.println("0~1の数字で入力してください");
			}
		}
	}
}
