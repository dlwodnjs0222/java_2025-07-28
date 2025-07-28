package sec01.esc01;

public class Computer01 {

	int s1(int ...values ) {
		int s = 0;
		for(int i : values) {
			s += i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Computer01 computer = new Computer01();
		int ret = computer.s1(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		System.out.println(ret);
	}
}
