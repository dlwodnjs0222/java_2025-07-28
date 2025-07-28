package sec01.esc02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RoadOrder {

	public static void main(String[] args) throws Exception {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/tmp/order.dat"))) {
			Order01 od = (Order01) ois.readObject();
			System.out.println("주문 객체 파일 읽어옴");
			od.print();
		} catch (IOException | ClassCastException e) {
			e.printStackTrace();
		}
	}

}
