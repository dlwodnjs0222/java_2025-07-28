package sec01.esc01;

public class BookQuiz03 {

	public static void main(String[] args) {
		
		int s = 0;
		double a = 0.0;
		int c = 0;
		int arr[][] = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
			};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				s += arr[i][j];
				c++;
			}
		}
		
		a = (double) s / c;
		
		System.out.println("sum: " + s);
		System.out.println("avg: " + a);
	}

}
