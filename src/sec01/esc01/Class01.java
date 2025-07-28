package sec01.esc01;

class G{
	void gmet() {
		//집합 관계
	}
}

class H{
	void hemt() {
		G g = new G();
		g.gmet();
		//사용관계
	}
}

interface D{
	//집합 관계
}

class E implements D{
	//상속 관계
}

class F implements D{
	//상속 관계
}

class A {
	//클래스 
	//집합 관계
}

class B{
	A a;
	//집합 관계
}

class C extends A{
	//상속 관계
}

public class Class01 {

	public static void main(String[] args) {
		
	}

}
