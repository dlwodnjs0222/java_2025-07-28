package sec01.esc02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriterEX02 {

	public static void main(String[] args) throws IOException {
		Writer wi = new FileWriter("c:/tmp/test2.text");
		
		char arr[] = { 'A', 'B', 'C', 'D', 'E', 'F'};
		
		wi.write(arr);
		
		wi.flush();
		wi.close();
	}

}
