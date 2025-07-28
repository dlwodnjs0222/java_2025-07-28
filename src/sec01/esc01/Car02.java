package sec01.esc01;

public class Car02 {

	public static void main(String[] args) {
		Car01 mycar = new Car01();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("go");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("not need gas");
		}else {
			System.out.println("need gas");
		}
	}

}
