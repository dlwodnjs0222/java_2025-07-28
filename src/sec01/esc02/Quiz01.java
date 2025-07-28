package sec01.esc02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Order01 od = null;
		
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 주문 입력 | 2. 주문 저장 | 3. 주문 불러오기 | 4. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("입력>");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.print("아이디> ");
				String orderId = sc.nextLine();
				
				System.out.print("상품> ");
				String product = sc.nextLine();
				
				System.out.print("수량> ");
				int quantity = Integer.parseInt(sc.nextLine());
				
				od = new Order01(orderId, product, quantity);
				break;
				
			case 2:
				if(od != null) {
					try (ObjectOutputStream oos = 
							new ObjectOutputStream(new FileOutputStream("c:/tmp/order.dat"))){
						oos.writeObject(od);
						System.out.println("주문 저장됨");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("주문 인력 먼저 하세요");
				}
				break;
			case 3:
				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/tmp/order.dat"))) {
					od = (Order01) ois.readObject();
					System.out.println("주문 객체 파일 읽어옴");
					od.print();
				} catch (IOException | ClassCastException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
