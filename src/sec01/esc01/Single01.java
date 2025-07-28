package sec01.esc01;

public class Single01 {
	
	private static Single01 s1 = new Single01();
	
	private Single01() {
		
	}
	
	static Single01 s1() {
		return s1;
	}
}
