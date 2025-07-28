package sec01.esc01;

public class BookQuiz02 {

	public static void main(String[] args) {
		int m = 0;
		int arr[] = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < arr.length; i++) {
			if (m < arr[i]) {
				m = arr[i];
			}
		}
		
		System.out.println("max :" + m);
	}

}
