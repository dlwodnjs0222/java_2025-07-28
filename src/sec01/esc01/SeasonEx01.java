package sec01.esc01;

public class SeasonEx01 {

	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println( s.name() +" "+ s.name + ", " + s.tamp);
		}
	}

}
