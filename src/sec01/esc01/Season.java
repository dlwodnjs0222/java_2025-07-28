package sec01.esc01;

public enum Season {
	SPRING("봄", 15), SUMMER("여름", 30), FALL("가을", 18), WINTER("겨울", -5);
	
	String name;
	int tamp;
	Season(String name, int tamp) {
		this.name = name;
		this.tamp = tamp;
	}
}
