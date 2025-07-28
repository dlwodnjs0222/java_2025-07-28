package sec01.esc01;

import java.util.Scanner;

public class ScannerTest {
	
	static void met2() {
		
	}
	
	static String str;
	
	static void met(Scanner sc) {
		System.out.print("입력> ");
		str = sc.nextLine();
//		System.out.println(str);
//		met2();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScannerTest.met(sc);
		System.out.println(ScannerTest.str);
//		ScannerTest sct = new ScannerTest();
//		sct.met(sc);
//		System.out.println(sct.str);
	}

}
