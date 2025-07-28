package sec01.esc02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEX01 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/tmp/test1.db");
		
		byte arr[] = {30, 40, 50};
		os.write(arr);
		
		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		
//		os.write(a);
//		os.write(b);
//		os.write(c);
//		
		os.flush();
		os.close();
	}

}
