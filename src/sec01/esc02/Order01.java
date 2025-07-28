package sec01.esc02;

import java.io.Serializable;

public class Order01 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;
	private String product;
	private int quantity;
	
	
	
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order01(String orderid, String product, int quantity) {
		this.orderId = orderid;
		this.product = product;
		this.quantity = quantity;
	}

	public void print() {
		System.out.println("Order ID: " + orderId);
        System.out.println("Product : " + product);
        System.out.println("Quantity: " + quantity);
	}

}
