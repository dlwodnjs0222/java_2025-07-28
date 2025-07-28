package sec01.esc01;

public class Order01 {
	private OrderStatus status;
	
	public Order01() {
		status = OrderStatus.PENDING;
	}
	
	public void nextStatus() {
		switch (status) {
		case PENDING:
			status = OrderStatus.PROCESSING;
			break;
		case PROCESSING:
			status = OrderStatus.SHIPPED;
			break;
		case SHIPPED:
			status = OrderStatus.DELIVERED;
			break;
		case DELIVERED:
			System.out.println("이미 배송 완료된 상품입니다");
			break;
		}

	}
	
	public void printstatus() {
		System.out.println("현재 주문 상태: " + status);
	}
}
