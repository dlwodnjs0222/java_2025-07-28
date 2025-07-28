package sec01.esc02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveOrder {

	public static void main(String[] args) {
		Order01 od = new Order01("ORD1234", "uggggg", 5);
		
		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("c:/tmp/order.dat"))){
			oos.writeObject(od);
			System.out.println("주문 객체 생성됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
