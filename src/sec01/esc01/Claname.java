package sec01.esc01;

class clasname2{
	int fel1;
	void met() {
		fel1 = 100;
	}
	
	static int fel2;
	static void met2() {
		
	}
}

public class Claname {
	
	
	public static void main(String[] args) {
		clasname2.met2();
		
		clasname2 cn2 = new clasname2();
		cn2.met();
	}
}
