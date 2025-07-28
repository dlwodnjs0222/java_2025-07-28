package sec01.esc01;

public class Member {
	String name;
	String phone;
	String address;
	int sal;
	
	public Member() {
		
	}
	
	public Member(String name, String phone) {
		this(name, phone, "서울", 100);
	}
	
	
	public Member(String name, String phone, String address) {
		this(name, phone,address, 500);
	}



	public Member(String name, String phone, String address, int sal) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sal = sal;
		System.out.println("uhhhhhh");
	}



	public static void main(String[] args) {
		//Member member = new Member();
		
	}
}
