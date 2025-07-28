package sec01.esc01;

public class EnumEx01 {

	public static void main(String[] args) {
		Day todat = Day.MONDAY;
		switch (todat) {
		case MONDAY: {
			System.out.println("월요일입니다");
			break;
		} case SUNDAY:
			System.out.println("주말 일요일입니다");
			break;
		default:
			System.out.println("평일입니다");
		}
	}

}
