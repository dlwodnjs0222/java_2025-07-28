package sec01.esc01;

public class Single02 {
	
	public static void main(String[] args) {
		Single01 o1 = Single01.s1();
		Single01 o2 = Single01.s1();

		if(o1 == o2) {
			System.out.println("같은 싱글턴");
		}else {
			System.out.println("다른 싱글턴");
		}
	}
}
