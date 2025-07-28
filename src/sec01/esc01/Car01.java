package sec01.esc01;

public class Car01 {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("gas it is");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("run. (left: " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("stop. (left: " + gas + ")");
				return;
			}
		}
	}
}
